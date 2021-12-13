package herencia;

import clases.Internet;
import clases.Smartdevice;

public class Smartwatch extends Smartdevice {
    String forma;
    String tipoCorrea;
    boolean sumergible;
    boolean podometro;
    boolean oxigenacion;
    String objetivoDiario;
    String sensor;

    //constructor vacio
    public Smartwatch() {
    }
    // constructor con parametros
    public Smartwatch(String marca, String modelo, int year, boolean alarma, boolean chat, double cronometro, Internet internet, String forma, String tipoCorrea, boolean sumergible, boolean podometro, boolean oxigenacion, String objetivoDiario, String sensor) {
        super(marca, modelo, year, alarma, chat, cronometro, internet);
        this.forma = forma;
        this.tipoCorrea = tipoCorrea;
        this.sumergible = sumergible;
        this.podometro = podometro;
        this.oxigenacion = oxigenacion;
        this.objetivoDiario = objetivoDiario;
        this.sensor = sensor;
    }

    public String valoresSmartwatch() {
        String var10000 = this.marca;
        return var10000 + " " + this.modelo + " " + this.year + " " + this.alarma + " " + this.chat + " " + this.cronometro + " " + this.internet.valoresInternet() + " " + this.forma + " " + this.tipoCorrea + " " + this.sumergible + " " + this.podometro + " " + this.oxigenacion + " " + this.objetivoDiario + " " + this.sensor;
    }
}
