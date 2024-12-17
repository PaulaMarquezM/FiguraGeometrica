package Figura;


public interface FiguraGeometrica {
    float Area();

public static void main(String[] args) {
    FiguraGeometrica rectangulo = new Rectangulo(5, 10);
    FiguraGeometrica triangulo = new Triangulo(4, 7);
    FiguraGeometrica circulo = new Circulo(3);

    System.out.println("Area del Rectangulo: " + rectangulo.Area());
    System.out.println("Area del Triangulo: " + triangulo.Area());
    System.out.println("Area del Circulo: " + circulo.Area());
	}
}
