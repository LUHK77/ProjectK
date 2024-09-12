/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Aluno
 */
public class Game {
    
    private String name;
    private String description;
    private String image_path;
    private String release_date; 
    //Criar o tipo Date e trocar de String para date
    private String developer;
    private int price;
    private String link_path;
    
    public void __construct
        (String name,
         String description,
         String image_path,
         String release_date,
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
        
    public void getName(){
        System.out.println(this.name);
    } 
    public void getDescription(){
        System.out.println(this.description);
    } 
    public void getimage_path(){
        System.out.println(this.image_path);
    } 
    public void getRelaseDate(){
        System.out.println(this.release_date);
    } 
    public void getDeveloper(){
        System.out.println(this.developer);
    } 
    public void getPrice(){
        System.out.println(this.price + "R$");
    } public void getLinkPath(){
        System.out.println(this.link_path);
    } 
    
    
        
     
    
}




