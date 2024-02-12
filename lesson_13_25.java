import java.util.ArrayList;

public class lesson_13_25 {
    //Приведение типа
    //Если типы переменной и объекта не совпадают, возникнет ошибка ClassCastException

    //Object o = new Integer(5);
    //String s = (String) o;
    //Во время выполнения возникнет ошибка, тут кинется исключение ClassCastException

    //В Java есть способ обойти эту ошибку: существует способ проверить, какой на самом деле тип находится внутри переменной:
    //имя instanceof Тип
    //Оператор instanceof проверяет, является ли переменная имя объектом типа Тип.

    //В методе main создается и заполняется список разными объектами и передается методу checkElementsType(ArrayList<Object>).
    //Твоя задача — реализовать этот метод, который должен определить тип каждого элемента списка, а также:

    //Для типа String вызывать printString();
    //Для типа Integer вызывать printInteger();
    //Для типа Integer[] вызывать printIntegerArray();
    //Для всех остальных типов вызывать printUnknown().
    //Метод main не участвует в проверке.

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) instanceof String)
            {
                printString();
            }
            else if (elements.get(i) instanceof Integer)
            {
                printInteger();
            }
            else if (elements.get(i) instanceof Integer[])
            {
                printIntegerArray();
            }
            else
            {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }

}
