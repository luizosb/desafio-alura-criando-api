package br.com.alura.desafio_alura_criando_api.service;

import br.com.alura.desafio_alura_criando_api.DTO.FrasesDTO;
import br.com.alura.desafio_alura_criando_api.model.Frases;
import br.com.alura.desafio_alura_criando_api.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private FrasesRepository frasesRepository;

    public FrasesDTO obterFraseAleatoria() {
        Frases frase = frasesRepository.buscarFraseAleatoria();
        return new FrasesDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
