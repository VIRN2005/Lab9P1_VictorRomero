package lab9p1_victorromero;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;

public class Game {

    static Random aleatorio = new Random();

    public int[][] numeros;
    public int[][] next;
    public ArrayList<String> Numbers;
    public int rondas;

    public Game() {
//        this.numeros = numeros;
//        this.next = next;
//        this.Numbers = Numbers;
//        this.rondas = rondas;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        Game.aleatorio = aleatorio;
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[][] numeros) {
        this.numeros = numeros;
    }

    public int[][] getNext() {
        return next;
    }

    public void setNext(int[][] next) {
        this.next = next;
    }

    public ArrayList<String> getNumbers() {
        return Numbers;
    }

    public void setNumbers(ArrayList<String> Numbers) {
        this.Numbers = Numbers;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public void jugar(int rondas) {
        for (int i = 0; i < rondas; i++) {
            System.out.println(imprimir(Numbers));
            nextGen();
        }

    }

    public void nextGen() {
        int[][] temp = new int[10][10];
        Numbers.clear();
        int cont = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                cont = 0;
                if (temp[i][j + 1] == 1){
                    cont++;
                }
                if (temp[i][j + 1] == 1){
                    cont++;
                }
                if (temp[i][j - 1] == 1){
                    cont++;
                }
                if (temp[i + 1][j + 1] == 1){
                    cont++;
                }
                if (temp[i - 1][j + 1] == 1){
                    cont++;
                }
                if (temp[i + 1][j + 1] == 1){
                    cont++;
                }
                if (temp[i + 1][j - 1] == 1){
                    cont++;
                }
                if (temp[i - 1][j - 1] == 1){
                    cont++;
                } 
//            if (cont >3)    
            }
            }
        }

    public String imprimir(ArrayList<String> Numeros) {
        String cadena = "";
        int[][] temp = new int[10][10];

        for (int i = 0; i < Numeros.size(); i++) {
//            cadena = Numeros.get(i);
            String[] Chain = Numeros.get(i).split(":");
            int x = Integer.parseInt(Chain[0]);
            int y = Integer.parseInt(Chain[1]);

            temp[x][y] = 1;
        }

        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                cadena += '[' + Integer.toString(temp[j][k]) + ']';
            }
            cadena += '\n';
        }
        return cadena;
    }
}
