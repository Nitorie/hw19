import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class numberManagment {
    private List<Integer> numbers;

    public numberManagment() {
        numbers = new ArrayList<>();
    }

    public void addNumber (int number) {
        numbers.add(number);
    }
    public void removeNumber(int number) {
        numbers.remove(number);
    }
    public void processNumbers() {
        if (numbers.isEmpty()) {
            System.out.println("Лист пустой");
            return;
        }
        System.out.println("Числа в списке:");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумма чисел в списке: " + sum);

        int max = numbers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Максимальное число в списке: " + max);

        int min = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Минимальное число в списке: " + min);
    }
}
