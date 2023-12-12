
package com.ProyectoDA.dao;

import com.ProyectoDA.domain.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer>{
    Optional<Usuario>findByEmail(String email);
    
}
