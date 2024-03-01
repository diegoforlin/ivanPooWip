package poo.transferencia;

import poo.conta.Conta;

import java.math.BigDecimal;

public interface TransferenciaBancaria {

    BigDecimal ted(BigDecimal valor, Conta conta);
    BigDecimal doc(BigDecimal valor, Conta conta);
    BigDecimal pix(BigDecimal valor, Conta conta);
}
