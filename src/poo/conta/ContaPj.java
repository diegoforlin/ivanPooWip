package poo.conta;

import com.sun.jdi.InternalException;

import java.math.BigDecimal;

//herança
public class ContaPj extends Conta{

    private String cnpj;

    public ContaPj() {
        super(BigDecimal.ZERO);
        cnpj = "";
    }
    @Override
    //subscrita --> polimorfismo
    public BigDecimal taxaSaque() {
        return BigDecimal.valueOf(1 + 0.10);
    }

    @Override
    public BigDecimal ted(BigDecimal valor, Conta conta) {
        throw new InternalException();
    }

    @Override
    public BigDecimal getSaldo(){
        System.out.println("Aplicando taxa de R$1.OO Para visualização do saldo");
        this.saldo = this.saldo.subtract(BigDecimal.ONE);

        return this.saldo;
    }

    //encapsulamento
    public void setCnpj(String cnpj){
        if(cnpj.length() == 14){
            this.cnpj = cnpj;
            System.out.println("CNPJ salvo com sucesso");
        }
        System.out.println("ERRO ao salvar CNPJ");
    }
}
