/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import royalbattle.entities.Partida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ulacit
 */
public class DataBase {
    public static Partida partidaActual;
    
    public static void CrerPartida(){
    partidaActual = new Partida();
    }
}
