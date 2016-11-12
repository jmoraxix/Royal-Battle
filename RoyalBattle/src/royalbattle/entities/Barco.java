/*
 * Programacion Concurrente Cliente Servidor
 * 
 * Ricardo Jimenez Rugama
 * José David Mora Loría
 * Luis Alberto Nuñez Reyes
 * Roiner Andres Piedra Madrigal
 * Manuel Alejandro Torres Palomo
 * Fabian Villalobos Hernandez
 * 
 * Royal Battle - Client Side
 * Tercer cuatrimestre, 2016
 */
package royalbattle.entities;

/**
 *
 * @author fabian
 */
public class Barco {

    private int size;
    private boolean drown;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isDrown() {
        return drown;
    }

    public void setDrown(boolean drown) {
        this.drown = drown;
    }
    
}
