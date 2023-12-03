
package com.ProyectoDA.service;

import com.ProyectoDA.domain.Usuario;
import java.util.Optional;

public interface UsuarioService {
    
    Optional<Usuario> findById(Integer id);

    
}
