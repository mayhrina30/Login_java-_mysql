
package com.mycompani.login.logica;

import com.micompany.login.persistence.ControlladorPersistencia;
import java.util.List;


public class Controladora {
  ControlladorPersistencia controlPersis = new ControlladorPersistencia();  

    public String validarUsuario( String usuario,String contrasenia) {
        
        String mensaje = "";
        
        List<Usuario> listaUsuario = controlPersis.traerUsuarios();
        for(Usuario usu : listaUsuario){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContraseña().equals(contrasenia)){
                    mensaje= "Usuario y contraseña correcto Bienvenidos";
                    
                    
                }
                else{
                    mensaje = "contraseña incorrecta";
                    
                }
            }
                else{
                        mensaje = "usuario no encontrado";
                }
            }
        return mensaje;
        
        
    }
    
}
