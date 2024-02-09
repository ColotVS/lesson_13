public class lesson_13_07 {
    //Класс Double

    //Класс Double, в общем-то, аналогичен классу Integer, только является оберткой не для типа int, а для типа double.
    //У него тоже есть интересные нам поля и методы, рассмотрим некоторые из них:
    //Интересных полей у класса Double шесть:
    //Поле	                                Описание
    //double Double.NEGATIVE_INFINITY       Минус бесконечность
    //double Double.POSITIVE_INFINITY       Плюс бесконечность
    //int Double.MIN_EXPONENT               Минимальное значение экспоненты (2x)
    //int Double.MAX_EXPONENT               Максимальное значение экспоненты (2x)
    //double Double.MIN_VALUE               Минимальное значение типа double
    //double Double.MAX_VALUE               Максимальное значение типа double

    //Также у класса Double есть интересные методы:
    //Методы	                            Описание
    //String Double.toHexString(double)     Возвращает строку — шестнадцатеричное представление числа
    //boolean Double.isInfinite(double)     Проверяет, является ли переданное число бесконечностью.
    //boolean Double.isNaN(double)          Проверяет, является ли переданное число NaN
    //Double Double.valueOf(double)         Оборачивает переданный double в Double
    //Double Double.parseDouble(String)     Возвращает число, полученное из строки

    //Из интересного можно отметить наличие метода isInfinite(), который возвращает true,
    //если переданное в него число было плюс или минус бесконечность.
    //Аналогично работает и метод isNaN() — проверяет, является ли переданное в него число NaN:
    //специальная константа, обозначающая неопределенность (Not a Number, Не число).

    //Реализуй метод divide(double a, double b) так, чтобы в консоли выводился результат деления числа a на число b.
    //Должно выводиться следующее значение:

    //Double.POSITIVE_INFINITY, если верен любой из следующих пунктов:
    //a положительное и b равно 0;
    //a равно Double.POSITIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
    //a равно Double.NEGATIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;

    //Double.NEGATIVE_INFINITY, если верен любой из следующих пунктов:
    //a отрицательное и b равно 0;
    //a равно Double.NEGATIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
    //a равно Double.POSITIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;

    //Double.NaN, если верен любой из следующих пунктов:
    //a равно 0 и b равно 0;
    //хотя бы один из операндов равен Double.NaN;
    //a равно Double.POSITIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
    //a равно Double.POSITIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
    //a равно Double.NEGATIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
    //a равно Double.NEGATIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;

    //Иначе выводить результат деления a на b.

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        Double A = a;
        Double B = b;
        System.out.println(A/B);
    }
}
