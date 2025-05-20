package com.caiofpimentel.ListaDeJogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiofpimentel.ListaDeJogos.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {


    
}
