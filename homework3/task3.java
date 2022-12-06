import java.util.Random; // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    private static ArrayList<Integer> arrayGenerate(int size) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++)
            arr.add(rand.nextInt(21));
        return arr;
    }

    private static ArrayList scanerValue(ArrayList<Integer> arList) {
        ArrayList res = new ArrayList<>();
        int min = arList.get(0);
        int max = arList.get(1);
        int sum = 0;
        for (int i = 0; i < arList.size(); i++) {
            if (arList.get(i) < min)
                min = arList.get(i);
            if (arList.get(i) > max)
                max = arList.get(i);
            sum += arList.get(i);
        }
        res.add(min);
        res.add(max);
        res.add((double) sum / arList.size());
        return res;
    }

    public static void main(String[] args)
    {
        System.out.print("Введите размерность списка: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();
        ArrayList<Integer> numberList = arrayGenerate(size);
        System.out.printf("Сгенерированный список целых чисел: %s \n", numberList);
        ArrayList resultValue = scanerValue(numberList);
        System.out.printf("min = %d, max = %d, sr = %.1f", resultValue.get(0), resultValue.get(1), 
                        resultValue.get(2)); 
    }
}