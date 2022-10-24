
package com.porfolioWeb.SpringBoot.repository;


import com.porfolioWeb.SpringBoot.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository 
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
