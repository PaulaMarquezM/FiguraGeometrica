package Figura;

public class Circulo implements FiguraGeometrica {
	private float radio ;
	
	public Circulo(float radio) {
		this.radio = radio;
	}
	
	@Override
	public float Area() {
		float area = (float)(Math.PI * (Math.pow(radio, 2)));
		return area;  
	}
	
}
