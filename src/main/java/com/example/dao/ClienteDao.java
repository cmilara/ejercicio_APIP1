package com.example.dao;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Cliente;




public interface ClienteDao extends JpaRepository<Cliente, Long> {


    // Elegir el sort de domain
  @Query(value = "select c from Cliente c") // esto es HQL
  public List<Cliente> findAll(Sort sort);

  /**
   * El siguiente método recupera una página de producto
   */
  // page de domain y pageable tb de domain
  @Query(value = "select c from Cliente c", countQuery = "select count(c) from Cliente c")
  public Page<Cliente> findAll(Pageable pageable);

    
}