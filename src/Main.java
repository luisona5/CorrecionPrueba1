import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuadrado cuadrado1 = new Cuadrado(2.0);
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

        System.out.println("----------- CON VALORES SETEADOS----------");

        // -----------VALORES SETEADOS-------------
        cuadrado1.setLado1(8.0);
        cuadrado1.CuadradoPerimetro();
        cuadrado1.CuadradoArea();
        //--------------------------------------
        rectangulo1.setBase(8);
        rectangulo1.setAltura(4);
        rectangulo1.Perimetro();
        rectangulo1.Area();
        //-------------------------------------------
        circulo1.setRadio(5.9);
        circulo1.Perimetro();
        circulo1.Area();
        //-------------------------------------------
        triangulo1.setAltura(10);
        triangulo1.setBase(3);
        triangulo1.Perimetro();
        triangulo1.Area();


        ;

    }
}