package com.caiofpimentel.ListaDeJogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiofpimentel.ListaDeJogos.dto.GameMinDTO;
import com.caiofpimentel.ListaDeJogos.entities.Game;
import com.caiofpimentel.ListaDeJogos.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {

       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();

        return dto;
    }
    
}
