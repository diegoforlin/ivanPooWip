package poo.cartao;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Cartao {

    private String numeroCartao;
    private Date dataValidadeCartao;
    private String cvcCartao;
    private String senhaCartao;
    private boolean bloqueado;
    private BigDecimal saldo;

    public Cartao(String numeroCartao, Date dataValidadeCartao, String cvcCartao, String senhaCartao, boolean bloqueado) {
        this.numeroCartao = numeroCartao;
        this.dataValidadeCartao = dataValidadeCartao;
        this.cvcCartao = cvcCartao;
        this.senhaCartao = senhaCartao;
        this.bloqueado = bloqueado;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Date getDataValidadeCartao() {
        return dataValidadeCartao;
    }

    public void setDataValidadeCartao(Date dataValidadeCartao) {
        this.dataValidadeCartao = dataValidadeCartao;
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
        this.senhaCartao = senhaCartao;
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
