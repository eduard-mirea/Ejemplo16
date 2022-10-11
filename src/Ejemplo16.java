import java.util.Scanner;
public class Ejemplo16 {
    public static void main(String[] args) {
        int n;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un valor del 1 al 10: ");
        n = inputValue.nextInt();

        inputValue.close();

        switch (n){
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("El numero debe estar entre 0 y 10");
        }

    }
}