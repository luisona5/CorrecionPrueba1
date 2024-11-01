public class Cuadrado {
    Double lado1,perimetro,area;
    public Cuadrado() {}
    public Cuadrado(Double l1) {
        this.lado1 = l1;

    }

    // ----- contruyendo los getters--------
    public Double getLado1() { return lado1; }


    //----- cosntruyendo los stters----------
    public void setLado1(Double lado1) { this.lado1 = lado1; }


    //------metodo personalizado------------

    public void CuadradoPerimetro(){
        System.out.println("----------CUADRADO----------\t");
        System.out.println("lado1: " + lado1);
        perimetro=4*lado1;
        System.out.println("Perimetro: "+perimetro);
    }
    public void CuadradoArea(){
        area=lado1*lado1;
        System.out.println("Area: "+area);
        System.out.println("------------------------------");
    }
}
