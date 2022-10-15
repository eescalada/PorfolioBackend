
package com.porfolioWeb.SpringBoot.service;

import com.porfolioWeb.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
   public Persona updPersona(Persona per);

    public void savePersona(Persona persona);

    public Persona findPersona(long l);
}
