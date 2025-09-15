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

    public String getTipoFigura(){
        return "Retângulo";
    }

    public double calcularPerimetro(double largura, double altura){
        double perimetro;

        perimetro = (largura+altura)*2;
        
        return perimetro;
    }

    public double calcularArea(double largura, double altura){
        double area;
        
        area = largura*altura;

        return area;
    }

    public void getDetalhes(){
        getInfo();
        System.out.println("Largura: "+largura);
        System.out.println("Altura: "+altura);
    }
}
