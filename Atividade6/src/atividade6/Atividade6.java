
package atividade6;

import java.util.Arrays;
import java.util.Scanner;


public class Atividade6 {

    
    public static void main(String[] args) {
       int[] Ai;
       Ai = new int [6];
       int[] Bi;
       Bi = new int[6];
       
       Scanner in = new Scanner (System.in);
       
       for(int i = 0; i < Ai.length; i++){
        System.out.println("Digite o " +(i + 1)+"° valor do vetor: ");
        int valores = in.nextInt();
        Ai[i] = valores;
        if(Ai[i] % 2 == 0){
            Bi[i] = 1;
        }else{
            Bi[i]= 0;
            
        }
      }
       System.out.println(Arrays.toString(Ai));
           System.out.println(Arrays.toString(Bi));

  
    }
    
}
