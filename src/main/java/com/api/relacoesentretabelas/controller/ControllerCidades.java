package com.api.relacoesentretabelas.controller;

import com.api.relacoesentretabelas.model.ModelCidades;
import com.api.relacoesentretabelas.service.ServiceCidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/cidades")
public class ControllerCidades {
    @Autowired
    private ServiceCidades serviceCidades;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ModelCidades> cadastrar(@RequestBody ModelCidades modelCidades){
        return ResponseEntity.ok(serviceCidades.cadastrar(modelCidades));
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<ModelCidades> alterar(@PathVariable Long id, @RequestBody ModelCidades modelCidades){
        return ResponseEntity.ok(serviceCidades.alterar(modelCidades));
    }
    @GetMapping
    public ResponseEntity<List<ModelCidades>> buscarTodos(){
        return ResponseEntity.ok(serviceCidades.buscarTodos());
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<ModelCidades> buscarPorID(@PathVariable Long id){
        return ResponseEntity.ok(serviceCidades.buscarPorId(id));
    }
    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable Long id){
        serviceCidades.deletar(id);
    }
}
