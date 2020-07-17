package modelo;

import modelo.Alarma;
import modelo.Alarma;

import edl.ListaSE;

public class ListaAlarma {

    private ListaSE<Alarma> alarmas;

    public ListaAlarma() {
        alarmas = new ListaSE<>();
    }

    public void agregarAlarma(Alarma a) {
        alarmas.insertar(a);
    }

    public void eliminarAlarma(Alarma a) {
        for (int i = 0; i < alarmas.tamanio(); i++) {
            if (alarmas.acceder(i).equals(a)) {
                alarmas.eliminar(i);
            }
        }
    }

    public Alarma returnAlarma(int pos) {
        return alarmas.acceder(pos);
    }
}
