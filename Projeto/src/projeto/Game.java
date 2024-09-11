/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author Aluno
 */
public class Game {
    
    private String name;
    private String description;
    private String image_path;
    private Date release_date; 
    //Criar o tipo Date e trocar de String para date
    private String developer;
    private int price;
    private String link_path;
    
    public void __construct
        (String name,
         String description,
         String image_path,
         Date release_date,
         String developer,
         int price,
         String link_path){
          this.name = name;
          this.description = description;
          this.image_path = image_path;
          this.release_date = release_date;
          this.developer = developer;
          this.price = price;
          this.link_path = link_path;                                                                                                                                   
        }
        
     
    
}
