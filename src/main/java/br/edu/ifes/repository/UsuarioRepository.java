package br.edu.ifes.repository;

import br.edu.ifes.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}

