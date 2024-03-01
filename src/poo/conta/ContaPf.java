package poo.conta;

import java.math.BigDecimal;

//herança
public class ContaPf extends Conta{

    private String cpf;

    public ContaPf() {
        super(BigDecimal.ZERO);
        cpf = "";
    }

    @Override
    //subscrita --> polimorfismo
    public BigDecimal taxaSaque() {
        return BigDecimal.valueOf(1 + 0.03);
    }

    //encapsulamento
    public void setCpf(String cpf){
        if(cpf.length() == 11){
            this.cpf = cpf;
            System.out.println("CPF salvo com sucesso");
        }
        System.out.println("ERRO ao salvar CPF");
    }

}
