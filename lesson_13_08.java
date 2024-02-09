public class lesson_13_08 {
    //Класс Character
    //Класс Character в первую очередь интересен большим количеством утилитных статических методов,
    //которые позволяют проверять символы на принадлежность разным категориям.

    //Методы	                        Описание
    //Character.isAlphabetic(int)       Проверяет, является ли символ символом алфавита
    //Character.isLetter(char)          Является ли символ буквой
    //Character.isDigit(char)           Является ли символ цифрой
    //Character.isSpaceChar(char)       Является ли символ пробелом, символом переноса строки или смены параграфа (коды: 12, 13, 14)
    //Character.isWhitespace(char)      Является ли символ разделителем: пробел, tab, и т.д.
    //Character.isLowerCase(char)       Символ в нижнем регистре — строчные буквы?
    //Character.isUpperCase(char)       Символ в верхнем регистре — заглавные буквы?
    //Character.toLowerCase(char)       Преобразует символ в нижний регистр
    //Character.toUpperCase(char)       Преобразует символ в верхний регистр

    //Особенностью данных методов является то, что они работают со всеми известными алфавитами:
    //символы арабских цифр будут определяться как цифры и т.п.

    //Реализуй методы countDigits(String), countLetters(String), countSpaces(String),
    //которые должны возвращать количество цифр, букв и пробелов в строке.
    //Метод main не принимает участия в проверке

    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigit=0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)))
                countDigit++;
        }
        return countDigit;
    }

    public static int countLetters(String string) {
        int countLetters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                countLetters++;
        }
        return countLetters;
    }

    public static int countSpaces(String string) {
        int countSpadces = 0;
        for (int i = 0; i < string.length();i++) {
            if (Character.isSpaceChar(string.charAt(i)))
                countSpadces++;
        }
        return countSpadces;
    }
}
