package Figura;

public class Triangulo extends FiguraGeometrica {
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triángulo - Base: " + base + ", Altura: " + altura + ", " + super.toString();
    }
}
