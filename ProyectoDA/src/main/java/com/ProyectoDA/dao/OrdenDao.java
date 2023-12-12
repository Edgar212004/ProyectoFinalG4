
package com.ProyectoDA.dao;

import com.ProyectoDA.domain.Orden;
import com.ProyectoDA.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenDao extends JpaRepository<Orden, Integer> {
    
    List<Orden> findByUsuario (Usuario usuario);
}
