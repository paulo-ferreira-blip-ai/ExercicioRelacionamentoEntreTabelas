package com.api.relacoesentretabelas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "estados")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelEstados implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_estado")
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "modelEstados", cascade = CascadeType.ALL)
    private List<ModelCidades> cidades = new ArrayList<>();

}
