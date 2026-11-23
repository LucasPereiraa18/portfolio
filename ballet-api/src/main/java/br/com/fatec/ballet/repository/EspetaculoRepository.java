package br.com.fatec.ballet.repository;

import br.com.fatec.ballet.model.Espetaculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspetaculoRepository extends JpaRepository<Espetaculo, Long> {
}
