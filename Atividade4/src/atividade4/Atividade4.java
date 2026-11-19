
package atividade4;


public class Atividade4 {

    
    public static void main(String[] args) {
       int[] vetorA = {56, 78, 32, 15, 67, 44, 27, 81, 90, 12};
       double impar = 0;
       double par = 0;
       double percentualP;
       double percentualIm;
       
       for(int i = 0; i < vetorA.length; i++){
           if(vetorA[i] % 2 == 0){
               par++;
           }else{
               impar++;
           }
          
       }
         percentualP = (par * 100.0) / 10;
           percentualIm = (impar * 100.0) / 10;
           
           System.out.println("O percentual de números pares é: " +String.format("%.2f", percentualP));
           System.out.println("O percentual de números impares é: "  +String.format("%.2f", percentualIm));
          
    }
    
}
