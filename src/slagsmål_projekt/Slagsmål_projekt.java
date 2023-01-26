package slagsmål_projekt;

import java.util.Scanner;

public class Slagsmål_projekt {
    public static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Tryck F(fight): ");
        String fs = keyb.nextLine();
        if (fs.equalsIgnoreCase("f")) {
            Karak();
        } 
        keyb.nextLine();
        System.out.println("Vill du spela igen?");
        String spela = keyb.nextLine();
        if (spela.equalsIgnoreCase("JA")){
            System.out.println("Spelar igen");
            Karak();
        }
        else{
            System.out.println("okej");
        }
        
    }

    static void Karak(){
        int Chp = 100;
        int Php = 100;
            String[] fält2 = new String[3];
            fält2[0] = "Sam";
            fält2[1] = "Teknikare";
            fält2[2] = "Ekonomi";
            
            for (String fält3 : fält2) {
                System.out.println(fält3);
            }
            System.out.println("Vilken karaktär vill du använda?: ");
            byte karaktär = keyb.nextByte();
            
            if(karaktär == 1){
                int träff = (int) (Math.random() * 100);
                int fattack = (int) (Math.random() * 100);
                System.out.println("Du valde Samhälle, inga fördelar men inga svagheter");
                Fight(Php, Chp, träff, fattack);
            }
            
            if(karaktär == 2){
                int träff = (int) (Math.random() * 100);
                int fattack = (int) (Math.random() * 100);
                System.out.println("Du valde Teknikare, mer hp men mindre chans att träffa");
                Php = Php + 50;
                Fight(Php, Chp, träff, fattack);
            }
            
            else if(karaktär == 3){
                int träff = (int) (Math.random() * 100);
                int fattack = (int) (Math.random() * 100);
                System.out.println("Du valde Ekonomi, mindre hp men högre chans att träffa");
                Php = Php - 25;
                Fight(Php, Chp, träff, fattack);
            }
    }
    
    
    
    static void Fight(int fattack, int träff,int Php, int Chp){
        while (Chp > 0 && Php > 0) {
            String[] fält = new String[3];
            fält[0] = "1 - Attack 1 - Hög chans att träffa låg dmg";
            fält[1] = "2 - Attack 2 - Låg chans att träffa men hög dmg";
            fält[2] = "3 - Evade - Chans att undvika fiende attack";
        
            for (String fält1 : fält) {
                System.out.println(fält1);
            }
            
            System.out.println("Vilken Attack vill du använda: ");
            byte att = keyb.nextByte();
            if (att == 1) {
                Attack1(Php, Chp, träff, fattack);
            }
            if (att == 2) {
               Attack2(Php, Chp, träff, fattack);
            }
            
            else if(att == 3) {
                Attack3(Php, Chp, träff, fattack);
            }
        }
    }
    
    
    static void Attack1(int fattack, int träff, int Php, int Chp){
                if (träff > 25) {
                    System.out.println("Din attack träffade, du gör 10 damage");
                    Chp = (byte) (Chp - 10);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack, Php, Chp, träff);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack, Php, Chp, träff);
                }
    }
    
    static void Attack2(int fattack, int träff, int Php, int Chp){
                if (träff > 66) {
                    System.out.println("Din attack träffade, du gör 40 damage");
                    Chp = (byte) (Chp - 40);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack, Php, Chp, träff);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack, Php, Chp, träff);
                }
    }
    
    static void Attack3(int Php, int Chp, int fattack, int träff){
                int evade = (int) (Math.random() * 100);
                if (evade >= 50){
                    System.out.println("Du försöker undvika fiende attacken och sänker deras träffsäkerhet");
                    fattack = fattack - 10;
                    Fiende(fattack, Php, Chp, träff);
                }
                else{
                    System.out.println("Du nuddade gräss ofriviligt");
                    Fiende(fattack, Php, Chp, träff);
                }
}
    
    static void Fiende(int fattack, int träff, int Php, int Chp){ 
        if (fattack > 40){
            Php =(byte) (Php - 25);
            System.out.println("Din fiendes attack träffade, dem gör 25 skada. Du har " + Php +" hp kvar.");
        }
        else{
            System.out.println("Din fiendes attack missade, du hade tur.");
    }
    }
}