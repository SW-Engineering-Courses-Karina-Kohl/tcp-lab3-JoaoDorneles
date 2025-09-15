public abstract class FiguraGeometrica{

public String cor;
public int id;
public static int totalFiguras;

public FiguraGeometrica(String cor){
    id = totalFiguras;
    totalFiguras++;
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

public void getInfo(){
    System.out.println("Id: "+id);
    System.out.println("Cor: "+cor);
}

public abstract void getDetalhes();

}
