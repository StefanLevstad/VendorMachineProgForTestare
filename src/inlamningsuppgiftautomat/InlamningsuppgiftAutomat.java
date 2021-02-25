/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlamningsuppgiftautomat;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class InlamningsuppgiftAutomat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        //Skapar en while-Loop för att köra programmet.
        while (true) {
           Scanner scan = new Scanner(System.in);
           //skapar instanser av klasserna
        Food food = new Food("Stek", 55, "En saftig härlig stek!");
        Drink drink = new Drink("Redbull", 23, "Redbull ger dig viiingar!");
        Clothes clothes = new Clothes("Jacka", 345, "En varm och mysig vinterjacka!");
        
        System.out.println("välj en produkt:");
        System.out.println("=======================");
        System.out.println("1. Mat: ");
        System.out.println("2. Dricka: ");
        System.out.println("3. Kläder: ");
        System.out.println("4. Avsluta.");
        System.out.println("=======================");
        
        int input = scan.nextInt();
        
        System.out.println("=======================");
        
        //Skapar ett Switchcase av de olika valen!
        switch(input){
            //Ett för Food-classen
            case 1:
                //anropar metoden Description i Food-classen
                food.Description();
                
                
                System.out.print("Vill du köpa steken? Ja/Nej: ");
                String foodVal = scan.next();
                System.out.println(foodVal);
                //om valet är Ja eller ja, köps och används produkten
                if (foodVal.equals("Ja")){
                    food.Buy();
                    food.Use();
                } else if (foodVal.equals("ja")){
                    food.Buy();
                    food.Use();
                } 
                //om valet är nej återgår programmet till huvudmenyn.
                else if (foodVal.equals("Nej")){
                    System.out.println("Tack ändå!");
                    System.out.println("=======================");
                } else if (foodVal.equals("nej")) {
                    System.out.println("Tack ändå!");
                    System.out.println("=======================");
                }
                else System.out.println("Felaktigt val!");
                     System.out.println("=======================");

            break;
            
            //Ett för Drink-classen
            case 2:
                //anropar metoden Description i Drink-classen
                drink.Description();
                System.out.print("Vill du köpa drycken? Ja/Nej: ");
                String drinkVal = scan.next();
                System.out.println(drinkVal);
                //om valet är Ja eller ja, köps och används produkten
                if (drinkVal.equals("Ja")){
                    drink.Buy();
                    drink.Use();
                } else if (drinkVal.equals("ja")){
                    drink.Buy();
                    drink.Use();
                } 
                //om valet är nej återgår programmet till huvudmenyn.
                else if (drinkVal.equals("Nej")){
                    System.out.println("Tack ändå!");
                    System.out.println("=======================");
                } else if (drinkVal.equals("nej")) {
                    System.out.println("Tack ändå!");
                    System.out.println("=======================");
                }
                else System.out.println("Felaktigt val!");
                     System.out.println("=======================");
                
                break;

            //Ett för clothes klassen    
            case 3:
                //anropar metoden Description i Clothes-classen
                clothes.Description();
                
                System.out.print("Vill du köpa Jackan? Ja/Nej: ");
                String clothesVal = scan.next();
                System.out.println(clothesVal);
                //om valet är Ja eller ja, köps produkten
                if (clothesVal.equals("Ja")){
                    drink.Buy();
                    drink.Use();
                } else if (clothesVal.equals("ja")){
                    clothes.Buy();
                    clothes.Use();
                } 
                //om valet är nej återgår programmet till huvudmenyn.
                else if (clothesVal.equals("Nej")){
                    System.out.println("Tack ändå!");
                    System.out.println("=======================");
                } else if (clothesVal.equals("nej")) {
                    System.out.println("Tack ändå!");
                    System.out.println("=======================");
                }
                else System.out.println("Felaktigt val!");
                     System.out.println("=======================");
                
                break;
                
            //Avslutar programmet..   
            case 4:
                System.out.println("Programmet Avslutas!");
                
                System.exit(0);
                break;
                
                //om ett felaktigt val görs, startar programmet om från början.
                default: System.out.println("Felaktigt val!");
                System.exit(0);
            } 
        }
    }  
}
