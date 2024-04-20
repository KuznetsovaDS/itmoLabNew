package itmo.lab5;

public class Lab5 {

        //Ex1
        public String longWord(String textLine) {
            String[] words = textLine.split(" ");
            String longWord = words[0];
            for (int i = 1; i < words.length; i++) {
                String cleanWord = words[i].replaceAll("[^а-яА-Я]", "");
                if (cleanWord.length() > longWord.length()) {
                    longWord = cleanWord;
                }
            }
            return longWord;
        }
        //Ex2
        public boolean palindrome(String word){
            String cleanWordForPalindrome = word.replaceAll("[^а-яА-Я]", "").toLowerCase();
            char [] checkArray = cleanWordForPalindrome.toCharArray();
            int leftLetter = 0;
            int rightLetter = checkArray.length - 1;
            while (leftLetter < rightLetter){
                if (checkArray[leftLetter] != checkArray[rightLetter]){
                    return false;
                }
                leftLetter++;
                rightLetter--;
            }
            return  true;
        }
        //Ex3
        public String changeWord(String word){
            String result3 = word.replaceAll("бяка" , "[вырезано цензурой]");
            return result3;
        }
        //Ex4
        public int findSentence (String firstSent, String secondSent){
            int times = 0;
            int index = 0;
            while ((index = firstSent.indexOf(secondSent,index)) != -1){
                times++;
                index += secondSent.length();
            }
            return times;
        }
        //Ex5
        public static String invertsText(String text){
            String[] words = text.split(" ");
            StringBuilder inverts = new StringBuilder();
            for (String word : words){
                StringBuilder invertsWord = new StringBuilder(word).reverse();
                inverts.append(invertsWord).append(" ");
            }
            return inverts.toString().trim();
        }
    }

