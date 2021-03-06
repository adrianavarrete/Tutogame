package juego;

import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;

public class JuegoManager  implements  Interfazcutre{


    private HashMap<String, Usuario> usuarios;
    private List<Objetos> lisaObjetos;
    private List<Inventario> listainventarios;
    private List<Mapa> listaMapas;



    private static Interfazcutre instance;
    public static Interfazcutre getInstance(){
        return instance;
    }


    @Override
    public boolean login(String idUser, String pass) {
        return false;
    }

    @Override
    public boolean logout(String idUser, String pass) {
        return false;
    }

    @Override
    public void eliminarUsuario(String idUser, String pass) {

    }

    @Override
    public void crearUsuario(String idUser, String pass, String nombre) {

    }

    @Override
    public void modificarDinero(String idUser, int cantidad) {

    }

    @Override
    public boolean checkPartidaEnCurso(String idUser) {
        return false;
    }

    @Override
    public void guardarPartidaEnCurso(String idUsuario, String idPartida, Partida p) {

    }

    @Override
    public void eliminarPartidaEnCurso(String idUsuario, String idPartida) {

    }

    @Override
    public void sumarPuntuacionFinal(String idUser, int puntuacion) {

    }

    @Override
    public void iniciarPartida(String idUser) {

    }

    @Override
    public void finalizarPartida(String idUser) {

    }

    @Override
    public void construirMapa(Mapa mapa, String idUser) {

    }

    @Override
    public void guardarPartida(String idUser) {

    }

    @Override
    public void moodificarVida(String idUser) {

    }



    @Override
    public void añadirUsuario(String idUser, String pass) {

    }

    @Override
    public List<Objetos> dameObjetos(String idUser) throws Exception {
        LinkedList<Objetos> objetosList = null;
        Usuario user = usuarios.get(idUser);
        if(user != null){
        for (int i=0; i<this.listainventarios.size();i++)
        {
            if(idUser.equals(this.listainventarios.get(i).getIdinventario()))
            {

                objetosList = this.listainventarios.get(i).getInventario();

                return objetosList;
        }

        }



        }else {
            throw new Exception();
        }
    }

    @Override
    public void activarmeObjeto(String idObjeto) {





    }

    @Override
    public void desactivarmeObjeto(String idObjecto) {

    }

    @Override
    public void crearInventario(String idUser) {

    }

    @Override
    public void destruirInventario(String idUser) {

    }

    @Override
    public void crearObjetoNuevo(String nombre, String idObjeto, String puntos, String dinero) {

    }

    @Override
    public void eliminarObjeto(String idObjeto) {

    }
}
