/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author andre
 */
// Mediador
class ChatRoom {
    private List<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void enviarMensaje(String mensaje, Usuario remitente) {
        for (Usuario usuario : usuarios) {
            if (usuario != remitente) {
                usuario.recibir(mensaje);
            }
        }
    }
}

// Colega
class Usuario {
    private String nombre;
    private ChatRoom chatRoom;

    public Usuario(String nombre, ChatRoom chatRoom) {
        this.nombre = nombre;
        this.chatRoom = chatRoom;
    }

    public void enviar(String mensaje) {
        System.out.println(nombre + " envía: " + mensaje);
        chatRoom.enviarMensaje(mensaje, this);
    }

    public void recibir(String mensaje) {
        System.out.println(nombre + " recibe: " + mensaje);
    }
}

public class Mediator {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Usuario user1 = new Usuario("Alice", chatRoom);
        Usuario user2 = new Usuario("Bob", chatRoom);
        Usuario user3 = new Usuario("Charlie", chatRoom);

        chatRoom.registrarUsuario(user1);
        chatRoom.registrarUsuario(user2);
        chatRoom.registrarUsuario(user3);

        user1.enviar("Hola a todos!");  // Bob recibe: Hola a todos!, Charlie recibe: Hola a todos!
        user2.enviar("Hola Alice!");    // Alice recibe: Hola Alice!, Charlie recibe: Hola Alice!
    }
}
