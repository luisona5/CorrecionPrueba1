import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuadrado cuadrado1 = new Cuadrado(2.0);
        cuadrado1.CuadradoPerimetro();
        cuadrado1.CuadradoArea();
        cuadrado1.setLado1(8.0);
        cuadrado1.CuadradoPerimetro();
        cuadrado1.CuadradoArea();

        Rectangulo rectangulo1=new Rectangulo(2,3);
        rectangulo1.Perimetro();
        rectangulo1.Area();

    }
}