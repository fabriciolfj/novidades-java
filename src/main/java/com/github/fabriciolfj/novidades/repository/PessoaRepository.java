package com.github.fabriciolfj.novidades.repository;

import com.github.fabriciolfj.novidades.dto.PessoaDTO;
import com.github.fabriciolfj.novidades.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("Select p from Pessoa p")
    List<PessoaDTO> findAllPessoas();
}
