package Ejercicio1WorkShop;

public class Carro {

    private String placa;
    private String marca;
    private String modelo;
    private int horas;

    public Carro(String placa, String marca, String modelo, int horas) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horas = horas;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getHoras() {
        return horas;
    }
}
