package br.com.fatec.ballet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Espetaculo extends Entidade {

    private String titulo;
    private LocalDate data;
    private String local;

    /**
     * REQUISITO 3 - N:N. Uma aluna participa de vários espetáculos e
     * um espetáculo tem várias alunas. A tabela de junção é criada automaticamente.
     */
    @ManyToMany
    @JoinTable(
            name = "espetaculo_aluna",
            joinColumns = @JoinColumn(name = "espetaculo_id"),
            inverseJoinColumns = @JoinColumn(name = "aluna_id"))
    private List<Aluna> alunas = new ArrayList<>();
}
