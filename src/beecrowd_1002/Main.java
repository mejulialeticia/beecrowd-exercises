package beecrowd_1002;

import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double raio, area;
        double n = 3.14159;

        raio = teclado.nextDouble();

        area = n*(raio*raio);
        System.out.printf("A=%.4f%n", area);
        teclado.close();
    }
}
