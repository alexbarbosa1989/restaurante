package co.restaurante.dto;

import java.io.Serializable;
import java.sql.Date;

import co.restaurante.entities.Reserva;

public class ReservaDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long usrId;
	private Long mesaId;
	private Date fecha;
	
	public static ReservaDto convertEntityToDto(Reserva entity){
		ReservaDto dto = new ReservaDto();
		dto.setId(entity.getId());
		dto.setUsrId(entity.getUsrId());
		dto.setMesaId(entity.getMesaId());
		dto.setFecha(entity.getFecha());
		return dto;
	}
	
	public static Reserva convertDtoToEntity(ReservaDto dto){
		Reserva entity = new Reserva();
		entity.setId(dto.getId());
		entity.setUsrId(dto.getUsrId());
		entity.setMesaId(dto.getMesaId());
		entity.setFecha(dto.getFecha());
		return entity;
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
	
	
}
