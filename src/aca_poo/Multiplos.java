package aca_poo;

import javax.swing.JOptionPane;

public class Multiplos {
    int numero = 5;
    public void Calculo(int limite){
        String resultado = "";
        for (int i = 1; i <= limite; i++){
            resultado += 5 * i + "\n";
        }
        JOptionPane.showMessageDialog(null,resultado);     
    }
}
