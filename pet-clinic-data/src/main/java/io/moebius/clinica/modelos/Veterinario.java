package io.moebius.clinica.modelos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "veterinarios")
public class Veterinario extends Persona {
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "veterinarios_especialidades",
			joinColumns = @JoinColumn(name = "veterinario_id"),
			inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
	private Set<Especialidad> especialidades = new HashSet<>();
	
}
