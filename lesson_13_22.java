import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class lesson_13_22 {
    //Опускание типа — оператор diamond: <>

    //Еще до появления оператора var были попытки научить компилятор выводить типы коллекций.
    //Согласитесь, эта запись выглядит немного избыточно:
    //ArrayList<String> list = new ArrayList<String>();

    //Начиная с седьмой версии Java, при записи типа коллекции можно было опускать (не писать) тип элементов коллекции,
    //если он указан при объявлении переменной. Т.е. код выше можно записать немного в сокращенном виде:
    //ArrayList<String> list = new ArrayList<>();

    //Пустые треугольные скобки в типе коллекции получили название оператор diamond: две скобки отдаленно напоминали силуэт бриллианта.

    //Использовать одновременно var и оператор diamond нежелательно:
    //var list = new ArrayList<>();
    //Информации о типе, который хранит коллекция, совсем не остается и тип будет определен как ArrayList<Object>.

    //В методе main создаются объекты разных типов.
    //В некоторых случаях тип элементов объекта можно опустить и просто использовать оператор diamond(<>).
    //Замени тип элементов объекта на оператор diamond там, где это возможно, не меняя левую часть выражений.
    //Порядок следования переменных не должен меняться.

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}
