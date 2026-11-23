package br.com.fatec.ballet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PreRemove;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Aluna extends Pessoa {

    private String nivel; // iniciante, intermediário, avançado

    /** REQUISITO 2 (lado N): várias alunas pertencem a uma turma. */
    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    /** REQUISITO 3 (lado inverso do N:N): quem manda é Espetaculo.alunas. */
    @ManyToMany(mappedBy = "alunas")
    @JsonIgnore
    private List<Espetaculo> espetaculos = new ArrayList<>();

    /** Ao excluir a aluna, remove os vínculos dela com os espetáculos. */
    @PreRemove
    private void desvincularEspetaculos() {
        for (Espetaculo e : espetaculos) {
            e.getAlunas().remove(this);
        }
    }
}
