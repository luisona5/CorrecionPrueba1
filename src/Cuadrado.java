public class Cuadrado {
    Double lado1, lado2, lado3, lado4,perimetro,area;
    public Cuadrado() {}
    public Cuadrado(Double l1, Double l2, Double l3, Double l4) {
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
        this.lado4 = l4;
    }

    // ----- contruyendo los getters--------
    public Double getLado1() { return lado1; }
    public Double getLado2() { return lado2; }
    public Double getLado3() { return lado3; }
    public Double getLado4() { return lado4; }

    //----- cosntruyendo los stters----------
    public void setLado1(Double lado1) { this.lado1 = lado1; }
    public void setLado2(Double lado2) { this.lado2 = lado2; }
    public void setLado3(Double lado3) { this.lado3 = lado3; }
    public void setLado4(Double lado4) { this.lado4 = lado4; }

    //------metodo personalizado------------

    public void CuadradoPerimetro(){
        System.out.println("----------CUADRADO----------\t");
        System.out.println("---PERIMETRO-----");
        System.out.println("lado1: " + lado1);
        System.out.println("lado2: " + lado2);
        System.out.println("lado3: " + lado3);
        System.out.println("lado4: " + lado4);
        perimetro=lado1+lado2+lado3+lado4;
        System.out.println("Perimetro: "+perimetro);
        System.out.println("------------------------------");
    }
    public void CuadradoArea(){
        System.out.println("---Area-----");
        System.out.println("lado1: "+lado1);
        System.out.println("lado2: "+lado2);
        area=lado1*lado2;
        System.out.println("Area: "+area);
    }
}
