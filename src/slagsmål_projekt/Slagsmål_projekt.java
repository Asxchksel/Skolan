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
        } else if (fs.equalsIgnoreCase("s")) {
            Shop();
        }

    }

    static void Fight() {
        while (Chp > 0 && Php > 0) {

            System.out.println("Vilken Attack vill du använda: ");
            int att = keyb.nextInt();

            if (att == 1) {
                int träff = (int) (Math.random() * 100);
                if (träff > 25) {
                    System.out.println("Din attack träffade, du gör 10 damage");
                    Chp = (short) (Chp - 10);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende();
                } else {
                    System.out.println("Din attack missade");
                    Fiende();
                }

            }
            if (att == 2) {
                int träff = (int) (Math.random() * 100);
                if (träff > 66) {
                    System.out.println("Din attack träffade, du gör 40 damage");
                    Chp = (short) (Chp - 40);
                    System.out.println("Fiende har " + Chp + " Hp kvar");
                    Fiende();
                } else {
                    System.out.println("Din attack missade");
                    Fiende();
                }
            }
            
            else if(att == 3) {
                double evade = (Math.random() * 100);
                if (evade >= 50){
                   /* System.out.println(fattack);
                    fattack = fattack - 15;
                    System.out.println(fattack);*/
                    Fiende();
                }
                else{
                    System.out.println("Du nuddade gräss ofriviligt");
                    Fiende();
                }
            }
        }
    }

    static void Fiende(){
        int fattack = (int) (Math.random() * 100);
        if (fattack > 45){
            Php =(short) (Php - 25);
            System.out.println("Din fiendes attack träffade, dem gör 25 skada. Du har " + Php +" hp kvar.");
        }
        else{
            System.out.println("Din fiendes attack missade, du hade tur.");
    }
    }
    
    static void Shop() {
        String[] fält = new String[4];
        fält[0] = "Redbull - 50 Vbucks";
        fält[1] = "Vatten - 30 Vbucks";
        fält[2] = "Doritos - 75 Vbucks";
        fält[3] = "d";
        
         for(int i=0; i<fält.length; i++)
        {
            System.out.println(i + ": " + fält[i]);
        }

        System.out.println("Vad vill du köpa?: ");
        int köp = keyb.nextInt();
        
        ;
        
    }
}
