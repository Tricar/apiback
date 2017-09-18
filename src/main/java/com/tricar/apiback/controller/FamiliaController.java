package com.tricar.apiback.controller;

import com.tricar.apiback.model.Familia;
import com.tricar.apiback.service.FamiliaService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    
    @RequestMapping(method = RequestMethod.GET, value = "/familias", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Familia>> buscarTodosFamiliaes() {
        Collection<Familia> familiasTodos = familiaService.buscarTodos();
        return new ResponseEntity<>(familiasTodos, HttpStatus.OK);
    }
    
}
