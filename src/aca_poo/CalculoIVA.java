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
public class CalculoIVA {

    double subtotal;
    double IVA;
    double total;

    public CalculoIVA(double subtotal) {
        this.subtotal = subtotal;
    }

    public void CalcularPrecio() {
        IVA = subtotal * 0.19;
        total = IVA + subtotal;
        JOptionPane.showMessageDialog(null, "Subtotal........... " + subtotal + "\n"
                + "IVA................ " + IVA + "\n"
                + "Total.............. " + total);
    }
}
