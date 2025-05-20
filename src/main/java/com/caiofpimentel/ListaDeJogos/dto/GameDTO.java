package com.caiofpimentel.ListaDeJogos.dto;

import org.springframework.beans.BeanUtils;

import com.caiofpimentel.ListaDeJogos.entities.Game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameDTO {

    private Long id;
    private String title;    
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;    
    private String shortDescription;   
    private String longDescription;

 

    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }
    
}
