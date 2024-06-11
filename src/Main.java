import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        while (true) {
            System.out.println("Ingrese la operacion que desea realizar");
            System.out.println("1. Ingresar un carro");
            System.out.println("2. Sacar un carro");
            System.out.println("3. Consultar un carro");
            System.out.println("4. Consultar el estado del parqueadero");
            System.out.println("5. Limpiar parqueadero");
            System.out.println("6. Salir");
            int operacion = scanner.nextInt();

            switch (operacion) {
                case 1:
                    // Assuming Carro class has a constructor that accepts a license plate
                    System.out.println("Ingrese la placa del carro");
                    String placa = scanner.next();
                    Carro carro = new Carro(placa);
                    parqueadero.entrarCarro(carro.toString());
                    break;
                case 2:
                    System.out.println("Ingrese la placa del carro a sacar");
                    String placaSacar = scanner.next();
                    parqueadero.sacarCarro();
                    break;
                case 3:
                    System.out.println("Ingrese la placa del carro a consultar");
                    String placaConsultar = scanner.next();
                    Carro carroConsultado = parqueadero.sacarCarro();
                    if (carroConsultado != null) {
                        System.out.println("El carro con placa " + placaConsultar + " está en el parqueadero");
                    } else {
                        System.out.println("El carro con placa " + placaConsultar + " no está en el parqueadero");
                    }
                    break;
                case 4:
                    parqueadero.estaOcupado();
                    break;
                case 5:
                    parqueadero.sacarCarro();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Operación no válida. Intente de nuevo.");
            }
        }
    }
    public static class Carro {
    private String placa;

    public Carro(String placa) {
        this.placa = placa;
    }

    // other methods...
}
}