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
public class Salarios {
    double salario1;
    double salario2;
    
    public Salarios (double salario1, double salario2){
        this.salario1 = salario1;
        this.salario2 = salario2;
    }
    
    public void salarioMayor (){
        if (salario1 == salario2){
            JOptionPane.showMessageDialog(null, "Ambos empleados ganan lo mismo");
        }else if (salario1>salario2){
            JOptionPane.showMessageDialog(null, "El salario del primer empleado es mayor que el salario del segundo empleado");
        }else{
            JOptionPane.showMessageDialog(null, "El salario del segundo empleado es mayor que el salario del primer empleado");
        }
    }
}
