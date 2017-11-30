package br.com.poc.uaa.authserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UsuarioRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuarioRole;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;

    public UsuarioRole(Usuario usuario, Role role) {
        this.usuario = usuario;
        this.role = role;
    }

}
