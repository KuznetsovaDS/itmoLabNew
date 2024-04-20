package itmo.lab4;

import java.util.Arrays;

public class Lab4 {
    //Ex1
    public static void number() {
        for (int firstNumber = 1; firstNumber <= 99; firstNumber++) {
            if (firstNumber % 2 != 0) {
                System.out.println(firstNumber);
            }
        }

    }

    //Ex2
    private static String categorDivThree = " ";
    private static String categorDivFive = " ";
    private static String categorDivThreeFive = " ";

    public static void numDivThreeFive() {
        boolean resultNumber = false;
        for (int secondNumber = 1; secondNumber <= 100; secondNumber++) {
            if (secondNumber % 3 == 0 && secondNumber % 5 == 0) {
                categorDivThreeFive += secondNumber + ",";
                resultNumber = true;
            } else if (secondNumber % 3 == 0) {
                categorDivThree += secondNumber + ",";
                resultNumber = true;
            } else if (secondNumber % 5 == 0) {
                categorDivFive += secondNumber + ",";
                resultNumber = true;
            }
        }
        if (resultNumber) {
            System.out.println("Делится на 3 " + categorDivThree);
            System.out.println("Делится на 5 " + categorDivFive);
            System.out.println("Делится на 3 и 5 " + categorDivThreeFive);
        }
    }

    //Ex3
    public static boolean numberSum(int num1, int num2, int num3) {
        return (num1 + num2 == num3);
    }

    //Ex4
    public static boolean numCompar(int num11, int num22, int num33) {
        return (num22 > num11 && num33 > num22);
    }

    //Ex5
    public static boolean arrayCheck(int[] array, int numCheck) {
        return array[0] == numCheck || array[array.length - 1] == numCheck;
    }

    //Ex6
    public static boolean arrayCheckOneThree(int[] array) {
        for (int num : array) {
            if (num == 1 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public static String arraySortUp(int[] array) {
        for (int numSort = 0; numSort < array.length - 1; numSort++) {
            if (array[numSort] > array[numSort + 1]) {
                return "please, try again";
            }
        }
        return "OK";
    }

    public static void arrayFirstLast(int[] array) {
        int numWork = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = numWork;
    }

    public static String arrayFirstAndLast(int[] array) {
        StringBuilder result9 = new StringBuilder("[");
        for (int num9 = 0; num9 < array.length - 1; num9++) {
            result9.append(array[num9]).append(",");
        }
        if (array.length > 0) {
            result9.append(array[array.length - 1]);
        }
        result9.append("]");
        return result9.toString();
    }

    public static int findUniqNum(int[] array) {
        int uniqNum = -1;
        for (int num10 = 0; num10 < array.length; num10++) {
            boolean unique = true;
            for (int num11 = 0; num11 < array.length - 1; num11++) {
                if (num10 != num11 && array[num10] == array[num11]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                uniqNum = array[num10];
                break;
            }
        }
        return uniqNum;

    }
}


