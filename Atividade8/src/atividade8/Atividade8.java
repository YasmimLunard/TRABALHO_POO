
package atividade8;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double[][] mA = new double [2][5];
       
       
       for(int i = 0; i < 2;i++){
           System.out.println("Preenchendo a " +(i + 1)+ "° linha!");
       for(int j = 0; j < 5;j++){
           System.out.println("Digite o valor da " +(j + 1)+ "° coluna: ");
           double valores = in.nextDouble();
           mA[i][j] = valores;
       }
       }
        System.out.print("Valores armazenados: \n");
        for(int i = 0; i < 2;i++){
            System.out.print("Linha " +(i+1)+ " :  ");
             for(int j = 0; j < 5;j++){
                 
                 System.out.print(mA[i][j]+ " ");
             }
             System.out.println();
        }
        
    }
    
}
