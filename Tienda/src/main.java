
public class main {
    public static void main(String[] args) {
        Tienda pro1 = new Tienda(1,2019,"Lapiz",0.3);
        Tienda pro2 = new Tienda(1,2019,"Borrador",0.25);
        Tienda pro3 = new Tienda(1,2019,"Boligrafo",0.4);
        Tienda pro4 = new Tienda(1,2019,"Cuaderno",1.5);
        
        
        pro1.consultar();
        pro2.consultar();
        pro3.consultar();
        pro4.consultar();
        
        pro1.Total();
        pro2.Total();
        pro3.Total();
        pro4.Total();

        pro1.consultar();
        pro2.consultar();
        pro3.consultar();
        pro4.consultar();
        
    }
}