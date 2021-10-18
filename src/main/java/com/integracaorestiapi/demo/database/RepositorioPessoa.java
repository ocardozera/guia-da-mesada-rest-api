package com.integracaorestiapi.demo.database;

import com.integracaorestiapi.demo.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPessoa extends JpaRepository<Pessoa, Long> {

}
