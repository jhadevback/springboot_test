package com.joaquin.repository;

import com.joaquin.model.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BancoRepository extends JpaRepository<Banco, Long> {

/*    List<Banco> findAll();
    Banco findById(Long id);

    void update(Banco banco);*/
}
