package SimpleBankingSystem;

/**
 * @author Flor Martinez
 */
public class Main {
    public static void main(String[] args) {
        // Crear el compte bancari per a Flor Martínez amb número de compte i saldo inicial
        Account myAccount = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);

        // Intentar retirar diners i capturar possibles excepcions
        try {
            myAccount.withdrawAmount(2300);
        } catch (Exception ex) {
            System.err.println("Error en la retirada: " + ex.getMessage());
            System.out.println("No es pot realitzar la retirada.");
        }

        // Intentar fer un ingrés i capturar possibles excepcions
        try {
            System.out.println("Realitzant ingrés al compte...");
            myAccount.depositAmount(1695);
        } catch (Exception ex) {
            System.err.println("Error en l'ingrés: " + ex.getMessage());
            System.out.println("No es pot realitzar l'ingrés.");
        }

        // Mostrar el saldo final
        System.out.println("Saldo final del compte: " + myAccount.getBalance());
    }
}
