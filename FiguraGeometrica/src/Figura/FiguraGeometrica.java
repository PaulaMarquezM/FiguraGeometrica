package Figura;

public abstract class FiguraGeometrica {
   
    public abstract float calcularArea();

   
    public String mayorQue(FiguraGeometrica otraFigura) {
        String nombreEstaFigura = this.getClass().getSimpleName();
        String nombreOtraFigura = otraFigura.getClass().getSimpleName();

        if (this.calcularArea() > otraFigura.calcularArea()) {
            return nombreEstaFigura + " tiene un área mayor que " + nombreOtraFigura + ".";
        } else if (this.calcularArea() < otraFigura.calcularArea()) {
            return nombreOtraFigura + " tiene un área mayor que " + nombreEstaFigura + ".";
        } else {
            return nombreEstaFigura + " y " + nombreOtraFigura + " tienen el mismo área.";
        }
    }

   
    @Override
    public String toString() {
        return "Área: " + calcularArea();
    }
}
