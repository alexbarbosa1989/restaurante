package co.restaurante.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reserva
 *
 */
@Entity
@Table(name = "T_RESERVA")
public class Reserva implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="reserva_id")
    private Long id;
    
    @Column(name="usr_id")
    private Long usrId;
    
    @Column(name="mesa_id")
    private Long mesaId;
    
    @Column(name="fecha")
    private Date fecha;
	
    @Column(name="estado_reserva")
    private String estReserva;
    
	public Reserva() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUsrId() {
		return usrId;
	}

	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}

	public Long getMesaId() {
		return mesaId;
	}

	public void setMesaId(Long mesaId) {
		this.mesaId = mesaId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstReserva() {
		return estReserva;
	}

	public void setEstReserva(String estReserva) {
		this.estReserva = estReserva;
	}
}
