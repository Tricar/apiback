package com.tricar.apiback.controller;

import com.tricar.apiback.model.Subfamilia;
import com.tricar.apiback.service.SubfamiliaService;
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
public class SubfamiliaController {
    
    @Autowired
    SubfamiliaService subfamiliaService;
    
    @RequestMapping(method = RequestMethod.GET, value = "/subfamilias", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Subfamilia>> buscarTodosFamiliaes() {
        Collection<Subfamilia> subfamiliasTodos = subfamiliaService.buscarTodos();
        return new ResponseEntity<>(subfamiliasTodos, HttpStatus.OK);
    }
    
    //controller Rest para Registar una Familia
    @RequestMapping(method = RequestMethod.POST, value = "/subfamilias", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subfamilia> registrarFamilia(@RequestBody Subfamilia subfamilia) {
        Subfamilia familiaRegistrada = subfamiliaService.guardar(subfamilia);
        return new ResponseEntity<>(familiaRegistrada, HttpStatus.CREATED);
    }
    
    //Controller Rest para actualizar un Registro de anexo
    @RequestMapping(method = RequestMethod.PUT, value = "/subfamilias", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subfamilia> modificarAnexo(@RequestBody Subfamilia subfamilia) {
        Subfamilia subfamiliaModificada = subfamiliaService.guardar(subfamilia);
        return new ResponseEntity<>(subfamiliaModificada, HttpStatus.OK);
    }
    
    //Controller Rest para Eliminar un Registro de Anexo    
    @RequestMapping(method = RequestMethod.DELETE, value = "/subfamilias/{id}")
    public ResponseEntity<Collection<Subfamilia>> excluirAnexo(@PathVariable Integer id) {
        Subfamilia subfamiliaEncontrada = subfamiliaService.buscarPorId(id);
        if (subfamiliaEncontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        subfamiliaService.eliminar(subfamiliaEncontrada);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
