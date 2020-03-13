import java.text.DecimalFormat;

public class Circulo{
    public static void main(String[] args){
        DecimalFormat metros = new DecimalFormat("##.##m");
        int raio = 5;
        double area;
        
        area = Math.PI*(raio*raio);
        
        System.out.println("A area de um circulo de "+metros.format(raio)+" de raio é igual a "+metros.format(area));
    }
}
