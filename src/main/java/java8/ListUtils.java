package java8;

import lombok.SneakyThrows;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {


    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer){
        list.forEach(l -> {
            try {
                TimeUnit.SECONDS.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            consumer.accept(l);});
    }


    public static <T> int countDuplicate(T value, List<T> list) {
        return Collections.frequency(list, value);}


    public static <T> int countDuplicate(T value, List<T> list, Equalator<T> equalator) {

        int counter = 0;

        for (T t : list) {
            if (equalator.equals(t, value)) {
                counter++;
            }

        }
        return counter;

    }

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d");
        int delay = 2;
        ListUtils.forEachWithDelay(list, delay, l -> System.out.println(l));
    }
}
