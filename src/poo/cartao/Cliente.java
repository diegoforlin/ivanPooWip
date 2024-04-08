package poo.cartao;

import java.util.Date;

public class Cliente {
    public String titular;
    public String nome;
    public String cpf;
    public String dataAniversario;

    public Cliente() {
        this.nome = getNome();
        this.cpf = getCpf();
        this.dataAniversario = getDataAniversario();
        this.titular = getTitular();
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getTitular() {
        return titular;
    }
}


