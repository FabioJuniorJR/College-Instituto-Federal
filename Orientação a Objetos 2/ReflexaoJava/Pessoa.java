package ReflexaoJava;

import javax.xml.crypto.Data;

public class Pessoa {
    private String cpf;
    private String nome;
    private String rg;
    private String dataNascimento;
    private String rua;
    private int numeroEnd;
    private String cep;
    private int apto;

    public Pessoa(/*String cpf, String nome, String rg, String dataNascimento, String rua, String numeroEnd, String cep, String apto*/) {
        /*this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.rua = rua;
        this.numeroEnd = numeroEnd;
        this.cep = cep;
        this.apto = apto;*/
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroEnd() {
        return numeroEnd;
    }

    public void setNumeroEnd(int numeroEnd) {
        this.numeroEnd = numeroEnd;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getApto() {
        return apto;
    }

    public void setApto(int apto) {
        this.apto = apto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa \n[cpf = " + cpf + ",\n nome = " + nome + ",\n rg = " + rg + ",\n dataNascimento = " + dataNascimento + ",\n rua = "
                + rua + ",\n numeroEnd = " + numeroEnd + ",\n cep = " + cep + ",\n apto = " + apto + "]";
    }

    



    
}
