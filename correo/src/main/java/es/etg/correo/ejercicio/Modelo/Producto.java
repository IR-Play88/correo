package es.etg.correo.ejercicio.Modelo;

public class Producto {
    private String destinatario;
    private String direccionEntrega;
    private double peso;
    private double precio;

    public Producto(String destinatario, String direccionEntrega, double peso, double precio) {
        this.destinatario = destinatario;
        this.direccionEntrega = direccionEntrega;
        this.peso = peso;
        this.precio = precio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void calcularPrecio(){


    }

}