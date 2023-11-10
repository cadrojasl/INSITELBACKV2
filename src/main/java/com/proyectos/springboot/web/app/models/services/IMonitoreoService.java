package com.proyectos.springboot.web.app.models.services;

import java.util.List;

import com.proyectos.springboot.web.app.models.entity.Monitoreo;

/* interface para acceder al servicio inyectado*/
public interface IMonitoreoService {
	public List<Monitoreo> findAll();
	public void eliminarCordenada(Long id);
	public Monitoreo gurdarCordenada(Monitoreo cordenada);
	public Monitoreo actualizarCordenada(Monitoreo cordenada,  Long id);
	public Monitoreo buscar(Long id);
}
