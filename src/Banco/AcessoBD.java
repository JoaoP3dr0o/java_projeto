package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Login;

public class AcessoBD
{

    Connection connection = null;

    public boolean verificaAcesso(Login login) 
    {
    Connection connection = null;
    Statement stmt = null;
    ResultSet rs = null;
 
    try 
    {
        connection = Conexao.getInstance().getConnection();
 
        // Execute the SQL query
        String sql = "SELECT * FROM usuarios WHERE nome = '" + login.getNome() + "' AND senha = '" + login.getSenha() + "'";
        stmt = connection.createStatement();
        rs = stmt.executeQuery(sql);
 
        // Check if a single row is found (valid login)
        if (rs.next()) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    } 
        catch (SQLException e) 
        {
        System.out.println("Error verifying access: " + e.getMessage());
        return false;
        } 
        finally 
        {
        // Close resources in reverse order
        if (rs != null) 
        {
            try 
            {
                rs.close();
            } 
            catch (SQLException e) 
            {
                System.out.println("Error closing ResultSet: " + e.getMessage());
            }
        }
        if (stmt != null) 
        {
            try 
            {
                stmt.close();
            } 
            catch (SQLException e) 
            {
                System.out.println("Error closing Statement: " + e.getMessage());
            }
        }
        if (connection != null) 
        {
            try 
            {
                connection.close();
            } 
            catch (SQLException e) 
            {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }

 
        }
    }
}
    

