public class Retangulo extends FiguraGeometrica{
    
    double largura;
    double altura;
    
    public Retangulo(String cor, double largura, double altura){
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public double getlargura(){
        return largura;
    }

    public void setlargura(double largura){
        this.largura = largura;
    }

    public double getaltura(){
        return altura;
    }

    public void setaltura(double altura){
        this.altura = altura;
    }

    @Override
    public String getTipoFigura(){
        return "Retângulo";
    }

    @Override
    public double calcularPerimetro(){
        double perimetro;

        perimetro = (largura+altura)*2;
        
        return perimetro;
    }

    @Override
    public double calcularArea(){
        double area;
        
        area = largura*altura;

        return area;
    }

    public String getDetalhes(){
        return "Largura: " + largura + ", Altura: "+ altura;
    }
}
