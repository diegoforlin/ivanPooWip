package poo.cartao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class CartaoCredito extends Cartao {

    private BigDecimal limite = BigDecimal.valueOf(5000);
    private BigDecimal limiteUtilizado;


    public CartaoCredito(String numeroCartao, Date dataValidadeCartao, String cvcCartao, String senhaCartao, boolean bloqueado) {
        super(numeroCartao, dataValidadeCartao, cvcCartao, senhaCartao, bloqueado);
    }
}
