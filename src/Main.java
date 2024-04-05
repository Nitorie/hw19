import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberManagment processor = new numberManagment();

        boolean continueProcessing = true;

        //task 1
        List<Integer> list = Arrays.asList(1, 12, 3, 4, 5, 26, 7, 8, 9, 10);
        int sum = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма всіх парних чисел : " + sum);
        //task 2
        IntStream.of(50,60,70,80,90,100,110,120)
                .map(x -> x * 2)
                .forEach(System.out::println);
        System.out.println("---------------------------------");
        //task 3
        System.out.println("Саме велике число у списку : " + IntStream.of(50,60,70,80,90,100,110,120).max().getAsInt());
        //task 4
        IntStream numbers = IntStream.of(52,61,76,89,90,101,111,122);
        String result = numbers.filter(n -> n % 2 != 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        System.out.println("Непарні числа : " + result);
        //task 5
        IntStream averageNumbers = IntStream.of(52,61,76,89,95,101,111,122);
        OptionalDouble average = averageNumbers.average();

        if (average.isPresent()) {
            System.out.println("Середне арифметичне всіх чисел : " + average.getAsDouble());
        } else {
            System.out.println("Потік порожній, неможливо обчислити середнє арифметичне");
        }
//task 6-7
        while (continueProcessing) {
            System.out.println("\nОпции:");
            System.out.println("1. Добавить число");
            System.out.println("2. Процессы");
            System.out.println("3. Выход");
            System.out.println("4. Начать тест");

            System.out.print("Введите функцию: ");
            int choice = scanner.nextInt();
            int answer = 0;
            scanner.nextLine();

            if (choice == 4) {
                System.out.println("\nОпции:");
                System.out.println("Start. Начать тест");
                System.out.print("Введите ваш выбор: ");
                String urChoice = scanner.nextLine();
                if (urChoice.equalsIgnoreCase("Start")) {
                    //-------------------------------------------
                    System.out.println("Первый вопрос : " +
                            "\nСколько будет 2 + 2? ");
                    int answer1 = scanner.nextInt();
                    if (answer1 == 4) {
                        System.out.println("Правильно!");
                        answer++;
                    } else {
                        System.out.println("Неправильно.");
                    }
                    //-------------------------------------------
                    System.out.println("Второй вопрос : " +
                            "\nСколько будет 3 * 15? ");
                    int answer2 = scanner.nextInt();
                    if (answer2 == 45) {
                        System.out.println("Правильно!");
                        answer++;
                    } else {
                        System.out.println("Неправильно.");
                    }
                    //-------------------------------------------
                    System.out.println("Третий вопрос : " +
                            "\nСколько будет 7 * 8? ");
                    int answer3 = scanner.nextInt();
                    if (answer3 == 56) {
                        System.out.println("Правильно!");
                        answer++;
                    } else {
                        System.out.println("Неправильно.");
                    }
                    //-------------------------------------------
                    System.out.println("Четвертый вопрос : " +
                            "\nСколько будет 125 / 5? ");
                    int answer4 = scanner.nextInt();
                    if (answer4 == 25) {
                        System.out.println("Правильно!");
                        answer++;
                    } else {
                        System.out.println("Неправильно.");
                    }
                    //-------------------------------------------
                    System.out.println("Пятый вопрос : " +
                            "\nСколько будет 4010 + 2020? ");
                    int answer5 = scanner.nextInt();
                    if (answer5 == 6030) {
                        System.out.println("Правильно!");
                        answer++;
                    } else {
                        System.out.println("Неправильно.");
                    }
                    if (answer >= 2){
                        System.out.println("Молодец, ты ответил на : " + answer + " вопросов \uD83D\uDE03");
                    } else {
                        System.out.println("Ты ответил всего на : " + answer + " вопросов \uD83D\uDE1F");
                    }
                }
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Введите число чтобы добавить: ");
                        int num = Integer.parseInt(scanner.nextLine());
                        processor.addNumber(num);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка ввода: введите целое число.");
                    } catch (InvalidNumberException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    processor.processNumbers();
                    break;
                case 3:
                    continueProcessing = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}
