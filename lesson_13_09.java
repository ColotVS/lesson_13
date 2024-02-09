public class lesson_13_09 {
    //Класс Boolean
    //Тип Boolean практически такой же, как тип boolean. Отличия минимальны.

    //В типе Boolean есть две константы (два поля):

    //Константы класса	        Аналог типа boolean	        Описание
    //Boolean.TRUE              true                        истина
    //Boolean.FALSE             false                       ложь

    //Работать с ними можно так же, как и с типом boolean:
    //
    //Код	                        Примечание
    //if (Boolean.TRUE)             Boolean — единственный класс, который можно писать внутри условия
    //{
    //}

    //Boolean a = Boolean.TRUE;     Все три переменные равны true/TRUE
    //boolean b = Boolean.TRUE;
    //boolean с = true;

    //Boolean a = Boolean.TRUE;     Константы можно сравнивать и через equals и через ==
    //Boolean b = Boolean.TRUE;
    //if (a == b)                   Так тоже будет работать.

    //Программа сравнивает два числа. Если первое число меньше второго, то в консоль выводится сообщение: Первое число меньше второго.
    //Если первое число больше второго или равно второму числу, то в консоль выводится сообщение: Первое число больше или равно второму числу.
    //Но на данный момент программа завершается с ошибкой. Разберись, что работает не так и исправь ошибку.
    //Метод main не принимает участие в проверке.

    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (Boolean.TRUE.equals(isLess)) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число больше или равно второму числу");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second;
    }

}
