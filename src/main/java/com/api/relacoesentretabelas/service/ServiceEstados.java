package com.api.relacoesentretabelas.service;

import com.api.relacoesentretabelas.model.ModelEstados;
import com.api.relacoesentretabelas.repository.RepositoryEstado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceEstados {
    @Autowired
    private RepositoryEstado repositoryEstado;

    public ModelEstados cadastrar(ModelEstados modelEstados){
        return repositoryEstado.save(modelEstados);
    }
    public List<ModelEstados> buscarTodos(){
        return repositoryEstado.findAll();
    }

    public void deletar(Long id){
        repositoryEstado.deleteById(id);
    }
    public ModelEstados alterar(ModelEstados modelEstados){
        return repositoryEstado.save(modelEstados);
    }
    public ModelEstados buscarPorId(Long id) {
        return repositoryEstado.findById(id).orElseThrow(
                () -> new EntityNotFoundException("ID not found "+ id));
    }
}
