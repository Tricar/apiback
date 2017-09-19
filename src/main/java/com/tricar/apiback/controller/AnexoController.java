package com.tricar.apiback.controller;

import com.tricar.apiback.model.Anexo;
import com.tricar.apiback.service.AnexoService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author D@joh
 */
@RestController
public class AnexoController {
    
    @Autowired
    AnexoService anexoService;
    
    @RequestMapping(method = RequestMethod.GET, value = "/anexos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Anexo>> buscarTodosFamiliaes() {
        Collection<Anexo> anexosTodos = anexoService.buscarTodos();
        return new ResponseEntity<>(anexosTodos, HttpStatus.OK);
    }
    
    //controller Rest para Registar una Familia
    @RequestMapping(method = RequestMethod.POST, value = "/anexos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Anexo> registrarFamilia(@RequestBody Anexo anexo) {
        Anexo familiaRegistrada = anexoService.guardar(anexo);
        return new ResponseEntity<>(familiaRegistrada, HttpStatus.CREATED);
    }
    
    //Controller Rest para actualizar un Registro de anexo
    @RequestMapping(method = RequestMethod.PUT, value = "/anexos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Anexo> modificarAnexo(@RequestBody Anexo anexo) {
        Anexo anexoModificada = anexoService.guardar(anexo);
        return new ResponseEntity<>(anexoModificada, HttpStatus.OK);
    }
    
    //Controller Rest para Eliminar un Registro de Anexo    
    @RequestMapping(method = RequestMethod.DELETE, value = "/anexos/{id}")
    public ResponseEntity<Collection<Anexo>> excluirAnexo(@PathVariable Integer id) {
        Anexo anexoEncontrada = anexoService.buscarPorId(id);
        if (anexoEncontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        anexoService.eliminar(anexoEncontrada);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
