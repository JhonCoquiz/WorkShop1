package Ejercicio2WorkShop;

abstract class embarcacion {

    capitan cap1;
    float PrecioBaseAlquiler;
    int AñoDeFabricacion;
    float Longitud;
    usuario usuario;

    public embarcacion(capitan cap1, int añoDeFabricacion, float precioBaseAlquiler, float longitud) {
        this.cap1 = cap1;
        AñoDeFabricacion = añoDeFabricacion;
        PrecioBaseAlquiler = precioBaseAlquiler;
        Longitud = longitud;
    }

    float CalcularPrecioAlquiler(){
        float resultado = PrecioBaseAlquiler;

        if (AñoDeFabricacion > 2020) {
            resultado += 20000F;
        }
        return resultado;
    }
    void Alquilar(usuario usuario1) {
        this.usuario = usuario1;
        System.out.println("alquilaste una embarcacion por: "+ CalcularPrecioAlquiler());
    }






}