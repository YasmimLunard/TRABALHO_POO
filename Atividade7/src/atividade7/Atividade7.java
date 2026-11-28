
package atividade7;

import java.util.Scanner;

public class Atividade7 {

    
    public static void main(String[] args) {
      int[] Ai;
       Ai = new int [10];
       
       Scanner in = new Scanner (System.in);
       
       for(int i = 0; i < Ai.length; i++){
        System.out.println("Digite o " +(i + 1)+"° valor do vetor: ");
        int valores = in.nextInt();
        Ai[i] = valores;
        }
       System.out.println("Vetor original: " );
       for(int i = 0; i < Ai.length;i++){
           System.out.println(Ai[i] + "");
       }
       for(int i = 0; i < Ai.length;i++){
           int aux = Ai[i];
           int j = i -1;
           while(j >= 0 && Ai[j] > aux){
               Ai[j+1] = Ai[j];
               j--;
               
           }
           Ai[j+1] = aux;
           
       }
       System.out.println("Vetor em ordem crescente: " ); 
       for(int j = 0; j < Ai.length;j++){
           System.out.println(Ai[j] + "");
       }
        
        
        
    }
}
