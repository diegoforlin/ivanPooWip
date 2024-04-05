package poo.cartao;

import poo.conta.Conta;

import java.math.BigDecimal;
import java.util.Date;

import static poo.conta.ContaService.saldo;

public abstract class Cartao {

    public static String numeroCartao;
    public static String dataValidadeCartao;
    public static String senhaCartao;
    private String cvcCartao;
    private boolean bloqueado;
    private BigDecimal saldo;

    public Cartao(String numeroCartao, String dataValidadeCartao, String cvcCartao, String senhaCartao, boolean bloqueado) {
        this.numeroCartao = numeroCartao;
        this.dataValidadeCartao = dataValidadeCartao;
        this.cvcCartao = cvcCartao;
        this.senhaCartao = senhaCartao;
        this.bloqueado = bloqueado;
    }

    public Cartao() {

    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        Cartao.numeroCartao = numeroCartao;
    }

    public String getDataValidadeCartao() {
        return dataValidadeCartao;
    }

    public void setDataValidadeCartao(String dataValidadeCartao) {
        Cartao.dataValidadeCartao = dataValidadeCartao;
    }

    public String getCvcCartao() {
        return cvcCartao;
    }

    public void setCvcCartao(String cvcCartao) {
        this.cvcCartao = cvcCartao;
    }

    public String getSenhaCartao() {
        return senhaCartao;
    }

    public void setSenhaCartao(String senhaCartao) {
        if(senhaCartao.length() == 6){
            this.senhaCartao = senhaCartao;
            System.out.println("Senha aprovada.");
        }
        System.out.println("Senha inválida.");
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
        }

