package Banco;
 
import Dados.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
 
public class UserBD 
{
    Connection connection = null;
 
        public boolean inserirUser(Login login) 
    {
        System.out.println("Inserir Usuário");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
        try 
        {
            stmt = connection.createStatement();
 
            String sql = "INSERT INTO usuarios(nome,senha) "
            		   + "VALUES ('"+ login.getNome() + "','"+ login.getSenha()+ "')";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            return true;
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        } 
        finally 
        {
            try 
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }  
 
    
    public boolean atualizarUser(Login login, String nomeAlterar) 
    {
        System.out.println("Atualizar Usuário");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
        try
        {
            stmt = connection.createStatement();
 
            
            String sql = "UPDATE usuarios SET nome='"+login.getNome()+"'," + 
                         "senha='"+login.getSenha()+
                         "' WHERE nome='"+nomeAlterar+"';";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }

    public String relatorioUser()
    {
    	String dados = "";
    	connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM usuarios");
            while (res.next())
            {   
                                dados += "\n"+res.getString("nome");
                                dados += "\n"+res.getString("senha");
				dados += "\n____________________________________________________________________";				
            }
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    	return dados;
    }

 
    public ArrayList<Login> getListaUser() 
    {
        ArrayList<Login> listaLogin = new ArrayList<Login>();
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;
        try
        {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM usuarios");
            while (res.next())
            {
                Login login = new Login(res.getString("nome"), res.getString("senha"));
                listaLogin.add(login);
            }
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        finally
        {
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return listaLogin;
    } 
    public boolean excluirUser(Login login) 
    {
    	boolean status = true;
        System.out.println("Excluir Usuário do Sistema");
        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;
        try 
        {
            stmt = connection.createStatement();
            String sql = "DELETE FROM usuarios WHERE nome='"+login.getNome()+"'";
            System.out.println("SQL: " + sql);
            if(stmt.executeUpdate(sql)!=0)
            {
            	status = true;	
            }
            else
            {
            	status = false;
            }
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally 
        {
            try
            {
                stmt.close();
                connection.close();
            } 
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return status;
    }


}