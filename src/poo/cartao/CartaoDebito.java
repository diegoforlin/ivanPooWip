package poo.cartao;

import java.math.BigDecimal;
import java.util.Date;

public class CartaoDebito extends Cartao {

    private BigDecimal chequeEspecial;

    public CartaoDebito(String numeroCartao, Date dataValidadeCartao, String cvcCartao, String senhaCartao, boolean bloqueado) {
        super(numeroCartao, dataValidadeCartao, cvcCartao, senhaCartao, bloqueado);
    }
}
