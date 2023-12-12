
package com.ProyectoDA.service.Impl;

import com.ProyectoDA.dao.UsuarioDao;
import com.ProyectoDA.domain.Usuario;
import com.ProyectoDA.service.UsuarioService;
import java.util.List;
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

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return usuarioDao.findByEmail(email);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    
}

