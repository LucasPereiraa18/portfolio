package br.com.fatec.ballet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * REQUISITO 1 - HERANÇA.
 * Pessoa é a entidade-base; Aluna e Professora a estendem.
 * Estratégia JOINED: uma tabela para Pessoa e uma para cada subclasse.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public abstract class Pessoa extends Entidade {

    private String nome;
    private String email;
    private LocalDate dataNascimento;
}
