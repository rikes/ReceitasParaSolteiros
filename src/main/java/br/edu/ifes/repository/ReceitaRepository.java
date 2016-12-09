package br.edu.ifes.repository;

import br.edu.ifes.model.Receita;
import org.springframework.data.repository.CrudRepository;

public interface ReceitaRepository extends CrudRepository<Receita, Integer> {
}

