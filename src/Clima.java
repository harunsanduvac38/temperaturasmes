import java.util.ArrayList;
import java.util.Random;
// import java.util.Scanner;


import com.objetos.Mes;

public class Clima {
    public static void main(String[] args) throws Exception {
        
        // Mes mes = new Mes();
        // mes.setNombre("Marzo");
        // mes.setTempMax(35);
        // mes.setTempMin(20);
        // System.out.println(mes);


        ArrayList<Mes> meses = new ArrayList<Mes>();
        String[] nombreMeses = new String[] {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

    
        // Scanner teclado = new Scanner(System.in);
        
        for(int i = 1; i <= 12; i++) {
        
            Mes mes = new Mes();
            
            String nombre = nombreMeses[i-1];
            mes.setNombre(nombre);
            
            // Random.nexInt(int origin, int bound): para generar número aleatoreamente entre origin y bound
            // Random random = new Random();
            // int numRandom = random.nextInt(); 


            double tempMax = Math.round(((Math.random() * 65) -15) * 100.0) / 100.0;
            mes.setTempMax(tempMax);

            
            double tempMin = Math.round(((Math.random() * (mes.getTempMax() + 16)) - 15) * 100.0) / 100.0;
            mes.setTempMin(tempMin);


            meses.add(mes);
        
        }
        
        for(Mes mes: meses) {
            System.out.println(mes);
        }

        
    }
}
