package br.com.fiap.main;

import javax.swing.*;
import java.awt.*;

public class ExemploTrCathFinally {
    public static void main(String[] args) {
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o valor primeiro número. Faixa permitida de 1 a 50");
            int num1 = Integer.parseInt(aux1);
            if (num1 < 1 || num1 > 50) {
                throw new Exception("Número informado fora da faixa permitia.");
            }
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do segundo número");
            int num2 = Integer.parseInt(aux2);
            JOptionPane.showMessageDialog(null, "SOMA = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicão = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 / num2));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de conversão!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro de conversão!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {}
        JOptionPane.showMessageDialog(null, "FIm do prorama" );
    }
}
