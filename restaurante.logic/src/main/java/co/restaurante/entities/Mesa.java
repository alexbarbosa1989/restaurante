package co.restaurante.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Mesa
 *
 */
@Entity
@Table(name = "T_MESA")
public class Mesa implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="mesa_id")
    private Long id;
    
    @Column(name="sede_id")
    private Long sedeId;
	
	public Mesa() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSedeId() {
		return sedeId;
	}

	public void setSedeId(Long sedeId) {
		this.sedeId = sedeId;
	}
   
	
}
