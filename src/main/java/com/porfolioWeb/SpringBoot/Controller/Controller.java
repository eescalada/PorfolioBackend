
package com.porfolioWeb.SpringBoot.Controller;
import com.porfolioWeb.SpringBoot.model.Persona;
import com.porfolioWeb.SpringBoot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
  

    
    @PostMapping ("/new/persona")
    public String agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
                return "La persona fue creada correctamente";
    }


    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();
    }
    @DeleteMapping ("/delete/{id}")
    public String borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido){
        
        Persona persona = persoServ.buscarPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        
        persoServ.savePersona(persona);
        return persona;
        
        
    }
                                
            
                             
    
}
