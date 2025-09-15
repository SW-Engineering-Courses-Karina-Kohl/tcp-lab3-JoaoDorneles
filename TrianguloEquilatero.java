public class TrianguloEquilatero {
    public String getTipoFigura(){
        return "Triângulo";
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
}
