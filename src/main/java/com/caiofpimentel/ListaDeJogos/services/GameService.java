package com.caiofpimentel.ListaDeJogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiofpimentel.ListaDeJogos.dto.GameDTO;
import com.caiofpimentel.ListaDeJogos.dto.GameMinDTO;
import com.caiofpimentel.ListaDeJogos.entities.Game;
import com.caiofpimentel.ListaDeJogos.projections.GameMinProjection;
import com.caiofpimentel.ListaDeJogos.repositories.GameRepository;



@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly=true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    @Transactional(readOnly=true)
    public List<GameMinDTO> findAll() {

       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();

        return dto;
    }

    @Transactional(readOnly=true)
    public List<GameMinDTO> findByList(Long listId) {
       List<GameMinProjection> result = gameRepository.searchByList(listId);
       return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    
}
