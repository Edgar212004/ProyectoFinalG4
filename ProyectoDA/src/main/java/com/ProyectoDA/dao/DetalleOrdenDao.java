
package com.ProyectoDA.dao;

import com.ProyectoDA.domain.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleOrdenDao extends JpaRepository<DetalleOrden, Integer>{
    
    
    
}