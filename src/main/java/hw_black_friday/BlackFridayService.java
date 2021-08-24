package hw_black_friday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {

        LocalDate startDate = LocalDate.of(startYear, 1, 1);
        LocalDate endDate = LocalDate.of(endYear + 1, 1, 1);

        Stream.iterate(startDate, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(startDate, endDate))
                .filter(day -> day.getDayOfMonth() == 13 && day.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((d1, d2) -> (int) (d2.getValue() - d1.getValue()))
                .forEach(System.out::println);
        

//        IntStream.range(startYear,endYear)
//        Stream.iterate(startDate,date ->date.plusDay() )
//        Stream.generate()

    }

    public static void main(String[] args) {
        printBlackFridayPerYearSorted(1985, 1997);
    }
}
