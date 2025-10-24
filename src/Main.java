import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Masukkan angka: ");
            int angka = sc.nextInt();

            if (angka <= 0) {
                throw new InvalidNumberException("Angka tidak valid! Harus lebih dari 0.");
            }

            System.out.println("Valid! Angka Positif: " + angka);
            System.out.print("hasil berhasil dimasukan");

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        } finally {
            sc.close();
        }
    }
}