package com.tricar.apiback.service;

import com.tricar.apiback.model.Familia;
import com.tricar.apiback.repository.FamiliaRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author D@joh
 */
@Service
public class FamiliaService {
    
    @Autowired
    FamiliaRepository familiaRepository;
    
    //Metodo Service para Registar Familia
    public Familia guardar(Familia familia){
        return familiaRepository.save(familia);
    }
    
    //Metodo Service para Buscar Todo los Familiaes
    public Collection<Familia> buscarTodos(){
        return familiaRepository.findAll();
    }
    
    //Metodo Service para Buscar por Id
    public Familia buscarPorId(Integer id){
       return familiaRepository.findOne(id);
    }
    
    //Metodo Sevice para Eliminar un Registro
    public void eliminar(Familia familia){
        familiaRepository.delete(familia);
    }
    
    //Método service para realizar la búsqueda por nombre de familia
    public Familia buscarxNombre (String nombre){
        Familia familia = new Familia();
        familia = familiaRepository.findByNombre(nombre);
        return familia;
    }      
    
}
