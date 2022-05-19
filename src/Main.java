import java.util.Scanner; // импорт пакета для метода Scanner - ввод значений в консоли

import java.util.stream.IntStream; // импорт пакета для метода intStream - подсчет суммы массива

public class Main {

    public static void main(String[] args) {


        String doCount = "да"; // переменная "повторить расчет да/нет"

        Scanner in = new Scanner(System.in); // Создание объекта Scanner сумм и передача в него Sistem.in

        do {

            System.out.print("Введите начальный баланс счета: "); // Вывод текста запроса

            int balance = in.nextInt(); // запрос ввода суммы на счете в консоли и помещение в переменную

            System.out.print("Введите сумму пополнения: "); // Вывод текста запроса

            int amount = in.nextInt(); // запрос ввода суммы пополнения в консоли и помещение в переменную

            int bonus = (amount < 1000) ? 0 : (amount / 100); // расчет бонуса по условию и помещение в переменную

            IntStream intStream = IntStream.of(balance, amount, bonus); // создаем метод intStream

            int newBalance = intStream.sum(); // сумма баланса счета с учетом пополнения и бонусов

            System.out.printf("%nБаланс счета после пополнения: %d %n- в том числе бонусных рублей: %d \n", newBalance, bonus);
            // вывод значений баланса после пополнения, и суммы бонусных рублей

            System.out.printf("%nЕсли хотите повторить расчет, введите 'да' и нажмите Enter, если нет - просто нажмите Enter: ");
            // Вывод текста запроса на повтор расчета

            Scanner exit = new Scanner(System.in);
            // Создал второй метод Scanner, с одним цикл не работал, возможно из-за разных типов данных

            doCount = exit.nextLine(); // запрос и ввод данных в переменную повторного расчета


        } while (doCount.equals("да")); // условие цикла

        in.close();

        System.out.printf("%nСпасибо что воспользовались нашей программой!");

    }
}