/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aca_poo;

import javax.swing.JOptionPane;

/**
 *
 * @author serrokr
 */
public class TablaMultiplicar {

    int tabla;

    public TablaMultiplicar(int tabla) {
        this.tabla = tabla;
    }
    
    public void Multiplicar (){
        String resultado = "";
        for (int i = 1; i <= 10; i++){
            resultado += tabla + " x " + i + " = " + tabla * i + "\n"; 
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

}
