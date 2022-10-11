/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villanueva;

import java.util.Scanner;

/**
 *
 * @author Villanueva_CPE112
 */
public class Villanueva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        do {
          System.out.println("If Addition type:       1");
          System.out.println("If Subtraction type:    2");
          System.out.println("If Multiplication type: 3");
          System.out.println("If Division type :      4");
          System.out.println("Please Choose An Operation: ");
          double x = input.nextDouble();
          
          if (x==1) {
              while (x==1){
                  System.out.println("Please input 2 intergers");
                  double x1 = input.nextDouble();
                  double x2 = input.nextDouble();
                  double ans = x1 + x2;
                  System.out.println("The answer is " + ans);
                  System.out.println("Do you want to Choose An Operation?");
                  System.out.println("If yes then enter 5");
                  x = input.nextDouble();
              }
          }else while (x==2){
              while (x==2){
                   System.out.println("Please input 2 intergers");
                  double x1 = input.nextDouble();
                  double x2 = input.nextDouble();
                  double ans1 = x1 - x2;
                  System.out.println("The answer is " + ans1);
                  System.out.println("Do you want to Choose An Operation?");
                  System.out.println("If yes then enter 5");
                  x = input.nextDouble();
              }
          } else if  (x==3){
                  while (x==3){
                   System.out.println("Please input 2 intergers");
                  double x1 = input.nextDouble();
                  double x2 = input.nextDouble();
                  double ans2 = x1 + x2;
                  System.out.println("The answer is " + ans2);
                  System.out.println("Do you want to Choose An Operation?");
                  System.out.println("If yes then enter 5");
                  x = input.nextDouble();
                  }
                  } else {
            while  (x==4){
           System.out.println("Please input 2 intergers");
                  double x1 = input.nextDouble();
                  double x2 = input.nextDouble();
                  double ans = x1 + x2;
                  System.out.println("The answer is " + ans);
                  System.out.println("Do you want to Choose An Operation?");
                  System.out.println("If yes then enter 5");
                  x = input.nextDouble();
      }
      }
        
    }
    
}
