import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean numeromayor9=false;
        int contador=0;
        int totalPuntos=0;
        int maxPuntos=0;
        int minPuntos=Integer.MAX_VALUE;

        for (; ;) {
            int puntos= scanner.nextInt();
            if(puntos == -1){
                break;
            }
            contador++;
            totalPuntos= totalPuntos + puntos;
            if(puntos > 9){
                numeromayor9 = true;
            }
            if(puntos>maxPuntos){
                maxPuntos = puntos;
            }
            if(puntos<maxPuntos){
                maxPuntos = puntos;
            }
            if(puntos<minPuntos){
                minPuntos = puntos;
            }
        }
        System.out.println(numeromayor9);
        System.out.println(contador);
        System.out.println(totalPuntos);
        System.out.println(maxPuntos);
        System.out.println(minPuntos);


    }
}

//2 3 4 10 4  -1