package examenlab2_eliasgiron;

import java.awt.Color;

public class Computadora {

    private String serie;
    private String ano;
    private String color;
    private String material;
    private RAM Ram;
    private DiscoDuro hdd;
    private Bateria bateria;
    private Teclado teclado;
    private Pantalla pantalla;
    private Procesador procesador;
    private String Ram1;
    private String hdd1;
    private String bateria1;
    private String teclado1;
    private String pantalla1;
    private String procesador1;

    public Computadora(String serie, String ano, String color, String material, RAM Ram, DiscoDuro hdd, Bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.serie = serie;
        this.ano = ano;
        this.color = color;
        this.material = material;
        this.Ram = Ram;
        this.hdd = hdd;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public Computadora(String serie, String ano, String color, String material, String Ram, String hdd, String bateria, String teclado, String pantalla, String procesador) {
        this.serie = serie;
        this.ano = ano;
        this.color = color;
        this.material = material;
        this.Ram1 = Ram;
        this.hdd1 = hdd;
        this.bateria1 = bateria;
        this.teclado1 = teclado;
        this.pantalla1 = pantalla;
        this.procesador1 = procesador;
    }

    public Computadora() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public RAM getRam() {
        return Ram;
    }

    public void setRam(RAM Ram) {
        this.Ram = Ram;
    }

    public DiscoDuro getHdd() {
        return hdd;
    }

    public void setHdd(DiscoDuro hdd) {
        this.hdd = hdd;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "serie = " + serie;
    }

}
