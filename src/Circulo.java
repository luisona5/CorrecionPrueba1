public class Circulo {
    Double radio, perimetro,area;

    public Circulo() {}

    public Circulo(Double radio) {
        this.radio = radio;
    }
    public Double getRadio() { return radio; }
    public void setRadio(Double radio) { this.radio = radio; }

    public void Perimetro(){
        System.out.println("\n----------CIRCULO--------");
        System.out.println("Radio: " + radio);
        perimetro = radio*2*Math.PI;
        System.out.println("Perimetro: " + perimetro);
    }
    public void Area(){
        area = Math.PI*radio*radio;
        System.out.println("Area: " + area);
    }
}
