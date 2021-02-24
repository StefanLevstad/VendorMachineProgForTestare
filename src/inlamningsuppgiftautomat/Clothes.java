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
    
    
    
    
    @Override
    public void Description() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Buy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Use() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
