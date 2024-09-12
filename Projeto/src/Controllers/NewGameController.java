/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Game;

/**
 *
 * @author Aluno
 */
public class NewGameController {
    
    
    
    public Game createGame(String nameN,
         String descriptionN,
         String image_pathN,
         String release_dateN,
         String developerN,
         int priceN,
         String link_pathN)
    { 
        
    Game gameNew = new Game();
    gameNew.__construct(
            nameN,
            descriptionN,
            image_pathN,
            release_dateN,
            developerN,
            priceN,
            link_pathN);
    
        return gameNew;
    }
    
}
