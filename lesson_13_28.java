import java.util.ArrayList;

public class lesson_13_28 {
    //В классе lesson_13_28 есть метод printAnything(ArrayList), который должен принимать список и выводить его содержимое в консоли.
    //Сейчас на вход принимается только список строк.
    //Твоя задача исправить метод так, чтобы принимался список с любыми типами данных (для этого нужно удалить соответствующий дженерик).
    //Метод main не участвует в проверке.

    public static void printAnything(ArrayList arrayList) {
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}
