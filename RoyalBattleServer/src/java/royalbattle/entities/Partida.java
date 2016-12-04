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
public class Partida {

    private ArrayList<Jugador> jugadores;

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void agregarJugador(Jugador jugador){
    jugadores.add(jugador);
    }
    public int lenght(){
        return jugadores.size();
    }
    public boolean ExisteUsuario(String nombre){
        for (Jugador jugador : this.jugadores) {
            if(jugador.getUserName() == nombre)
                return true;
        }
        return false;
    }
    
    public void RegistrarTableroUsuario(String nombre,Tablero tablero){
        for (Jugador jugador : this.jugadores) {
            if(jugador.getUserName() == nombre)
                jugador.setTablero(tablero);
        }
    }
    
    public boolean realizarAtaque(String nombreAtacante, String nombreAtacado, int x, int y){
        for (Jugador jugadorAtacante : this.jugadores) {
            if(jugadorAtacante.getUserName() == nombreAtacante){
                for (Jugador jugadorAtacado : this.jugadores) {
                    if(jugadorAtacante.getUserName() == nombreAtacado){
                        if(jugadorAtacado.getTablero().getDimension()[x][y] == 1){
                            jugadorAtacante.SumarPuntaje(3);
                            //barquito atacado :3
                            // @TODO crear metodo validar barco hundido  
                            jugadorAtacado.getTablero().getDimension()[x][y] = 2;
                            return true;
                        }
                    }
                        
                }
            }   
        }
        return false;
    }

}
