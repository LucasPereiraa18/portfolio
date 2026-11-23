package br.com.fatec.ballet.controller;

import br.com.fatec.ballet.model.Espetaculo;
import br.com.fatec.ballet.repository.EspetaculoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/espetaculos")
public class EspetaculoController extends CrudController<Espetaculo> {

    public EspetaculoController(EspetaculoRepository repository) {
        super(repository);
    }
}
