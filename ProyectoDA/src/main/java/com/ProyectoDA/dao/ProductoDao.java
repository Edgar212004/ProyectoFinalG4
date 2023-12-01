
package com.ProyectoDA.dao;


import com.ProyectoDA.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Integer>{
    
}

