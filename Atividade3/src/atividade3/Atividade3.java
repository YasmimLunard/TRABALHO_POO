
package atividade3;


public class Atividade3 {

    
    public static void main(String[] args) {
       int[] vetorA = {56, 78, 32, 15, 67, 44, 27, 81, 90, 12};
       int soma = 0;
       
       for(int i = 0; i < vetorA.length; i++){
           soma = soma + vetorA[i];
           
       }
        System.out.println(soma);
    }
    
}
