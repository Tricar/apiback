package com.tricar.apiback.service;

import com.tricar.apiback.model.Anexo;
import com.tricar.apiback.repository.AnexoRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author D@joh
 */
@Service
public class AnexoService {
    
    @Autowired
    AnexoRepository anexoRepository;
    
    //Metodo Service para Registar Familia
    public Anexo guardar(Anexo anexo){
        return anexoRepository.save(anexo);
    }
    
    //Metodo Service para Buscar Todo los Familiaes
    public Collection<Anexo> buscarTodos(){
        return anexoRepository.findAll();
    }
    
    //Metodo Service para Buscar por Id
    public Anexo buscarPorId(Integer id){
       return anexoRepository.findOne(id);
    }
    
    //Metodo Sevice para Eliminar un Registro
    public void eliminar(Anexo anexo){
        anexoRepository.delete(anexo);
    }
    
}
