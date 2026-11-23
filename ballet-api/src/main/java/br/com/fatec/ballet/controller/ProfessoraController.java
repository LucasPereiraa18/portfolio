package br.com.fatec.ballet.controller;

import br.com.fatec.ballet.model.Professora;
import br.com.fatec.ballet.repository.ProfessoraRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professoras")
public class ProfessoraController extends CrudController<Professora> {

    public ProfessoraController(ProfessoraRepository repository) {
        super(repository);
    }
}
