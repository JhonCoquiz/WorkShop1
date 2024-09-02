package Ejercicio2WorkShop;

public class main {
    public static void main(String[] args) {

        capitan cap = new capitan("Paolo", "Martinez", "J358");
        embarcacion emb = new velero(cap, 2003, 5000, 100, 5);
        embarcacion emb2 = new yate(cap, 2021, 20000, 30, 10, 50000);

        usuario usuario = new usuario();
        emb2.Alquilar(usuario);
        emb.Alquilar(usuario);

        

    }
}
