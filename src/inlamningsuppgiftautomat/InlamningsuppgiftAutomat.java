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
public class InlamningsuppgiftAutomat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Skapar en ny instans av Food
        Food food1 = new Food("Pizza, ", 78, " en fin nygräddad pizza!");
        
        //Skapar en ny instans av Clothes
        Clothes jacket = new Clothes("Jacka, ", 150, " en vacker vinterjacka!");
        
        //skriver ut food
        System.out.println(food1.name + food1.price +"kr," + food1.beskrivning);
        
        
        //skriver ut clothes
        System.out.println(jacket.name + jacket.price +"kr," + jacket.beskrivning);
    }
    
}
