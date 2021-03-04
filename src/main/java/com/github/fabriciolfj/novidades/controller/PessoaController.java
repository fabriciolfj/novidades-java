package com.github.fabriciolfj.novidades.controller;

import com.github.fabriciolfj.novidades.dto.PessoaDTO;
import com.github.fabriciolfj.novidades.entity.Pessoa;
import com.github.fabriciolfj.novidades.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public record PessoaController(PessoaService service) {

    @GetMapping
    public List<PessoaDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody final Pessoa pessoa) {
        service.add(pessoa);
    }
}
