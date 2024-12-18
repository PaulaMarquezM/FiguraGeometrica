package Figura;

public class ClaseAbstracuta {
	public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo(7, 10);
        FiguraGeometrica triangulo = new Triangulo(4, 8);
        FiguraGeometrica circulo = new Circulo(5);

        System.out.println("Rectángulo: " + rectangulo);
        System.out.println("Triángulo: " + triangulo);
        System.out.println("Círculo: " + circulo);

        System.out.println(rectangulo.mayorQue(triangulo));
        System.out.println(circulo.mayorQue(rectangulo));
        System.out.println(triangulo.mayorQue(circulo));
    }
}