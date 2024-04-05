package poo.cartao;

import java.util.Date;

public class Cliente {
    public static String titular;
    public static String nome;
    public static String cpf;
    public static String dataAniversario;

    public Cliente() {
        this.nome = getNome();
        this.cpf = getCpf();
        this.dataAniversario = getDataAniversario();
    }

    public static String getNome() {
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


