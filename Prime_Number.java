/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_number;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kotik
 */
public class Prime_Number {

    
    public static void isPrime(int n)
    {
        int count=0;
        if(n>=0 && n%2==0 && n!=2){
              System.out.println("Not a prime number");
          }else if(n>=0){
              for(int i=3; i<n; i++){
                  if(n%i == 0){
                        count++;  
                  }
              }
              if(count==0 || n==2){
                  System.out.println("Prime Number!!!");
              }else{
                  System.out.println("Not a PrimeNumber");
              }
          }else{
              System.out.println("Enter valid input");
          }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
          
          
          System.out.println("Enter to check if its prime or not!");
              while(true)
              {
               
               try{
               int n = scan.nextInt();
               isPrime(n);
                }catch(Exception e){
                    System.out.println("Enter a valid input!");
                    break;
                }
                
              }
}
}
                
        


    
