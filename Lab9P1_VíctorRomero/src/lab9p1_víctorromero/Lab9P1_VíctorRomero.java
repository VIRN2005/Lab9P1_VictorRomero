package lab9p1_víctorromero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab9P1_VíctorRomero {
    
    static Scanner leer = new Scanner(System.in);
    static Random aleatorio = new Random();

    static  Game G = new Game();
    
    public static void main(String[] args) {
       

        int opcion = menu();
        while (opcion != 4) {

            switch (opcion) {

                case 1: {
                    System.out.println("Ingrese las Rondas a Jugar: ");
                    int rondas=leer.nextInt();
                    
                    int[][] numeros = new int[10][10];
                    int[][] next = new int[10][10];

                    ArrayList<String> coordenandas = new ArrayList();
                    numeros = lectura(numeros,next, coordenandas);
                    System.out.println(G.imprimir(G.getNumbers()));
                    G.jugar(rondas);
                    //numeros = metodo;
                    //g.setTablero(numeros);
                break;
                }
            }
        }
    }

    public static int menu() {
        int opcion = 0;
        System.out.println("_____________________________________________________________ ");
        System.out.println(" ");
        System.out.println(">> MENU <<");
        System.out.println("----------------------- ");

        System.out.println("1 -> EJERCICIO 1 - GAME OF LIFE");
        System.out.println("2 -> SALIDA");
        
        System.out.print("ESCOJA LA OPCION: ");
        opcion=leer.nextInt();

        return opcion;
    }

    public static int[][] lectura(int[][] numeros, int[][] next, ArrayList<String> Numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                if (i == 0 || j == 0 || i == numeros.length - 1 || j == numeros[1].length - 1) {
                    numeros[i][j] = 0;
                } else {
                    numeros[i][j] = aleatorio.nextInt(2);
                }
                if(numeros[i][j] == 1){
                    Numeros.add(Integer.toString(i+1)+":"+Integer.toString(j+1));
                }
            }
        }
        G.setNumbers(Numeros);
        System.out.println(Numeros);
        G.setNumeros(numeros);
        
        return numeros;
        //g.print(Numeros);
    }

    }



