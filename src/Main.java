import java.util.Scanner;
public class Main {
    public static class GuessANumber {
        public static void main (String [] args) {
            int UnknownNumber, UserNumber, TrustCont = 0;
            Scanner input = new Scanner (System.in);
            System.out.println("Задача: Угадать число (от 0 до 100).");
            UnknownNumber = (int) Math.floor(Math.random() * 100);
            do {
                TrustCont++;
                System.out.println("Введите ваше число: ");
                UserNumber = input.nextInt();
                if (UserNumber > UnknownNumber)
                    System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат.");
                else if (UserNumber < UnknownNumber)
                    System.out.println("Я сам в шоке, но загаданное число больше, брат");
                else System.out.println("Ты угадал, братишка!");

            } while (UserNumber != UnknownNumber);
            System.out.println("Количество попыток: " +TrustCont);

        }

    }

}