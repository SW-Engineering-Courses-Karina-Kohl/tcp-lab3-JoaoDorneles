public class Circulo {

    public String getTipoFigura(){
        return "Círculo";
    }

    public double calcularPerimetro(double raio){
        double perimetro;

        perimetro = 2*Math.PI*raio;

        return perimetro;
    }

    public double calcularArea(double raio){
        double area;
        
        area = Math.PI*(Math.pow(raio,2));

        return area;
    }
}
