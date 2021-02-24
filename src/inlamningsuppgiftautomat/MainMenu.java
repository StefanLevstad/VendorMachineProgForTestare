/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlamningsuppgiftautomat;

/**
 *
 * @author stefa
 */
abstract public class MainMenu {
    //Attribut för namn, kostnad och beskrivning
    public String name;
    public int price;
    public String beskrivning;
    
    
    //konstruktor, tilldelar värden till attributen.
    public MainMenu (String name, int price, String beskrivning){
        this.name = name;
        this.price = price;
        this.beskrivning = beskrivning;
          
    }
    
    //gör switch-case i while-loop för menyn!!
    
    
    
    
}
