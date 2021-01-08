package br.com.sysdesenvolvimentos.sysdelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysdesenvolvimentos.sysdelivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findAllByOrderByNameAsc();
}
