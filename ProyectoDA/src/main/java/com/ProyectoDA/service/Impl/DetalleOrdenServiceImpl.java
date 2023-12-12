
package com.ProyectoDA.service.Impl;

import com.ProyectoDA.dao.DetalleOrdenDao;
import com.ProyectoDA.domain.DetalleOrden;
import com.ProyectoDA.service.DetalleOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenServiceImpl implements DetalleOrdenService{

    @Autowired
    private DetalleOrdenDao detalleOrdenDao;
    
    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleOrdenDao.save(detalleOrden);
    }
 
}
