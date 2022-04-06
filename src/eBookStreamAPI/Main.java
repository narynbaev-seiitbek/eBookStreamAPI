package eBookStreamAPI;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static eBookStreamAPI.TypeOfBook.*;

public class Main {

    public static void main(String[] args) {






        //boolean allMatch = books.stream().allMatch(Book::isBestSeller);

        //getBooks().stream().filter(Book::isBestSeller).forEach(book-> System.out.println(book.getBookName()));

        //books.stream().max(Comparator.comparing(Book::getPrice)).ifPresent(System.out::println);
        //books.stream().min(Comparator.comparing(Book::getPrice)).ifPresent(System.out::println);

        //books.stream().max(Comparator.comparing(Book::getPageSize)).ifPresent(System.out::println);
        //books.stream().min(Comparator.comparing(Book::getPageSize)).ifPresent(System.out::println);

//        List<Book> sortedByPagesMax = books.stream().sorted(Comparator.comparing(Book::getPageSize)).toList();
//        sortedByPagesMax.forEach(System.out::println);
//
//        List<Book> sortedByPagesMin = books.stream().sorted(Comparator.comparing(Book::getPageSize).reversed()).toList();
//        sortedByPagesMin.forEach(System.out::println);


//        books.stream().max(Comparator.comparing(Book::getPrice))
//                .ifPresent(x -> System.out.println(x.getBookName()
//                        +findByPercent.apply(x.getPrice(), x.getDiscount())));


        getBooks().stream().sorted(Comparator.comparing(Book::getBookName).reversed()).forEach(System.out::println);
//        Map<TypeOfBook, List<Book>> classificationListMap = books.stream()
//                .collect(Collectors.groupingBy(Book::getTypeOfBook));
//        classificationListMap.forEach((typeOfBook, book1) -> {
//            System.out.println(typeOfBook);
//            book1.forEach(System.out::println);
//            System.out.println();
//        });

//        books.stream().sorted(Comparator.comparing(Book::getYearOfIssue)).forEach(System.out::println);
//
//        books.stream().sorted(Comparator.comparing(Book::getYearOfIssue).reversed()).forEach(System.out::println);

//        Set<Book> bookHashSet = new HashSet<>(books);
//        bookHashSet.forEach(System.out::println);

    }

    private static BiFunction<BigDecimal, Integer, BigDecimal> findByPercent = (bigDecimal, percent) -> {
        if (percent > 100 || percent < 0) {
            throw new InvalidPercentException(
                    "percent should be less than 100 and more than 0: your percent: " + percent
            );
        }

        BigDecimal bigDecimalPercent = BigDecimal.valueOf(percent);
        BigDecimal hundredPercent = BigDecimal.valueOf(100);
        BigDecimal result = bigDecimal.multiply(bigDecimalPercent).divide(hundredPercent);
        return bigDecimal.subtract(result);
    };


    private static List<Book> getBooks() {
        //Random random = new Random();
        return List.of(
                new Book("A Promised Land", "Barack Obama", PAPER_BOOK, 340, new BigDecimal("16.53"), true, LocalDate.of(2016, Month.FEBRUARY, 23), 155, 30),
                new Book("Too Much and Never Enough: How My Family Created the World's Most Dangerous Man ", "Mary L. Trump Ph.D.", ELECTRONIC_BOOK, 420, new BigDecimal("11.20"), false, LocalDate.of(2010, Month.OCTOBER, 4), 150, 12),
                new Book("Becoming", "Michelle Obama", AUDIO_BOOK, 1200, new BigDecimal("12.27"), true, LocalDate.of(2019, Month.MARCH, 9), 20, 50),
                new Book("Will", "Will Smith", PAPER_BOOK, 400, new BigDecimal("14.99"), true, LocalDate.of(2021, Month.APRIL, 16), 55, 34),
                new Book("Atomic Habits", "James Clear", ELECTRONIC_BOOK, 420, new BigDecimal("12.99"), true, LocalDate.of(2016, Month.JULY, 6), 105, 60),
                new Book("Workbook for James Clear's Atomic Habits: The Step By Step Guide To Turn Your Goals Into Reality", "Companion Works ", AUDIO_BOOK, 200, new BigDecimal("16.53"), false, LocalDate.of(2016, Month.JUNE, 16), 80, 129),
                new Book("The Mamba Mentality: How I Play", "Kobe Bryant", PAPER_BOOK, 500, new BigDecimal("18.00"), true, LocalDate.of(2021, Month.DECEMBER, 2), 48, 70),
                new Book("The Maid", "Nita Prose", AUDIO_BOOK, 230, new BigDecimal("7.99"), true, LocalDate.of(2022, Month.JANUARY, 12), 300, -234),
                new Book("Klara and the Sun", "Kazuo Ishiguro", ELECTRONIC_BOOK, 543, new BigDecimal("12.99"), false, LocalDate.of(2021, Month.FEBRUARY, 20), 500, 10),
                new Book("A Promised Land", "Barack Obama", PAPER_BOOK, 340, new BigDecimal("16.53"), true, LocalDate.of(2016, Month.FEBRUARY, 23), 155, 30),
                new Book("The Best American Science Fiction And Fantasy 2021", "John Joseph Adams", AUDIO_BOOK, 300, new BigDecimal("12.60"), false, LocalDate.of(2021, Month.SEPTEMBER, 2), 850, 5),
                new Book("The Chancellor", "Kati Marton ", PAPER_BOOK, 240, new BigDecimal("14.99"), false, LocalDate.of(2019, Month.MAY, 15), 580, 9),
                new Book("The Baseball 100", "Joe Posnanski", ELECTRONIC_BOOK, 200, new BigDecimal("24.41"), true, LocalDate.of(2021, Month.JUNE, 5), 1250, 12),
                new Book("The Dead Are Arising", "Les Payne", PAPER_BOOK, 390, new BigDecimal("50.00"), true, LocalDate.of(2018, Month.NOVEMBER, 3), 250, 18)
        );
    }
}
