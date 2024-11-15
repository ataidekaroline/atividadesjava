import java.util.Locale;
import java.util.Scanner;

public class At01 {
    public static void main (String[] args){//
        /*criar um programa onde leia as medidas de largura e comprimento
         * de um terreno retangular com uma casa decimal, bem como o valor do metro
         * quadrado do terreno, com duas casas decimais. em seguida, o programa deve
         * mostrar o valor da área do terreno, bem como o preço, ambos com duas casas decimais.
         */
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double largura = sc.nextDouble();
            double comprimento = sc.nextDouble();
            double metroQuadrado = sc.nextDouble();
            double area = largura * comprimento;
            double preco = area * metroQuadrado;

            System.out.printf("AREA = %.2f%n",  area);
            System.out.printf("PRECO = %.2f%n", preco);

            sc.close();
    }
}