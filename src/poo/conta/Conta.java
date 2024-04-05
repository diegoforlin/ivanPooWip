package poo.conta;

import poo.transferencia.TransferenciaBancaria;

import java.math.BigDecimal;

//Abstração
public abstract class Conta implements TransferenciaBancaria {

    //atributo protected
    protected static BigDecimal saldo = BigDecimal.valueOf(1000);


    Conta(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public static BigDecimal consultaSaldo() {
        return saldo;
    }

    public BigDecimal sacar(BigDecimal valor){
        System.out.println("sacando R$" + valor + " Reais PF");


        saldo = this.saldo.subtract(aplicaTaxaSaque(valor));

        return saldo;
    }

    //sobrecarga --> polimorfismo
    public BigDecimal depositar(Integer valor) {
        System.out.println("depositando R$" + valor + " Reais Pf");

        saldo = this.saldo.add(BigDecimal.valueOf(valor));

        return saldo;
    }

    //sobrecarga --> polimorfismo
    public BigDecimal depositar(Long valor) {
        System.out.println("depositando R$" + valor + " Reais Pf");

        saldo = this.saldo.add(BigDecimal.valueOf(valor));

        return saldo;
    }

    //sobrecarga --> polimorfismo
    public BigDecimal depositar(BigDecimal valor) {
        System.out.println("depositando R$" + valor + " Reais Pf");

        saldo = this.saldo.add(valor);

        return saldo;
    }

    //metodo abstrato
    public abstract BigDecimal taxaSaque();


    //metodo privado
    private BigDecimal aplicaTaxaSaque(BigDecimal valorSaque){
        return valorSaque.multiply(taxaSaque());
    }

    @Override
    public BigDecimal ted(BigDecimal valor, Conta conta){
        System.out.println("FAZENDO UM TED");

        conta.depositar(valor);

        this.saldo = this.saldo.subtract(valor);

        return this.saldo;
    }

    @Override
    public BigDecimal doc(BigDecimal valor, Conta conta){
        System.out.println("FAZENDO UM DOC");

        conta.depositar(valor);

        this.saldo = this.saldo.subtract(valor);

        return this.saldo;
    }

    @Override
    public BigDecimal pix(BigDecimal valor, Conta conta) {
        System.out.println("FAZENDO UM PIX");

        conta.depositar(valor);

        this.saldo = this.saldo.subtract(valor);

        return this.saldo;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    private BigDecimal chequeEspecial;

}
