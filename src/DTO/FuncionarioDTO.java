package DTO;

public class FuncionarioDTO {
    private int Id_funcionario;
    private String Nome_funcionario;
    private String Senha_funcionario;

    public String getNomeRegistro_funcionario() {
        return NomeRegistro_funcionario;
    }
    public void setNomeRegistro_funcionario(String nomeRegistro_funcionario) {
        NomeRegistro_funcionario = nomeRegistro_funcionario;
    }
    public String getSenhaRegistro_funcionario() {
        return SenhaRegistro_funcionario;
    }
    public void setSenhaRegistro_funcionario(String senhaRegistro_funcionario) {
        SenhaRegistro_funcionario= senhaRegistro_funcionario;
    }

    private String NomeRegistro_funcionario;
    private String SenhaRegistro_funcionario;


    public int getId_funcionarioo() {
        return Id_funcionario;
    }
    public void setId_funcionario(int id_funcionario) {
        Id_funcionario = id_funcionario;
    }
    public String getNome_funcionario() {
        return Nome_funcionario;
    }
    public void setNome_funcionario(String nome_funcionario) {
        Nome_funcionario = nome_funcionario;
    }
    public String getSenha_funcionario() {
        return Senha_funcionario;
    }
    public void setSenha_funcionario(String senha_funcionario) {
        Senha_funcionario = senha_funcionario;
    }


}
