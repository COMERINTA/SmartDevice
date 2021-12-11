package Dispositivos;

import javax.swing.*;

public class SmartiDevice {


    static class SmartWatch {

        String resistenteAgua;
        String tipoConexion;

        public SmartWatch(){
        }

        public SmartWatch(String resistenteAgua, String tipoConexion) {

            this.resistenteAgua = resistenteAgua;
            this.tipoConexion = tipoConexion;
        }

    }
    static class SmartPhone {

        String tamañoPantalla;
        String memoria;
        String tipoConexion;

        public SmartPhone(){
        }

        public SmartPhone(String tamañoPantalla, String memoria, String tipoConexion) {

            this.tamañoPantalla = tamañoPantalla;
            this.memoria = memoria;
            this.tipoConexion = tipoConexion;

        }
    }
}
