package com.uts.invoice.programacion.web.models.entities.dao;

import org.springframework.data.repository.CrudRepository;

import com.uts.invoice.programacion.web.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
