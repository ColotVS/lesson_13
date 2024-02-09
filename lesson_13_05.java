public class lesson_13_05 {
    //Сравнение переменных классов-оберток

    //Autoboxing и unboxing работают очень просто и прозрачно:
    //где нужно — расставляются команды new Integer(), где нужно — вызываются методы intValue().

    //Для вас как для программиста все работает легко и понятно. Но учтите, что если вы сравниваете Integer и Integer,
    //происходит сравнение ссылок, а не значений.

    //Integer a = 1000;
    //Integer b = 1000;
    //System.out.println(a == b);           false

    //Integer a = 1000;
    //Integer b = 1000;
    //System.out.println(a.equals(b));      true

    //Переменные a и b хранят не значения (как типы int), а ссылки на объекты. Поэтому важно помнить, как правильно их сравнивать

    //Есть три поля с одинаковыми значениями. В методе main происходит их сравнение с выводом результата в консоли.
    //Добавь использование метода equals() в методе main такое минимальное количество раз, чтобы вывод был:
    //true
    //true
    //true
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
