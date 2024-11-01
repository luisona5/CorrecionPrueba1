import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuadrado cuadrado1 = new Cuadrado(2.0,2.0,2.0,2.0);
        cuadrado1.CuadradoPerimetro();
        cuadrado1.CuadradoArea();
        cuadrado1.setLado1(3.0);
        cuadrado1.setLado2(3.0);
        cuadrado1.setLado3(3.0);
        cuadrado1.setLado4(3.0);
        cuadrado1.CuadradoPerimetro();
        cuadrado1.CuadradoArea();

    }
}