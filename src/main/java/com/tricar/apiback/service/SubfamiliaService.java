package com.tricar.apiback.service;

import com.tricar.apiback.model.Subfamilia;
import com.tricar.apiback.repository.SubfamiliaRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author D@joh
 */
@Service
public class SubfamiliaService {
    
    @Autowired
    SubfamiliaRepository subfamiliaRepository;
    
    //Metodo Service para Registar Familia
    public Subfamilia guardar(Subfamilia subfamilia){
        return subfamiliaRepository.save(subfamilia);
    }
    
    //Metodo Service para Buscar Todo los Familiaes
    public Collection<Subfamilia> buscarTodos(){
        return subfamiliaRepository.findAll();
    }
    
    //Metodo Service para Buscar por Id
    public Subfamilia buscarPorId(Integer id){
       return subfamiliaRepository.findOne(id);
    }
    
    //Metodo Sevice para Eliminar un Registro
    public void eliminar(Subfamilia subfamilia){
        subfamiliaRepository.delete(subfamilia);
    }
    
}
