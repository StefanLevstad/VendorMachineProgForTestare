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
public class Clothes extends MainMenu implements DispenserInterface{

    public Clothes(String name, int price, String beskrivning){
        //Konstruktor, Anropar konstruktorn i MainMenu-classen.
        super(name, price, beskrivning);
    }
    

    //Metoder från interface
    @Override
    public void Description() {
        System.out.println(name + " " + price + " " + beskrivning);
    }

    @Override
    public void Buy() {
        System.out.println("Produkten är nu köpt!");
    }

    @Override
    public void Use() {
        System.out.println("Jackan värmer bra, mysigt!");
    }
    
}
