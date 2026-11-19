
package atividade1;

import java.util.Arrays;

public class Atividade1 {

   
    public static void main(String[] args) {
        int[] vetorA = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] vetorB;
        vetorB = new int[10];
        
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * i;
        }
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
    }
    
}
