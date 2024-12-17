package Figura;

public class Rectangulo implements FiguraGeometrica{
	private float base;
	private float altura;
	
	public Rectangulo(float base, float altura) {
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public float Area() {
		return base * altura;
	}
}
