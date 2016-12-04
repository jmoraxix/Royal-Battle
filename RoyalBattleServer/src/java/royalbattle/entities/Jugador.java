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

/**
 *
 * @author fabian
 */
public class Jugador {

    private String userName;
    private boolean active;
    private int Puntaje;
    private Tablero tablero;

    public Jugador(String userName) {
        this.userName = userName;
        this.active = false;
        this.tablero = new Tablero();

    }

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
    public void SumarPuntaje(int puntaje) {
        this.Puntaje+= puntaje;
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
