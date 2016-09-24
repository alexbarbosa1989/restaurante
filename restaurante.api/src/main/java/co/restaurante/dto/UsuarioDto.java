package co.restaurante.dto;

import java.io.Serializable;

import co.restaurante.entities.Usuario;

public class UsuarioDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Long rol;
	
	public static UsuarioDto convertEntityToDto(Usuario entity){
		UsuarioDto dto = new UsuarioDto();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setRol(entity.getRol());
		return dto;
	}
	
	public static Usuario converDtoToEntity(UsuarioDto dto){
		Usuario entity = new Usuario();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setRol(dto.getRol());
		return entity;
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
