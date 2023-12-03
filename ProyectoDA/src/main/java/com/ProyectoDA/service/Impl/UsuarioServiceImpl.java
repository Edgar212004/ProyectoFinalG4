
package com.ProyectoDA.service.Impl;

import com.ProyectoDA.dao.UsuarioDao;
import com.ProyectoDA.domain.Usuario;
import com.ProyectoDA.service.UsuarioService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public Optional<Usuario> findById(Integer id) {
        
        return usuarioDao.findById(id);
    }

    
}
