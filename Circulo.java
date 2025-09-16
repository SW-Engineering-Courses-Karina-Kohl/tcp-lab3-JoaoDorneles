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

    @Override
    public String getTipoFigura(){
        return "Círculo";
    }

    @Override
    public double calcularPerimetro(){
        double perimetro;

        perimetro = 2*Math.PI*getRaio();

        return perimetro;
    }

    @Override
    public double calcularArea(){
        double area;
        
        area = Math.PI*(Math.pow(getRaio(),2));

        return area;
    }

    public String getDetalhes(){
        return "Raio: "+ raio;
    }

}
