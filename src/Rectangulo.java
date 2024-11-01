public class Rectangulo {
    int base, altura;
    int perimetro, area;

    public Rectangulo() {}
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //-------construyendo los getters------
    public int getBase1() { return base; }
    public int getBase2() { return base; }
    public int getAltura1() { return altura; }
    public int getAltura2() { return altura; }

    //-----construyendo los setters------------
    public void setBase(int base) { this.base = base; }
    public void setAltura(int altura) { this.altura = altura; }

    //---------metodo personalizado-------------

    public void Perimetro(){
        System.out.println("Perimetro del Rectangulo");
        System.out.println("base1: " + base);
        System.out.println("altura1: " + altura);
        perimetro = (2*base)+(2*altura);
        System.out.printf("Perimetro es: "+ perimetro);

    }
    public void Area(){
        System.out.println("\nArea del Rectangulo");
        System.out.println("base: " + base);
        System.out.println("Altura: " + altura);
        area = base*altura;
        System.out.printf("Area  es: "+ area);
    }
}
