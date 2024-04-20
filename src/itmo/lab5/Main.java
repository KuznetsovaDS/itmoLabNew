package itmo.lab5;

public class Main {
    public static void main(String[] args)  {
        //Ex1
        Lab5 wordFinder = new Lab5();
        String textLine = "Другой шаблон, с которым вы сталкиваетесь каждый день, — это навигация по текущему открытому файлу.";
        String longWord = wordFinder.longWord(textLine);
        System.out.println(longWord);
        //Ex2
        String checkText = "А роза упала на лапу Азора";
        Lab5 checker = new Lab5();
        if(checker.palindrome(checkText)){
            System.out.println(checkText + " это палиндром"); }
        else {
            System.out.println(checkText + " это не палиндром"); }
        //Ex3
        String checkText2 = "Дрожа от страха и задыхаясь, бяка стала выбираться из малинника на тропу.";
        Lab5 changeOneWord = new Lab5();
        String result2 = changeOneWord.changeWord(checkText2);
        System.out.println("после замены: " + result2);

        //Ex4
        String oneTextLine = "hello world hello world hello world hello world hello world";
        String secondTextLine = "world";
        Lab5 returnParts = new Lab5();
        int result3 = returnParts.findSentence(oneTextLine, secondTextLine);
        System.out.println("Итого: " + result3);

        //Ex5
        String text5 =" Sample Output: The given string is: This is a test string The string reversed word by word is: sihT si a tset gnirts";
        String result5 = Lab5.invertsText(text5);
        System.out.println(result5);

    }
}

