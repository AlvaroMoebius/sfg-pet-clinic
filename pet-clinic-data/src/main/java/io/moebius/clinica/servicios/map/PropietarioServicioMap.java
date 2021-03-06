package io.moebius.clinica.servicios.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import io.moebius.clinica.modelos.Propietario;
import io.moebius.clinica.servicios.PropietarioServicio;

@Service
public class PropietarioServicioMap extends AbstractMapService<Propietario, Long> implements PropietarioServicio{

	@Override
	public Propietario save(Propietario propietario) {
		return super.save(propietario);
	}

	@Override
	public Set<Propietario> findAll() {
		return super.findAll();
	}

	@Override
	public Propietario findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Propietario propietario) {
		super.delete(propietario);
	}

	@Override
	public Propietario findByApellido(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	



}
