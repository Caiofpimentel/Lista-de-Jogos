package com.caiofpimentel.ListaDeJogos.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tb_belonging")
@Getter
@Setter
@EqualsAndHashCode
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    
    @EqualsAndHashCode.Exclude
    private Integer position;

    public Belonging(){

    }

    public Belonging(Game game, GameList list, Integer position ){

        id.setGame(game);
        id.setList(list);
        this.position = position;

    }
    




}
