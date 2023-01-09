package slagsmål_projekt;
import java.util.Scanner;
public class Slagsmål_projekt {
    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("F(fight) or S(shop): ");
        String fs = keyb.nextLine();
        if(fs.equalsIgnoreCase("f")){
            Attack();
        }
        else if(fs.equalsIgnoreCase("f")){
            Shop();
        }
            
        
    }
    
    static void Attack(){
        short Chp = 150; 
        short Php = 125;
        while(Chp > 0 && Php > 0)
        System.out.println("What attack do you want to use?: ");
        
    }
    
    static void Shop(){
        System.out.println("What do you want to buy?: ");
        
        
        
    }

    
}
