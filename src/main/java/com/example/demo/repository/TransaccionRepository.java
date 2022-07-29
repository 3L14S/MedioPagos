package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Transaccion;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long>{
	Optional<Transaccion> findByIdPago(Long idPago);
	Iterable<Transaccion> findAllByIdPago(Long idPago);
}
