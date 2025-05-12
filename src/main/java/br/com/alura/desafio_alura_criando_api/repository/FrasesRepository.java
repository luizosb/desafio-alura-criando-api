package br.com.alura.desafio_alura_criando_api.repository;

import br.com.alura.desafio_alura_criando_api.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FrasesRepository extends JpaRepository<Frases, Long> {

    @Query("SELECT f FROM Frases f order by function('RANDOM') LIMIT 1")
    Frases buscarFraseAleatoria();
}
