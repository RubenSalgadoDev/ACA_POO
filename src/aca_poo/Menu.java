package aca_poo;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        int opcion = 0;
        while(opcion != 6){
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a la Actividad de Construcción Aplicada del Curso de Programación Orientada a Objetos\n "
                + "                               ********** Por favor selecciona la opción deseada: **********                        \n\n"
                + "                                    1. Calculo del IVA y el Total a pagar de un producto\n\n"
                + "                                                       2. Averiguar el Salario Mayor\n\n"
                + "                                                    3. Validar Usuario y Contraseña\n\n"
                + "                                                                    4. Multiplos\n\n"
                + "                                                            5. Tabla de multiplicar\n\n"
                + "                                                                        6. Salir"
        ));
        switch (opcion) {
            case 1:
                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el valor del producto sin IVA"));
                CalculoIVA producto = new CalculoIVA(valor);
                producto.CalcularPrecio();
                break;

            case 2:
                double salario1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el salario del primer empleado"));
                double salario2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el salario del segundo empleado"));
                Salarios salarios = new Salarios(salario1, salario2);
                salarios.salarioMayor();
                break;
                
            case 3:
                String usuario = JOptionPane.showInputDialog(null, "Por favor ingrese su usuario");
                String passw = JOptionPane.showInputDialog(null, "Por favor ingrese su contraseña");
                UsuarioContrasena validacion = new UsuarioContrasena();
                validacion.comprobarAcceso(usuario, passw);
                break;
                
            case 4:
                int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el limite de multiplos"));
                Multiplos multiplos = new Multiplos();
                multiplos.Calculo(limite);
                break;
                
            case 5:
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que tabla desea imprimir?"));
                TablaMultiplicar tabla = new TablaMultiplicar(numero);
                tabla.Multiplicar();
                break;
            
            case 6:
                JOptionPane.showMessageDialog(null, "Hasta Luego");
        }
    }}
}
