package stream.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {

        Stream.iterate(LocalDate.of(startYear, 1, 1),
                        date -> date.getYear() <= endYear, date -> date.plusDays(1))
                .filter(date -> date.getDayOfMonth() == 13)
                .filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(groupingBy(LocalDate::getYear, counting()))
                .entrySet()
                .stream()
                .sorted(comparing(Map.Entry<Integer,Long>::getValue).reversed())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        BlackFridayService.printBlackFridayPerYearSorted(2000,2010);
    }
}
