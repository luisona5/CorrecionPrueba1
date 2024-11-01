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

        Circulo circulo1=new Circulo(3.15);
        circulo1.Perimetro();
        circulo1.Area();

        Triangulo triangulo1=new Triangulo(2,3,4);
        triangulo1.Perimetro();
        triangulo1.Area();

    }
}