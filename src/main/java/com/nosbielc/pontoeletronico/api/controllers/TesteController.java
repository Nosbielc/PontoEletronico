package com.nosbielc.pontoeletronico.api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "*")
public class TesteController {


    public TesteController() {

    }

    @PostMapping
    public String teste() {
        return "Teste";
    }

    @GetMapping
    public String teste1() {
        return "Teste1";
    }

    @PutMapping
    public String teste3() {
        return "Teste3";
    }
}
