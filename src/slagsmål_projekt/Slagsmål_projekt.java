package slagsmål_projekt;

import java.util.Scanner;

public class Slagsmål_projekt {
    
    public static int Php = 100;
    public static int Chp = 100;
    public static byte CPoints = 0;
    public static byte PPoints = 0;
    
    public static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(CPoints < 3 && PPoints < 3){
            System.out.println("Du har " + PPoints + " poäng, medans datorn har " + CPoints);
        System.out.println("Tryck F(fight) eller I(instruktioner): ");
        String fi = keyb.nextLine();
        if (fi.equalsIgnoreCase("f")) {
            Karak();
            Chp = 100;
            Php = 100;
        } 
        if (fi.equalsIgnoreCase("I")){
            Instruk();
        }
    }
    }
    static void Karak(){
            String[] fält2 = new String[3];
            fält2[0] = "1 - Sam - inga fördelar men inga svagheter";
            fält2[1] = "2 - Teknikare - mer hp men mindre chans att träffa";
            fält2[2] = "3 - Ekonomi - mindre hp men högre chans att träffa";
            
            for (String fält3 : fält2) {
                System.out.println(fält3);
            }
            System.out.println("Vilken karaktär vill du använda?: ");
            byte karaktär = keyb.nextByte();
            
            if(karaktär == 1){
                System.out.println("Du valde Samhälle, inga fördelar men inga svagheter");
                String vald = "S";
                Fight(vald);
            }
            
            if(karaktär == 2){
                System.out.println("Du valde Teknikare, mer hp men mindre chans att träffa");
                String vald = "T";
                Php = Php + 50;
                Fight(vald);
            }
            
            else if(karaktär == 3){
                System.out.println("Du valde Ekonomi, mindre hp men högre chans att träffa");     
                String vald = "E";
                Php = Php - 25;
                Fight(vald);
            }
    }
    
     static void Fight(String vald){
        while (Chp > 0 && Php > 0) {
            System.out.println(vald);
            switch(vald){
                case "S":
                    VäljSam();
                case "T":
                    VäljTek();
                case "E":
                    VäljEkon();
            }   
            if(Php <= 0){
                CPoints ++;
            }
            if(Chp <= 0){
                PPoints ++;
            }
    }
    }
     
     static void VäljSam(){
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
                Attack1Sam();
            }
            if (att == 2) {
               Attack2Sam();
            }
            
            else if(att == 3) {
                EvadeSam();
            }
        }
     
static void VäljTek(){
            String[] fält = new String[3];
            fält[0] = "1 - Attack 1 - Hög chans att träffa låg dmg";
            fält[1] = "2 - Attack 2 - Låg chans att träffa men hög dmg";
            fält[2] = "3 - Evade - Chans att undvika fiende attack";
        
            for (String fält1 : fält) {
                System.out.println(fält1);
            }
            try{   
            System.out.println("Vilken Attack vill du använda: ");
            }
            catch(Exception e){
                System.out.println("Du skrev inte 1-3");
            }
            byte att = keyb.nextByte();
            if (att == 1) {
                Attack1Tek();
            }
            if (att == 2) {
               Attack2Tek();
            }
            
            else if(att == 3) {
                EvadeTek();
            }
        }

static void VäljEkon(){
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
                Attack1Ekon();
            }
            if (att == 2) {
               Attack2Ekon();
            }
            
            else if(att == 3) {
                EvadeEkon();
            }
        }
     
static void Attack1Sam(){
        int träff = (int) (Math.random() * 100);
        int fattack = (int) (Math.random() * 100);
                if (träff > 25) {
                    System.out.println("Din attack träffade, du gör 10 damage");
                    Chp = (byte) (Chp - 10);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack);
                }
    }
         
    static void Attack1Tek(){
        int träff = (int) (Math.random() * 100);
                träff = träff - 15;
        int fattack = (int) (Math.random() * 100);
        if (träff > 25) {
                    System.out.println("Din attack träffade, du gör 15 damage");
                    Chp = (byte) (Chp - 15);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack);
                }
    }
    
    static void Attack1Ekon(){
        int träff = (int) (Math.random() * 100);
                träff = träff + 10;
        int fattack = (int) (Math.random() * 100);
        if (träff > 25) {
                    System.out.println("Din attack träffade, du gör 7 damage");
                    Chp = (byte) (Chp - 7);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack);
                }
    }
    
    static void Attack2Sam(){
        int träff = (int) (Math.random() * 100);
        int fattack = (int) (Math.random() * 100);
                if (träff > 66) {
                    System.out.println("Din attack träffade, du gör 40 damage");
                    Chp = (byte) (Chp - 40);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack);
                }
    }
    
    static void Attack2Tek(){
        int träff = (int) (Math.random() * 100);
        träff = träff - 15;
        int fattack = (int) (Math.random() * 100);
                if (träff > 66) {
                    System.out.println("Din attack träffade, du gör 50 damage");
                    Chp = (byte) (Chp - 50);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack);
                }
    }
    
    static void Attack2Ekon(){
        int träff = (int) (Math.random() * 100);
        träff = träff + 10;
        int fattack = (int) (Math.random() * 100);
                if (träff > 66) {
                    System.out.println("Din attack träffade, du gör 40 damage");
                    Chp = (byte) (Chp - 40);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack);
                }
    }
    
    static void EvadeSam(){
        int fattack = (int) (Math.random() * 100);
                int evade = (int) (Math.random() * 100);
                if (evade >= 50){
                    System.out.println("Du försöker undvika fiende attacken och sänker deras träffsäkerhet");
                    fattack = fattack - 10;
                    Fiende(fattack);
                }
                else{
                    System.out.println("Du nuddade gräss ofriviligt");
                    Fiende(fattack);
                }
}
    
    static void EvadeTek(){
        int fattack = (int) (Math.random() * 100);
        int evade = (int) (Math.random() * 100);
        evade = evade - 15;
                if (evade >= 50){
                    System.out.println("Du försöker undvika fiende attacken och sänker deras träffsäkerhet");
                    fattack = fattack - 10;
                    Fiende(fattack);
                }
                else{
                    System.out.println("Du nuddade gräss ofriviligt");
                    Fiende(fattack);
                }
}
    
    static void EvadeEkon(){
        int fattack = (int) (Math.random() * 100);
        int evade = (int) (Math.random() * 100);
        evade = evade + 10;
                if (evade >= 40){
                    System.out.println("Du försöker undvika fiende attacken och sänker deras träffsäkerhet");
                    fattack = fattack - 10;
                    Fiende(fattack);
                }
                else{
                    System.out.println("Du nuddade gräss ofriviligt");
                    Fiende(fattack);
                }
}
    
    static void Fiende(int fattack){ 
        if (fattack > 40){
            Php =(byte) (Php - 25);
            System.out.println("Din fiendes attack träffade, dem gör 25 skada. Du har " + Php +" hp kvar.");
        }
        else{
            System.out.println("Din fiendes attack missade, du hade tur.");
    }
    }
    
    static void Instruk(){
        System.out.println("Det är Du mot en dator i en fight till döden.");
        System.out.println("Du får välja mellan olika karaktärer som har olika attributer så som mer hp");
        System.out.println("Varje karaktär har även lite olika attacker");
        System.out.println("Det är försten mellan dig och datorn till 3 poäng");
}
}