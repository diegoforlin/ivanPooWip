package poo.cartao;

import java.math.BigDecimal;

public class CartaoDebito extends Cartao {

    public CartaoDebito(String numeroCartao, String dataValidadeCartao, String cvcCartao, String senhaCartao, boolean bloqueado) {
        super(numeroCartao, dataValidadeCartao, cvcCartao, senhaCartao, bloqueado);


    }
}
