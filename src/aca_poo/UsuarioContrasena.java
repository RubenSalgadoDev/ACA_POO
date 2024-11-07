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
public class UsuarioContrasena {
    String usuario;
    String pass;
    
    public UsuarioContrasena (){
        usuario = "Ruben.Salgado";
        pass = "A1B2C3d4";
    }
    
    public void comprobarAcceso(String user, String passwd){
        if (user.equals(usuario) && passwd.equals(pass)){
            JOptionPane.showMessageDialog(null, "Credenciales correctas, Bienvenido Ruben");
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }
    
}
