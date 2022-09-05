package com.api.relacoesentretabelas.repository;

import com.api.relacoesentretabelas.model.ModelEstados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEstado extends JpaRepository<ModelEstados, Long> {
}
