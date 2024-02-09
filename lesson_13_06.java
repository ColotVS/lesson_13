public class lesson_13_06 {
    //Класс Integer

    //Integer хорош еще и тем, что это класс, а значит, у него могут быть поля и методы.
    //И, конечно, они у него есть. Даже много — несколько десятков. Поэтому мы рассмотрим самые основные из них.
    //У класса Integer есть два поля, которые содержат максимальное и минимальное значение типа int:

    //Поле	                    Описание
    //Integer.MAX_VALUE         Максимальное значение типа int
    //Integer.MIN_VALUE         Минимальное значение типа int

    //Иногда хочется присвоить переменной самое маленькое или самое большое значение типа int.
    // Чтобы не загромождать код непонятными константами, можно очень красиво написать:
    int min = Integer.MIN_VALUE;

    //Также у класса Integer есть несколько интересных методов, вот они:

    //Методы	                            Описание
    //String Integer.toHexString(int)       Возвращает строку — шестнадцатеричное представление числа
    //String Integer.toBinaryString(int)    Возвращает строку — двоичное представление числа
    //String Integer.toOctalString(int)     Возвращает строку — восьмеричное представление числа
    //Integer Integer.valueOf(int i)        Оборачивает переданный int в Integer
    //Integer Integer.parseInt(String)      Возвращает число, полученное из строки

    //Раньше вы уже сталкивались со статическим методом Integer.parseInt(). Напомним, как он работает:
    //int имя = Integer.parseInt(строка);
    //Если в метод parseInt() передать строку, содержащую число (только цифры),
    //он распарсит эту строку и вернет число, которое в ней содержится.

    //В классе lesson_13_06 есть поле balance, которое описывает баланс средств на банковском счете.
    //При объявлении проинициализируй его значением Integer.MAX_VALUE.
    //Реализуй метод processPayment(String), который принимает чек и производит списание средств со счета соответственно чеку.
    //Метод main не принимает участие в проверке.
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        balance = balance - Integer.parseInt(bill);
    }
}
