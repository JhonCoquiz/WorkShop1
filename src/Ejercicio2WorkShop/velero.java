package Ejercicio2WorkShop;

public class velero extends embarcacion{

    int cantidadMastiles;

    public velero(capitan cap1, int añoDeFabricacion, float precioBaseAlquiler, float longitud, int cantidadMastiles) {
        super(cap1, añoDeFabricacion, precioBaseAlquiler, longitud);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    float CalcularPrecioAlquiler() {
       float resultado = super.CalcularPrecioAlquiler();

        if ( cantidadMastiles > 4) {
            resultado *= 1.1F;
        }

        return resultado;
    }


}
