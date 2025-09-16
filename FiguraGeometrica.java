public abstract class FiguraGeometrica implements CalculosGeometricos{

public String cor;
public int id;
public static int totalFiguras;

public FiguraGeometrica(String cor){
    this.cor=cor;
    totalFiguras++;
    id = totalFiguras;
}

public void setCor(String cor){
    this.cor = cor;
}

public String getCor(){
    return cor;
}

public static int getTotalFiguras(){
    return totalFiguras;
}

public String getInfo(){
    return "Id: " + id + ", Cor: " + cor + ", Tipo: " + getTipoFigura() + ", " + getDetalhes();
}

public abstract String getDetalhes();

}
