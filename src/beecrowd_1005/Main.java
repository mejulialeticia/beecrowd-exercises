package beecrowd_1005;

import java.util.Scanner;
public class Main {
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        //nota A corresponde a 25% e nota B 75
        double A, B, MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        if(A <= 10.0 && B <= 10.0 ){

            MEDIA = ( A*3.5 + B*7.5) /11.0;
            System.out.printf("MEDIA = %.5f%n", MEDIA);
            
        teclado.close();
        }
    }
}