package br.com.sysdesenvolvimentos.sysdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysdesenvolvimentos.sysdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
