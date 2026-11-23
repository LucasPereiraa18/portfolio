package br.com.fatec.ballet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Professora extends Pessoa {

    private String especialidade; // clássico, contemporâneo, pontas...

    /** REQUISITO 2 (lado 1): uma professora ministra várias turmas. */
    @OneToMany(mappedBy = "professora")
    @JsonIgnore
    private List<Turma> turmas = new ArrayList<>();
}
