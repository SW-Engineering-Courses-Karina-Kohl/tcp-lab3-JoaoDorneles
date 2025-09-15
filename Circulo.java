public class Circulo extends FiguraGeometrica{

    double raio;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

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

    public void getDetalhes(){
        getInfo();
        System.out.println("Raio: "+raio);
    }
}
