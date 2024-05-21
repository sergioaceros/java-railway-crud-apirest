package com.sergio.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
