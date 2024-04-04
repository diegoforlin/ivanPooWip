package poo.cartao;

import java.util.Date;

public class Cliente {
    public static String nome;
    public static String cpf;
    public static String dataAniversario;

    public Cliente() {
        nome = nome;
        cpf = cpf;
        dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = String.valueOf(dataAniversario);
    }
}


