package Dados;

public class Pessoa 
{
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String peso;
    private String altura;
    private String sexo;
    private String plano;
    private String objetivo;
    private String idade;

    public Pessoa()
    {
        this.nome = null;
        this.endereco = null;
        this.telefone = null;
        this.email = null;
        this.peso = null;
        this.altura = null;
        this.sexo = null;
        this.plano = null;
        this.objetivo = null;
        this.idade = null;
    }

    public Pessoa(String nome, String endereco, String telefone, String email, String peso, String altura, String sexo, String plano, String objetivo, String idade) 
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.plano = plano;
        this.objetivo = objetivo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
