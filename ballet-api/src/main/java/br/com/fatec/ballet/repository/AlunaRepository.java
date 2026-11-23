package br.com.fatec.ballet.repository;

import br.com.fatec.ballet.model.Aluna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunaRepository extends JpaRepository<Aluna, Long> {
}
