package br.com.fatec.ballet.controller;

import br.com.fatec.ballet.model.Aluna;
import br.com.fatec.ballet.repository.AlunaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunas")
public class AlunaController extends CrudController<Aluna> {

    public AlunaController(AlunaRepository repository) {
        super(repository);
    }
}
