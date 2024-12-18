package Figura;

public class Circulo extends FiguraGeometrica {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return "Círculo - Radio: " + radio + ", " + super.toString();
    }
}
