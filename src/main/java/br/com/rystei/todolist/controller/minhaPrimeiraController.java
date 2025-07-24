package br.com.rystei.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/ -----
public class minhaPrimeiraController {
    /**
     * Métodos de acesso do HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover um dado 
     * PATCH - alterar somente uma parte da informação/dado
     */

     //Método (funcionalidade) de uma classe
     @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "funcionou";
    }
}
