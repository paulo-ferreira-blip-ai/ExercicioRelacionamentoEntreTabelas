package com.api.relacoesentretabelas.controller;

import com.api.relacoesentretabelas.model.ModelEstados;
import com.api.relacoesentretabelas.service.ServiceEstados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "estados")
public class ControllerEstados {
    @Autowired
    private ServiceEstados serviceEstados;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ModelEstados> cadastrar(@RequestBody ModelEstados modelEstados) {
        return ResponseEntity.ok(serviceEstados.cadastrar(modelEstados));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ModelEstados> alterar(@PathVariable Long id, @RequestBody ModelEstados modelEstados){
        return ResponseEntity.ok(serviceEstados.alterar(modelEstados));
    }

    @GetMapping
    public ResponseEntity<List<ModelEstados>> buscarTodos(){
        return ResponseEntity.ok(serviceEstados.buscarTodos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ModelEstados> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(serviceEstados.buscarPorId(id));
    }

    @DeleteMapping(path = "/{id}")
    public String deletar (@PathVariable Long id){
        serviceEstados.deletar(id);
        return "Deletado";
    }
}
