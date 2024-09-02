package Ejercicio2WorkShop;

public class yate extends embarcacion{

    int cantidadCamarotes;
    float PrecioDeVenta;
    private int contadorAlquiler = 0;

    public yate(capitan cap1, int añoDeFabricacion, float precioBaseAlquiler, float longitud, int cantidadCamarotes, float precioDeVenta) {
        super(cap1, añoDeFabricacion, precioBaseAlquiler, longitud);
        this.cantidadCamarotes = cantidadCamarotes;
        PrecioDeVenta = precioDeVenta;
    }

    float CalcularPrecioVenta() {
        float resultado = PrecioDeVenta;
        if (cantidadCamarotes <= 5) {
            if (contadorAlquiler > 20 && contadorAlquiler < 50) {
                resultado = resultado - (resultado * 0.10F);
            } else if (contadorAlquiler > 50) {
                resultado = resultado - (resultado * 0.20F);
            }

        } else if (cantidadCamarotes < 8) {
            if (contadorAlquiler >= 50) {
                resultado = resultado - (resultado * 0.10F);
            }
        } else {
            if (contadorAlquiler >= 80) {
                resultado = resultado - (resultado * 0.05F);
            }

        }
        return resultado;
    }

    @Override
    void Alquilar(Ejercicio2WorkShop.usuario usuario1) {
        super.Alquilar(usuario1);
        contadorAlquiler++;
        System.out.println("alquilaste un yate");
    }
}
