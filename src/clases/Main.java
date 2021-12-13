package clases;

import herencia.Smartphone;
import herencia.Smartwatch;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Smartdevice();
        Internet internetPlus = new Internet(true, 4555, true);

        Smartphone smartphone1 = new Smartphone("marca", "modelo", 2021, true, true, 0.0D, internetPlus, "llamadas", "videollamadas", true, true, "microfono");
        System.out.println(smartphone1.valoresSmartphone());

        Smartwatch smartwatch1 = new Smartwatch("marca", "modelo", 2020, true, false, 0.0D, internetPlus, "forma", "tipodeCorrea", true, true, true, "obejtivoDiario", "sensor");
        System.out.println(smartwatch1.valoresSmartwatch());
    }
}
