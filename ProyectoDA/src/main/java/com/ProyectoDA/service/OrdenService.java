
package com.ProyectoDA.service;

import com.ProyectoDA.domain.Orden;
import java.util.List;


public interface OrdenService {
    
    List<Orden> findAll();
    Orden save (Orden orden);
    String generarNumeroOrden();
    
}
