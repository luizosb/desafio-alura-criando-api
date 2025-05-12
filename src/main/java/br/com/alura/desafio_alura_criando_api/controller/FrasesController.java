package br.com.alura.desafio_alura_criando_api.controller;

import br.com.alura.desafio_alura_criando_api.DTO.FrasesDTO;
import br.com.alura.desafio_alura_criando_api.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {

    @Autowired
    private FrasesService frasesService;

    @GetMapping("/series/frases")
    public FrasesDTO trazerFrasesDeSerie(){
            return frasesService.obterFraseAleatoria();

    }


}
