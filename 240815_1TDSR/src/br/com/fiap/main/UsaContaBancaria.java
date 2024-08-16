package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.SaldoInsuficienteExcetion;

public class UsaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000000.0);
        try {
            conta.sacar(1500.00);
        } catch (SaldoInsuficienteExcetion e) {
            System.out.println("Erro: " + e.getMessage());
            //e.printStackTrace();
        }
    }
}
