public class Retangulo {
    public String getTipoFigura(){
        return "Retângulo";
    }

    public double calcularPerimetro(double base, double altura){
        double perimetro;

        perimetro = (base+altura)*2;
        
        return perimetro;
    }

    public double calcularArea(double base, double altura){
        double area;
        
        area = base*altura;

        return area;
    }
}
