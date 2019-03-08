/**
El programa pide al usuario su nombre. luego pide al usuario
el numero de inicio y el de fin y elige un numero aleatorio entre ambos (ambos incluidos).
A continuación permite al usuario adivinar el numero en
sucesivos intentos. Cuando el usuario adivina el numero
el programa le da una puntuacion en funcion del tiempo (version
dificil) o del numero de intentos (version facil).
Al final muestra el cuadro de honor y vuelve a empezar preguntando el
nombre del nuevo jugador
 */
import java.util.*;
import java.util.Random;
public class Juego {
    public void Juego() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un número de inicio");
        int numeroInicio = scanner.nextInt();
        System.out.println("Introduce un número de fin");
        int numeroFin = scanner.nextInt();
        Random aleatorio = new Random();
        int solucion = aleatorio.nextInt(numeroFin);
        solucion += numeroInicio;
        boolean acierto = false;
        int puntuacionInicial = 10000;
        int puntuacionFinal = puntuacionInicial;
        for(int intentos = 0; !acierto; intentos ++){
            int respuesta = scanner.nextInt();
            System.out.println("introduce tu respuesta");
            if(respuesta == solucion){
                System.out.println("Enhorabuena! Has acertado!");
                acierto = true;
                puntuacionFinal -= intentos*100;
            }
            else if(respuesta < solucion){
                System.out.println("Error! la solucion es mayor que el número introducido");
            }
            else{
                System.out.println("Error! la solucion es menor que el número introducido");
            }
        }
        System.out.println(nombre + " ha obtenido " + puntuacionFinal + " puntos");
    }
}