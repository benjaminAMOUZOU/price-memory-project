package com.benjamin.pricememory.controller;

import com.benjamin.pricememory.modele.Article;

public class Controle {

    private static Article article = null;

    private Controle() {
    }

    public static Article getInstance(){
        if(Controle.article == null){
            Controle.article = new Article();
        }
        return Controle.article;
    }
}
