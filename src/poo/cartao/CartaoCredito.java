package poo.cartao;
import java.math.BigDecimal;

public class CartaoCredito extends Cartao {

    private BigDecimal limite = BigDecimal.valueOf(5000);
    private BigDecimal limiteUtilizado;


    public CartaoCredito(String numeroCartao, String dataValidadeCartao, String cvcCartao, String senhaCartao) {
    }

    public CartaoCredito() {
        super();
    }

    private BigDecimal exibeLimite() {
            return limite;
        }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public BigDecimal getLimiteUtilizado() {
        return new BigDecimal(String.valueOf(limiteUtilizado)).subtract(limite);
    }

    public void setLimiteUtilizado(BigDecimal limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }
}

