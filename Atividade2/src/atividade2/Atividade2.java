
package atividade2;

import java.util.Arrays;

public class Atividade2 {

    
    public static void main(String[] args) {
        int[] vetorA = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] vetorB = {56, 78, 32, 15, 67, 44, 27, 81, 90, 12};
        int[] vetorC;
        vetorC = new int[10];
        
        for(int i = 0; i < vetorA.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
        System.out.println(Arrays.toString(vetorC));
    }
    
}
