package com.api.relacoesentretabelas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cidades")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ModelCidades implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nomeCidade;


    @ManyToOne
    @JoinColumn(name = "estados_id", referencedColumnName = "id")
    private ModelEstados modelEstados;

}
