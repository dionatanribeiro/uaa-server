package br.com.poc.uaa.authserver.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Role {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UsuarioRole> usuarioRoles;

}
