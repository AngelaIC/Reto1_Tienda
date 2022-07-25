import java.lang.Math;
public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static int [] reporte(int [] compra){
        //EN ESTE ESPACIO PONER SU LÓGICA
        int []cuenta;
        cuenta = new int [3];
       
        int costo_total_compra = 0;
        int producto_mas_barato = Integer.MAX_VALUE;
        int producto_mas_caro = Integer.MIN_VALUE;
        
        for (int i=0; i < compra.length; i++){
            costo_total_compra += compra[i];
            producto_mas_barato  = Math.min(producto_mas_barato, compra[i]);
            producto_mas_caro  = Math.max(producto_mas_caro, compra[i]);
        }
        cuenta[0]= costo_total_compra;
        cuenta[1]= producto_mas_barato;
        cuenta[2]= producto_mas_caro;
        
        return cuenta;
        
        
        
    }
}
