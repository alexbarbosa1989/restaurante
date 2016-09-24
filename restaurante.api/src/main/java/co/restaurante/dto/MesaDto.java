package co.restaurante.dto;

import java.io.Serializable;

import co.restaurante.entities.Mesa;

public class MesaDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long sedeId;
	
	public static MesaDto convertEntityToDto(Mesa entity){
		MesaDto dto = new MesaDto();
		dto.setId(entity.getId());
		dto.setSedeId(entity.getSedeId());
		return dto;
	}
	
	public static Mesa converDtoToEntity(MesaDto dto){
		Mesa entity = new Mesa();
		entity.setId(dto.getId());
		entity.setSedeId(dto.getSedeId());
		return entity;
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
