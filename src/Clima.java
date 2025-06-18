import java.util.ArrayList;
import java.util.Scanner;

import com.objetos.Mes;

public class Clima {
    public static void main(String[] args) throws Exception {
        
        // Mes mes = new Mes();
        // mes.setNombre("Marzo");
        // mes.setTempMax(35);
        // mes.setTempMin(20);
        // System.out.println(mes);


        ArrayList<Mes> meses = new ArrayList<Mes>();
    
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 1; i <= 12; i++) {
        
            Mes mes = new Mes();
            System.out.println("\nIngresa el mes " + (i));
            String nombre = teclado.nextLine();
            mes.setNombre(nombre);

            System.out.println("\nMáxima Temperatura: ");
            int tempMax = Integer.parseInt(teclado.nextLine());
            mes.setTempMax(tempMax);

            System.out.println("\nMínima Temperatura: ");
            int tempMin = Integer.parseInt(teclado.nextLine());
            mes.setTempMin(tempMin);


            meses.add(mes);
        
        }
        
        for(Mes mes: meses) {
            System.out.println(mes);
        }
        
    }
}
