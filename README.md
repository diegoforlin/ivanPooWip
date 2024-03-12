Exercício: Sistema de Gerenciamento de Cartões Bancários
Suponha que você está desenvolvendo um sistema de gerenciamento de cartões bancários para um banco. O sistema deve ser capaz de lidar com diferentes tipos de cartões, como débito e crédito. Cada cartão tem atributos específicos e métodos para realizar operações comuns, como confirmação de senha, consulta de saldo, realização de compras e bloqueio do cartão em caso de perda.

Requisitos:
Implemente uma classe abstrata Cartao com os seguintes atributos e métodos:

Atributos:

numero: número do cartão
titular: nome do titular do cartão
dataValidade: data de validade do cartão
cvc: código de segurança do cartão
senha: senha do cartão
bloqueado: indica se o cartão está bloqueado ou não
Métodos abstratos:

confereSenha(senhaDigitada): método que verifica se a senha digitada corresponde à senha do cartão.
consultaSaldo(): método que retorna o saldo disponível no cartão.
compra(valor): método que realiza uma compra com o cartão.
bloquearCartao(): método que bloqueia o cartão em caso de perda ou roubo.
Crie uma classe CartaoDebito que herda da classe Cartao, sem adicionar novos atributos ou métodos.

Implemente uma classe CartaoCredito que herda da classe Cartao com os seguintes atributos e métodos adicionais:

Atributos:

limite: limite total do cartão de crédito
limiteUtilizado: valor total utilizado do limite de crédito
Métodos:

getLimiteDisponivel(): retorna o limite disponível para uso no cartão de crédito.
getLimiteUtilizado(): retorna o valor total utilizado do limite de crédito.
getLimite(): retorna o limite total do cartão de crédito.


Vamos adicionar a funcionalidade de cheque especial à classe Conta, onde o cartão de débito associado à conta pode usar o cheque especial