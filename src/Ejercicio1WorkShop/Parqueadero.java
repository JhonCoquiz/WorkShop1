package Ejercicio1WorkShop;

public class Parqueadero {

    private Carro[][] espacioEstacionamiento = new Carro[5][5];
    private double tarifaPorhora;


    public Parqueadero(double tarifaPorhora) {
        this.tarifaPorhora = tarifaPorhora;
    }

    public Carro[][] getEspacioEstacionamiento() {
        return espacioEstacionamiento;
    }

    public double getTarifaPorhora() {
        return tarifaPorhora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {


        if (fila <= 5 && columna <= 5) {
            fila--;
            columna--;
            if (espacioEstacionamiento[fila][columna] == null) {
                espacioEstacionamiento[fila][columna] = carro;
                System.out.println("¡Su carro ha sido agregado con exito!");
                System.out.println("Su total a pagar es de : $" + cobrarPortiempo(carro) + " USD.");
                System.out.println("Su carro ha sido agregado exitosamente.");
                return true;
            } else {
                System.out.println("Este espacio esta ocupado, ingrese de nuevo.");
                System.out.println("=============================================");
                return false;
            }
        } else {
            System.out.println("Se encuentra fuera de rango, ingrese de nuevo.");
            System.out.println("=============================================");
            return false;
        }
    }

    public double cobrarPortiempo(Carro carro) {

        double totalPagar = carro.getHoras() * tarifaPorhora;
        return totalPagar;
    }
    public void mostrarParqueadero() {
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                if (espacioEstacionamiento[f][c] == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[x]");
                }
            }
            System.out.println();
        }

    }

}
