package br.com.fatec.ballet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Turma extends Entidade {

    private String nome;
    private String modalidade; // clássico, jazz, baby class...
    private String diaSemana;
    private String horario;

    /** REQUISITO 2 (lado N): várias turmas para uma professora. */
    @ManyToOne
    @JoinColumn(name = "professora_id")
    private Professora professora;

    /** REQUISITO 2 (lado 1): uma turma tem várias alunas. */
    @OneToMany(mappedBy = "turma")
    @JsonIgnore
    private List<Aluna> alunas = new ArrayList<>();
}
