package com.api.relacoesentretabelas.repository;

import com.api.relacoesentretabelas.model.ModelCidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCidade extends JpaRepository<ModelCidades, Long> {
}
