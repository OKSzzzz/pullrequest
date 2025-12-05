import java.util.Scanner;

public class GastoDinero {
    public static void main(String[] args) {
        Scanner gastardinero = new Scanner(System.in);
        String personaje = "AnuelAA";
        int cantiini = 450;
        System.out.println("Dime caunto dinero quieres gastar");
        int gastar = gastardinero.nextInt();
        do{
            System.out.println("No puedes gastar esa cantidad de dinero");
            System.out.println("Introduce otra cifra inferior a tu dinero maximo");
            gastar = gastardinero.nextInt();
        }while(gastar >= cantiini);

        while (gastar < cantiini) {
            if (gastar < 50) {
                System.out.println("Estas comprando una sudadera por " +gastar+ "$");
                
            }
            if (gastar > 50) {
                System.out.println("Estas haciendo una compra de un par de zapatillas por " +gastar+ "$");
            }
            
        }
        System.out.println("Buenas "+personaje+",la cantidad de dinero que te queda es: " +(cantiini - gastar));

        
    }
}
