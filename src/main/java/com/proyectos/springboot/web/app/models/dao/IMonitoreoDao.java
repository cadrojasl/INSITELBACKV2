package com.proyectos.springboot.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;

/*interface que permite realizar las acciones del CRUD utilizando JPA*/

import com.proyectos.springboot.web.app.models.entity.Monitoreo;

public interface IMonitoreoDao extends CrudRepository<Monitoreo, Long>{

}
