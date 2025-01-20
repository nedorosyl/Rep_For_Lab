import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            if ('А' <= c && c <= 'Я') {
                encryptedText.append((char) ('А' + (c - 'А' + shift) % 32));
            } else if ('а' <= c && c <= 'я') {
                encryptedText.append((char) ('а' + (c - 'а' + shift) % 32));
            } else if ('A' <= c && c <= 'Z') {
                encryptedText.append((char) ('A' + (c - 'A' + shift) % 26));
            } else if ('a' <= c && c <= 'z') {
                encryptedText.append((char) ('a' + (c - 'a' + shift) % 26));
            } else {
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String text, int shift) {

        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        System.out.print("Введите сдвиг: ");
        int shift = scanner.nextInt();

        String encryptedText = encrypt(text, shift);
        System.out.println("Зашифрованная строка: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Расшифрованная строка: " + decryptedText);

        scanner.close();
    }
}


