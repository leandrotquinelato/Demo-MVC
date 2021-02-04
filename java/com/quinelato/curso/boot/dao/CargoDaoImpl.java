package com.quinelato.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.quinelato.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
