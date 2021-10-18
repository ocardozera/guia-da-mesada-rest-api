package com.integracaorestiapi.demo;

import com.integracaorestiapi.demo.database.RepositorioPessoa;
import com.integracaorestiapi.demo.entidade.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaREST {
    @Autowired
    private RepositorioPessoa repositorioPessoa;

    @GetMapping
    public List<Pessoa> listar() {
        return repositorioPessoa.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Pessoa pessoa) {
        repositorioPessoa.save(pessoa);
    }

    @PutMapping
    public void alterar(@RequestBody Pessoa pessoa) {
        if (pessoa.getId() != null && pessoa.getId() > 0) {
            repositorioPessoa.save(pessoa);
        }
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repositorioPessoa.deleteById(id);
    }
}
