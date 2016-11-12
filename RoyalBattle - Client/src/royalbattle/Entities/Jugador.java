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
package royalbattle.Entities;

/**
 *
 * @author fabian
 */
public class Jugador {

    public Jugador() {
        
        active= false;
        tablero = new Tablero();
        
    }
    
    
    private String userName;
    private boolean active;
    private int Puntaje;
    private Tablero tablero;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "userName=" + userName + '}';
    }
    
    
    
}
