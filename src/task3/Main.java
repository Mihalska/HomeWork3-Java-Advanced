package task3;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String s = "Kyiv is the Hero-City. In the park of Immortal Glory there is an obelisk in honour of those who fell in the battles of the Second World War. Because of many places of historical interest Kyiv is one of the most exciting cities to visit.";
        //виводимо початкову строку
        System.out.println( "Початкова строка: "+ s);
        // розбиваємо на підстроки,видаляємо зайві пробіли в кінці та на початку обох строк та виводимо кожну з нового рядка
        String s1= s.substring(0, s.length() /2)  ;
        String s2 = s.substring(s.length() /2);
        System.out.println("\nПерша підстрока:\n" + s1.trim());
        System.out.println("Друга підстрока:\n" + s2.trim());
        // виводимо довжину кожної отриманої підстроки
        System.out.println("\nДовжина першої підстроки = " + s1.length() );
        System.out.println("Довжина другої підстроки = " + s2.length() );
    }
}
