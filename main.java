/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg11;

/**
 * CECCS 227 Sec 4
 * Lab #11
 * @author Yisacor
 * Description: This program allows a user to select a ball by entering color 
                and allows the user to roll or bounce the ball and returns 
                 number of times the user has bounced and/or rolled that 
                 particular color ball.
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     * main method: asks the user to enter color until they want to quit; 
                    then gives the option to role/bounce the ball.
                    then display #of times the user bounced/rolled the ball
     */
    public static void main(String[] args) {
       
       boolean quit = false;
       do {
            System.out.print("Choose a ball color (q to quit): ");
            String ballColor = CheckInput.getString();
            if (!"q".equals(ballColor)){
                System.out.println("1. Roll ball");
                System.out.println("2. Bounce ball");
                int option = CheckInput.getIntRange(1, 2);
                Ball b = Ball.getInstance(ballColor);
                if (option == 1){
                    b.roll();
                    System.out.println("You roll the "+ballColor+" ball");
                    System.out.println(b.toString());
                }
                if (option == 2){
                    b.bounce();
                    System.out.println("You bounce the "+ballColor+" ball");
                    System.out.println(b.toString());
                }        
            }
            else{
                quit = true;
            }
       }while (!quit);
    }
    
}
