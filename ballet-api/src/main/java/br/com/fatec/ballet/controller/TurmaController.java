package br.com.fatec.ballet.controller;

import br.com.fatec.ballet.model.Turma;
import br.com.fatec.ballet.repository.TurmaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController extends CrudController<Turma> {

    public TurmaController(TurmaRepository repository) {
        super(repository);
    }
}
