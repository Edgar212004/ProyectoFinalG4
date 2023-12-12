
package com.ProyectoDA.service;

import com.ProyectoDA.domain.Orden;
import com.ProyectoDA.domain.Usuario;
import java.util.List;
import java.util.Optional;

public interface OrdenService {
    
    List<Orden> findAll();
    Orden save (Orden orden);
    String generarNumeroOrden();
    List<Orden> findByUsuario (Usuario usuario);
    Optional<Orden>findById(Integer id);
}
