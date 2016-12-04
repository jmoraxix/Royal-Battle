/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import royalbattle.entities.*;
import Utils.DataBase;
import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ulacit
 */
@Path("royalbattle")
public class RoyalBattleService {

    @Context
    private UriInfo context;
    
    private boolean partidaInciada = false; 
    private boolean partidaCorriendo = false; 

    /**
     * Creates a new instance of UserResource
     */
    public RoyalBattleService() {
    }

    /**
     * Retrieves representation of an instance of api.UserResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPartida() {
        return new Gson().toJson(DataBase.partidaActual);
    }

    /**
     * PUT method for updating or creating an instance of UserResource
     *
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String registrarUsuario(String content) {
        if(partidaInciada == true && DataBase.partidaActual.lenght() < 4){
            Jugador person = new Gson().fromJson(content, Jugador.class);
            DataBase.partidaActual.agregarJugador(person);
            return new Gson().toJson(person);
        }
        return "No se ha iniciado la partida";
    }

    /**
     * PUT method for updating or creating an instance of UserResource
     *
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String CrearPartida(){;
        DataBase.CrerPartida();
        this.partidaInciada = true;
        return "Partida Iniciada";
    }
    
    /**
     * PUT method for updating or creating an instance of UserResource
     *
     * @param nombreUsuario representation for the resource
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String RegistrarTablero(String nombreUsuario, String content) {
        if(DataBase.partidaActual.ExisteUsuario(nombreUsuario) && this.partidaCorriendo){
            Tablero tablero = new Gson().fromJson(content, Tablero.class);
            DataBase.partidaActual.RegistrarTableroUsuario(nombreUsuario,tablero);
            return "Tablero registrado";
        }
        return "Ocurrio un error";
    }
    
    /**
     * PUT method for updating or creating an instance of UserResource
     *
     * @param nombreUsuario representation for the resource
     * @param content representation for the resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String realizarJugada(String nombreAtacante,String nombreAtacado, int x , int y ) {
        if(DataBase.partidaActual.ExisteUsuario(nombreAtacante) &&
           DataBase.partidaActual.ExisteUsuario(nombreAtacado) &&
           this.partidaCorriendo){
            return(DataBase.partidaActual.realizarAtaque(nombreAtacante,nombreAtacado,x,y))
                    ? "Se realizo el ataque" 
                    : "No se realizo el ataque";
        }
        return "Ocurrio un error";
    } 
}
