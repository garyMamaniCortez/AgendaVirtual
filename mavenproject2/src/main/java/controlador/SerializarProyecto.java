package controlador;

import Usuario.User;
import Usuario.Users;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import modelo.*;

/**
 *
 * @author Sergio Garcia
 */
public class SerializarProyecto {
/*
    public void guardarProyecto(AgendaVirtual agendaVirtual) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("AgendaVIrtual.obj"))) {
            salida.writeObject(agendaVirtual);
            salida.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AgendaVirtual recuperarProyecto() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("AgendaVirtual.obj"))) {
            AgendaVirtual agendaVirtual = (AgendaVirtual) entrada.readObject();
            entrada.close();
            return agendaVirtual;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return new AgendaVirtual();
        }
    }
*/
    public void guardarProyecto(Users users) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Users.txt"))) {
            salida.writeObject(users);
            salida.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Users recuperarProyecto() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Users.txt"))) {
            Users users = (Users)entrada.readObject();
            entrada.close();
            return users;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return new Users();
        }
    }
}
