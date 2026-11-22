
package atividade5;

import java.util.Arrays;
import java.util.Scanner;


public class Atividade5 {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double[] n1;
       n1 = new double[10];
       double[] n2;
       n2 = new double[10];
       double[] result;
       result = new double[10];
       
       for(int i = 0; i < 10; i++){
           System.out.println("---------------\n"
                   + "!!Primeiro Bimestre!!"
                   + "\nDigita a nota do "+(i+ 1)+ "° aluno: "
                   + "\n---------------");
           double nota1 = in.nextDouble();
           n1[i] = nota1;
           System.out.println("---------------\n"
                   + "!!Segundo Bimestre!!"
                   + "\nDigita a nota do "+(i+ 1)+ "° aluno: "
                   + "\n---------------");
           double nota2 = in.nextDouble();
           n2[i] = nota2;
           
           result[i] = (n1[i] + n2[i]) / 2;
           double media;
           System.out.println("---------------\nMédia do Aluno: " +result[i]+ "\n---------------");
           if(result[i] >= 7){
               System.out.println("Aprovado.");
           }else{
               System.out.println("Reprovado.");
           }
           
       }
    }
    
}
