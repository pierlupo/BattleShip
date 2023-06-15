package com.example.bataillenavale.entity;

import lombok.Data;

@Data
public class Grille {


    protected Case[][] grille;
    protected Jeu jeu;



    public void MiseEnPlaceGrille() {
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[i].length; j++) {
                grille[i][j] = null;
            }
        }
    }

    public Grille(){
        grille = new Case[10][10];
    }


}