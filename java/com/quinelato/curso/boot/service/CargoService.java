package com.quinelato.curso.boot.service;

import java.util.List;

import com.quinelato.curso.boot.domain.Cargo;
import com.quinelato.curso.boot.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscaPorPagina(int pagina, String direcao);
}
