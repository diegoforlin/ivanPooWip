package poo.cartao;
public class CartaoDebito extends Cartao {
    public CartaoDebito(String numeroCartao, String dataValidadeCartao, String cvcCartao, String senhaCartao, boolean bloqueado) {
        super(numeroCartao, dataValidadeCartao, cvcCartao, senhaCartao, bloqueado);
    }
}
