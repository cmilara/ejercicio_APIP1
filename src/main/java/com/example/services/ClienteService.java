package com.example.services;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.entities.Cliente;



public interface ClienteService {
    // El sort con import de domain
    public List<Cliente> findAll(Sort sort);
    //Pageable de domain
    public Page<Cliente> findAll(Pageable pageable);
    //le puedes pedir producto
    public Cliente findById(long id);
    public Cliente save (Cliente cliente);
    public void delete (Cliente cliente); 
    public List<Cliente>findAll();
    
}
