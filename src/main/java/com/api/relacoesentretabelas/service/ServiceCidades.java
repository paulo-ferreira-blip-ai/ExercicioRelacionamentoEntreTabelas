package com.api.relacoesentretabelas.service;

import com.api.relacoesentretabelas.model.ModelCidades;
import com.api.relacoesentretabelas.repository.RepositoryCidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCidades {
    @Autowired
    private RepositoryCidade repositoryCidade;

    public ModelCidades cadastrar(ModelCidades modelCidades){
        return repositoryCidade.save(modelCidades);
    }
    public List<ModelCidades> buscarTodos(){
        return repositoryCidade.findAll();
    }
    public ModelCidades buscarPorId(Long id) {
        return repositoryCidade.findById(id).orElseThrow(
                () -> new EntityNotFoundException("ID not found "+ id));
    }

    public void deletar(Long id){
        repositoryCidade.deleteById(id);
    }
    public ModelCidades alterar(ModelCidades modelCidades){
        return repositoryCidade.save(modelCidades);
    }
}
