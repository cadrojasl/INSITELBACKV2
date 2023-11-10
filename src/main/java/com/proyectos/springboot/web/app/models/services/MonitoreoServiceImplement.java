package com.proyectos.springboot.web.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectos.springboot.web.app.models.dao.IMonitoreoDao;
import com.proyectos.springboot.web.app.models.entity.Monitoreo;
/*servicio con la logica 
 * correspondiente al crud*/

@Service
public class MonitoreoServiceImplement implements IMonitoreoService{
//inyectamos el servicio de jpa
	@Autowired
	private IMonitoreoDao dao;
	//realiza la consulta en la tabla de base de datos 
	@Override
	@Transactional(readOnly = true)
	public List<Monitoreo> findAll() {
	
		return 	(List<Monitoreo>) dao.findAll();
	}
	//realiza un delete en la tabla de base de datos
	@Override
	@Transactional
	public void eliminarCordenada(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
	
	//realiza el guardado o persitencia de la cordenada en la tabla
	@Override
	@Transactional
	public Monitoreo gurdarCordenada(Monitoreo cordenada) {
		// TODO Auto-generated method stub
		return dao.save(cordenada);
	}
	//Actualiza update en la tabla siempre y cuando exista la cordenada
	@Override
	@Transactional
	public Monitoreo actualizarCordenada(Monitoreo cordenada, Long id) {
	     Monitoreo existeCord = dao.findById(id).orElse(null);
	        if (existeCord != null) {
	        	existeCord.setNombre(cordenada.getNombre());
	        	existeCord.setLatitud(cordenada.getLatitud());
	        	existeCord.setLongitud(cordenada.getLongitud());
	        	existeCord.setTemperatura(cordenada.getTemperatura());
	            return dao.save(existeCord);
	        }
	        return null;
	}
	//realiza la consulta por id en la tabla
	@Override
	@Transactional
	public Monitoreo buscar(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}
	
	
	

}
