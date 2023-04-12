package nivel.intermedio;

public class I05Rectangulo {
    private int base, altura, area;
    
    public I05Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void CalculoArea(){
        area = base * altura;
    }
    
    public void Imprimir(){
        CalculoArea();
        System.out.println("EL area es: " + area);
    }
    
}
