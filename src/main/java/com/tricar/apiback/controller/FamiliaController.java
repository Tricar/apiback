package com.tricar.apiback.controller;

import com.tricar.apiback.model.Familia;
import com.tricar.apiback.service.FamiliaService;
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
public class FamiliaController {
    
    @Autowired
    FamiliaService familiaService;
    
    //Controller Rest para cargar todos las familias
    @RequestMapping(method = RequestMethod.GET, value = "/familias", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Familia>> buscarTodosFamiliaes() {
        Collection<Familia> familiasTodos = familiaService.buscarTodos();
        return new ResponseEntity<>(familiasTodos, HttpStatus.OK);
    }
    
    //controller Rest para Registar una Familia
    @RequestMapping(method = RequestMethod.POST, value = "/familias", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Familia> registrarFamilia(@RequestBody Familia familia) {
        Familia familiaRegistrada = familiaService.guardar(familia);
        return new ResponseEntity<>(familiaRegistrada, HttpStatus.CREATED);
    }
    
    //Controller Rest para actualizar un Registro de anexo
    @RequestMapping(method = RequestMethod.PUT, value = "/familias", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Familia> modificarAnexo(@RequestBody Familia familia) {
        Familia anexoModificado = familiaService.guardar(familia);
        return new ResponseEntity<>(anexoModificado, HttpStatus.OK);
    }
    
    //Controller Rest para Eliminar un Registro de Anexo    
    @RequestMapping(method = RequestMethod.DELETE, value = "/familias/{id}")
    public ResponseEntity<Collection<Familia>> excluirAnexo(@PathVariable Integer id) {
        Familia anexoEncontrado = familiaService.buscarPorId(id);
        if (anexoEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        familiaService.eliminar(anexoEncontrado);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    //Rest Controller para hacer búsquedas por nombre
    @RequestMapping(method = RequestMethod.GET, value = "/familias/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Familia> buscarAnexoPorId(@PathVariable String nombre) {
        Familia familia = familiaService.buscarxNombre(nombre);
        return new ResponseEntity<>(familia, HttpStatus.OK);
    }
}
