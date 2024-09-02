
package com.mycompany.login.persistence;

import com.mycompany.login.logica.Usuario;
import java.util.List;


public class ControlladorPersistencia {
   UsuarioJpaController UsuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return UsuJpa.findUsuarioEntities();
        //select  * from usuarios
        
    }
    
    
   
   
   
   
}
