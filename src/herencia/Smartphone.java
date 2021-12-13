package herencia;

import clases.Internet;
import clases.Smartdevice;

public class Smartphone extends Smartdevice {
    String llamadas;
    String videollamadas;
    boolean carcasa;
    boolean camara;
    String microfono;

    //constructor vacio
    public Smartphone() {
    }

    // constructor con parametros
    public Smartphone(String marca, String modelo, int year, boolean alarma, boolean chat, double cronometro, Internet internet, String llamadas, String videollamadas, boolean carcasa, boolean camara, String microfono) {
        super(marca, modelo, year, alarma, chat, cronometro, internet);
        this.llamadas = llamadas;
        this.videollamadas = videollamadas;
        this.carcasa = carcasa;
        this.camara = camara;
        this.microfono = microfono;
    }

    public String valoresSmartphone() {
        String var10000 = this.marca;
        return var10000 + " " + this.modelo + " " + this.year + " " + this.alarma + " " + this.chat + " " + this.cronometro + " " + this.internet.valoresInternet() + " " + this.llamadas + " " + this.videollamadas + " " + this.carcasa + " " + this.camara + " " + this.microfono;
    }
}