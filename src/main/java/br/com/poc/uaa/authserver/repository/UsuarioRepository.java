package br.com.poc.uaa.authserver.repository;

import br.com.poc.uaa.authserver.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
