package poo.cartao;
import java.math.BigDecimal;

public abstract class Cartao {

    public String numeroCartao;
    public String dataValidadeCartao;
    public String senhaCartao;
    private String cvcCartao;
    public BigDecimal saldo;

    public Cartao() {
        this.numeroCartao = getNumeroCartao();
        this.dataValidadeCartao = getDataValidadeCartao();
        this.cvcCartao = getCvcCartao();
        this.senhaCartao = getSenhaCartao();
        this.saldo = getSaldo();
    }
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDataValidadeCartao() {
        return dataValidadeCartao;
    }

    public void setDataValidadeCartao(String dataValidadeCartao) {
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
        if (senhaCartao.length() == 6) {
            this.senhaCartao = senhaCartao;
            System.out.println("Senha aprovada.");
        }
        System.out.println("Senha inválida.");
    }
}

