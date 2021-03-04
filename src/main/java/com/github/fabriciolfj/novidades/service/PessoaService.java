package com.github.fabriciolfj.novidades.service;

import com.github.fabriciolfj.novidades.dto.PessoaDTO;
import com.github.fabriciolfj.novidades.entity.Pessoa;
import com.github.fabriciolfj.novidades.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record PessoaService(PessoaRepository repository) {

    public List<PessoaDTO> findAll() {
        List<PessoaDTO> allPessoas = repository.findAllPessoas();
        return allPessoas;
    }

    public void add(final Pessoa pessoa) {
        repository.save(pessoa);
    }
}
