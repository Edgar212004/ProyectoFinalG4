
package com.ProyectoDA.service.Impl;

import com.ProyectoDA.dao.OrdenDao;
import com.ProyectoDA.domain.Orden;
import com.ProyectoDA.domain.Usuario;
import com.ProyectoDA.service.OrdenService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServiceImpl implements OrdenService{

    @Autowired
    private OrdenDao ordenDao;
    
    @Override
    public Orden save(Orden orden) {
        return ordenDao.save(orden);
    }

    @Override
    public List<Orden> findAll() {
        return ordenDao.findAll();
    }
    
    public String generarNumeroOrden(){
        int numero = 0;
        String numeroConcatenado = "";
        
        List<Orden> ordenes = findAll();
        List<Integer> numeros = new ArrayList<Integer>();
        
        ordenes.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero() )));
        
        if(ordenes.isEmpty()){
            numero = 1;
        }else{
            numero =numeros.stream().max(Integer::compareTo).get();
            numero++;
        }
        
        if(numero < 10){
            numeroConcatenado = "000000000" +String.valueOf(numero);
        }else if(numero < 100){
            numeroConcatenado = "00000000" +String.valueOf(numero);
        }else if(numero < 1000){
            numeroConcatenado = "0000000" +String.valueOf(numero);
        }else if(numero < 10000){
            numeroConcatenado = "000000" +String.valueOf(numero);
        }
        
        return numeroConcatenado;
    }

    @Override
    public List<Orden> findByUsuario(Usuario usuario) {
        return ordenDao.findByUsuario(usuario);
    }

    @Override
    public Optional<Orden> findById(Integer id) {
        return ordenDao.findById(id);
    }

}

