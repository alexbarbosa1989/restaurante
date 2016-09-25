package co.restaurante.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name = "T_USUARIO", schema="SYSTEM")
public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="usr_id")
    private Long id;
	
    @Column(name="usr_name")
    private String name;
    
    @Column(name="usr_rol")
    private Long rol;
	
	public Usuario() {
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRol() {
		return rol;
	}

	public void setRol(Long rol) {
		this.rol = rol;
	}
   
}
