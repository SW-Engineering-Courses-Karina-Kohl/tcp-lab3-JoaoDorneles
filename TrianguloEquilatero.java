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

    public String getTipoFigura(){
        return "Triângulo Equilátero";
    }

    public double calcularPerimetro(double lado){
        double perimetro;
        
        perimetro = lado*3;

        return perimetro;
    }

    public double calcularArea(double lado){
        double area;

        area = (((Math.pow(lado,2))*(Math.sqrt(3))))/4;
 
        return area;
    }

    public void getDetalhes(){
        System.out.println("Lado: "+lado);
    }

    public void getInfo(){
        getDetalhes();
    }

}
