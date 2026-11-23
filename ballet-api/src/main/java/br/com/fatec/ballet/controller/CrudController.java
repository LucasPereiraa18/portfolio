package br.com.fatec.ballet.controller;

import br.com.fatec.ballet.model.Entidade;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * REQUISITO 4 - CRUD completo, escrito uma única vez e reaproveitado
 * por todos os controllers (POST, GET, PUT, DELETE).
 */
public abstract class CrudController<T extends Entidade> {

    private final JpaRepository<T, Long> repository;

    protected CrudController(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    /** CREATE - inserção */
    @PostMapping
    public ResponseEntity<T> inserir(@RequestBody T objeto) {
        objeto.setId(null); // garante que é um registro novo
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(objeto));
    }

    /** READ - consulta de todos */
    @GetMapping
    public List<T> listar() {
        return repository.findAll();
    }

    /** READ - consulta por id */
    @GetMapping("/{id}")
    public ResponseEntity<T> buscar(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /** UPDATE - alteração */
    @PutMapping("/{id}")
    public ResponseEntity<T> alterar(@PathVariable Long id, @RequestBody T objeto) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        objeto.setId(id);
        return ResponseEntity.ok(repository.save(objeto));
    }

    /** DELETE - exclusão */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
