package slagsmål_projekt;

import java.util.Scanner;

public class Slagsmål_projekt {

    public static short Php = 100;
    public static short Chp = 100;
    public static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("F(fight) eller S(shop): ");
        String fs = keyb.nextLine();
        if (fs.equalsIgnoreCase("f")) {
            Fight();
        } 
        
        keyb.nextLine();
        
        System.out.println("Vill du spela igen?");
        String spela = keyb.nextLine();
        if (spela.equalsIgnoreCase("JA")){
            System.out.println("Spelar igen");
            Fight();
        }
        else{
            System.out.println("okej");
        }
        
    }

    static void Fight() {
        while (Chp > 0 && Php > 0) {
            int fattack = (int) (Math.random() * 100);
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
                int träff = (int) (Math.random() * 100);
                if (träff > 25) {
                    System.out.println("Din attack träffade, du gör 10 damage");
                    Chp = (short) (Chp - 10);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack);
                }

            }
            if (att == 2) {
                int träff = (int) (Math.random() * 100);
                if (träff > 66) {
                    System.out.println("Din attack träffade, du gör 40 damage");
                    Chp = (short) (Chp - 40);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende(fattack);
                } else {
                    System.out.println("Din attack missade");
                    Fiende(fattack);
                }
            }
            
            else if(att == 3) {
                double evade = (Math.random() * 100);
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
        }
    }

    static void Fiende(int fattack){ 
        if (fattack > 40){
            Php =(short) (Php - 25);
            System.out.println("Din fiendes attack träffade, dem gör 25 skada. Du har " + Php +" hp kvar.");
        }
        else{
            System.out.println("Din fiendes attack missade, du hade tur.");
    }
    }
}
