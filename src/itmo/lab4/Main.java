package itmo.lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ex1
        Lab4.number();
        //Ex2
        Lab4.numDivThreeFive();
        //Ex3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое число ");
        int num1 = scanner.nextInt();
        System.out.println("Второе число ");
        int num2 = scanner.nextInt();
        System.out.println("Третье число ");
        int num3 = scanner.nextInt();
        boolean result3 = Lab4.numberSum(num1, num2, num3);
        System.out.println(result3);
        //Ex4
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Первое число");
        int num11 = scanner4.nextInt();
        System.out.println("Второе число");
        int num22 = scanner4.nextInt();
        System.out.println("Третье число");
        int num33 = scanner4.nextInt();
        boolean result4 = Lab4.numCompar(num11, num22, num33);
        System.out.println(result4);
        //Ex5
        int[] array5 = {1, 2, 5, 9, 11, 4, 3};
        int numCheck = 3;
        boolean result5 = Lab4.arrayCheck(array5, numCheck);
        System.out.println(result5);
        //Ex6
        int[] array6 = {2, 2, 5, 9, 11, 4, 5};
        boolean result6 = Lab4.arrayCheckOneThree(array6);
        System.out.println(result6);
        //Part2Ex1
        int[] array7 = {1, 2, 5, 9, 11, 12, 15};
        String result7 = Lab4.arraySortUp(array7);
        System.out.println(result7);
        //Part2Ex2
        Scanner scannerPart2 = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива");
        int arrayLength = scannerPart2.nextInt();
        int[] arrayPart2 = new int[arrayLength];
        System.out.println("Введите значения");
        for (int numOfArray = 0; numOfArray < arrayLength; numOfArray++) {
            arrayPart2[numOfArray] = scannerPart2.nextInt();
        }
        StringBuilder resultPart2 = new StringBuilder("Result [");
        for (int num8 = 0; num8 < arrayLength - 1; num8++) {
            resultPart2.append(arrayPart2[num8]).append(",");
        }
        if (arrayLength > 0) {
            resultPart2.append(arrayPart2[arrayLength - 1]);
        }
        resultPart2.append("]");
        System.out.println(resultPart2.toString());
        scannerPart2.close();

        //Part2Ex3
        int[] array9 = {1, 4, 5, 6, 9, 11};
        System.out.println(Lab4.arrayFirstAndLast(array9));
        Lab4.arrayFirstLast(array9);
        System.out.println(Lab4.arrayFirstAndLast(array9));

         //Part2Ex4
         int[] arrayForEx4 = {4, 4, 5, 4, 4, 4};
         int uniqNum = Lab4.findUniqNum(arrayForEx4);
         System.out.println("уникальное чило " + uniqNum);


    }
}




