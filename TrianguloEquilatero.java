public class TrianguloEquilatero extends FiguraGeometrica{

    double lado;

    public TrianguloEquilatero(String cor, double lado){
        super(cor);
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public String getTipoFigura(){
        return "Triângulo Equilátero";
    }

    @Override
    public double calcularPerimetro(){
        double perimetro;
        
        perimetro = lado*3;

        return perimetro;
    }

    @Override
    public double calcularArea(){
        double area;

        area = (((Math.pow(lado,2))*(Math.sqrt(3))))/4;
 
        return area;
    }

    public String getDetalhes(){
        return "Lados: " + lado;
    }

}
