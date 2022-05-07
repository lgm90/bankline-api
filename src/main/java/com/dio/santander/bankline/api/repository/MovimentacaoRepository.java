package com.dio.santander.bankline.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.modelo.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
	
	public List<Movimentacao>findByIdConta(Integer idConta);
}