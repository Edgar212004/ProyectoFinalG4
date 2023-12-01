package com.ProyectoDA.service.Impl;

import com.ProyectoDA.dao.ProductoDao;
import com.ProyectoDA.domain.Producto;
import com.ProyectoDA.service.ProductoService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{
    
      @Autowired
    private ProductoDao productoDao;
    
    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productoDao.findById(id);
    }

    @Override
    public void update(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productoDao.deleteById(id);
    }  
    
}