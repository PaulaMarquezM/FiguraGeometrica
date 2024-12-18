package Figura;

public class Rectangulo extends FiguraGeometrica {
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo - Base: " + base + ", Altura: " + altura + ", " + super.toString();
    }
}
