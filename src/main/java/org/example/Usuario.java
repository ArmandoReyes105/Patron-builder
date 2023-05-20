package org.example;

public class Usuario {
    private String usuario;
    private String password;
    private String tipoCuenta;
    private String mensualidad;

    public Usuario(){

    }

    public Usuario(Builder usuarioBuilder){
        this.usuario = usuarioBuilder.usuario;
        this.password = usuarioBuilder.password;
        this.mensualidad= usuarioBuilder.mensualidad;
        this.tipoCuenta = usuarioBuilder.tipoCuenta;
    }

    public Usuario(String usuario, String password, String tipoCuenta, String mensualidad) {
        this.usuario = usuario;
        this.password = password;
        this.tipoCuenta = tipoCuenta;
        this.mensualidad = mensualidad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(String mensualidad) {
        this.mensualidad = mensualidad;
    }

    public void mostrarUsuario(){
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + password);
        System.out.println("Tipo cuenta: " + tipoCuenta);
        System.out.println("Mensualidad: " + mensualidad);
        System.out.println("---------------------------------------");
    }

    public static class Builder{
        private String usuario;
        private String password;
        private String tipoCuenta;
        private String mensualidad;

        public Builder setUsuario(String usuario){
            this.usuario = usuario;
            return this;
        }

        public Builder setPassword(String password){
            this.password = password;
            return this;
        }

        public Builder setTipoCuenta(String cuenta){
            this.tipoCuenta = cuenta;
            return this;
        }

        public Builder setMensualidad(String mensualidad){
            this.mensualidad = mensualidad;
            return this;
        }

        public Usuario build(){
            return new Usuario(this);
        }

    }

}
