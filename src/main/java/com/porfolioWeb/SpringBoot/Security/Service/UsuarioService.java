/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioWeb.SpringBoot.Security.Service;

import com.porfolioWeb.SpringBoot.Security.Entity.Usuario;
import com.porfolioWeb.SpringBoot.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository IusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return IusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario (String nombreUsuario){
        return IusuarioRepository.existsByNombreUsuario (nombreUsuario);
    }
    
    public boolean existsByEmail (String email){
        return IusuarioRepository.existsByEmail (email);
    }
    
    public void save(Usuario usuario){
        IusuarioRepository.save(usuario);
    }
}
