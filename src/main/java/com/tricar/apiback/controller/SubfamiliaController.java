package com.tricar.apiback.controller;

import com.tricar.apiback.model.Subfamilia;
import com.tricar.apiback.service.SubfamiliaService;
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
public class SubfamiliaController {
    
    @Autowired
    SubfamiliaService subfamiliaService;
    
    @RequestMapping(method = RequestMethod.GET, value = "/subfamilias", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Subfamilia>> buscarTodosFamiliaes() {
        Collection<Subfamilia> subfamiliasTodos = subfamiliaService.buscarTodos();
        return new ResponseEntity<>(subfamiliasTodos, HttpStatus.OK);
    }
    
}
