package br.com.fiap.bean;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double quantia)  throws SaldoInsuficienteExcetion {
        if(quantia > saldo) {
            throw new SaldoInsuficienteExcetion("Saldo insuficiente ara realizar o saque");
        }
        saldo -= quantia;
    }
}
