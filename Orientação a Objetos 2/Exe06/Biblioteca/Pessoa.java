package Biblioteca;

import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Pessoa {
    String name;
    String cpf;
    String rg;
    LocalDate dataNascimento;
    String filiacaoPaterna;
    String filiacaoMaterna;
    
    /*public Pessoa(String name, String cpf, String rg, Data dataNascimento) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getFiliacaoPaterna() {
        return filiacaoPaterna;
    }

    public void setFiliacaoPaterna(String filiacaoPaterna) {
        this.filiacaoPaterna = filiacaoPaterna;
    }
    public String getFiliacaomaterna() {
        return filiacaoMaterna;
    }

    public void setFiliacaoMaterna(String filiacaoMaterna) {
        this.filiacaoMaterna = filiacaoMaterna;
    }

    @Override
    public String toString() {
        return "Pessoa [name=" + name + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento
                + ", filiacaoPaterna=" + filiacaoPaterna + ", filiacaoMaterna=" + filiacaoMaterna + "]";
    }

    

}
