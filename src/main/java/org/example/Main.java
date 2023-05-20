package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario user1 = new Usuario.Builder()
                .setUsuario("Armando")
                .setPassword("Reyes")
                .setMensualidad("100")
                .setTipoCuenta("Estudiante").build();

        Usuario user2 = new Usuario.Builder()
                .setUsuario("Armando")
                .setPassword("Reyes").build();

        user1.mostrarUsuario();
        user2.mostrarUsuario();

    }
}