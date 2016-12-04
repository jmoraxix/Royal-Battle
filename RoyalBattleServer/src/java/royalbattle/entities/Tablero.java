/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Ricardo Jimenez Rugama
 * José David Mora Loría
 * Luis Alberto Nuñez Reyes
 * Roiner Andres Piedra Madrigal
 * Fabian Andres Vargas Chavarria
 * 
 * Royal Battle
 * Tercer cuatrimestre, 2016
 */
package royalbattle.entities;

import java.util.ArrayList;

/**
 *
 * @author fabian
 */
public class Tablero {

    public Tablero() {

        dimension = new int[8][8];
        barcos = new ArrayList<Barco>();

    }

    private int[][] dimension;
    private ArrayList<Barco> barcos;

    public int[][] getDimension() {
        return dimension;
    }

    public void setDimension(int[][] dimension) {
        this.dimension = dimension;
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }

}
