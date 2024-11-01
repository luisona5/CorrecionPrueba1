public class Triangulo {
    int base, altura,hipotenusa;
    int perimetro,area;

    public Triangulo() {}
    public Triangulo(int base, int altura, int hipotenusa) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
    }
    public int getBase() { return base; }
    public int getAltura() { return altura; }
    public int getHipotenusa() { return hipotenusa; }

    public void setBase(int base) { this.base = base; }
    public void setAltura(int altura) { this.altura = altura; }
    public void setHipotenusa(int hipotenusa) { this.hipotenusa = hipotenusa; }

    public void Perimetro() {
        System.out.println("\n-------------TRIANGULO-------");
        System.out.println("base: " + base);
        System.out.println("altura: " + altura);
        System.out.println("hipotenusa: " + hipotenusa);
        perimetro = base+altura+hipotenusa;
        System.out.println("Perimetro: " + perimetro);

    }
    public void Area() {
        area = (base*altura)/2;
        System.out.println("Area: " + area);
    }
}
