package eBookStreamAPI;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Book {

    private String bookName;
    private String authorFullName;
    private TypeOfBook typeOfBook;
    private int pageSize;
    private BigDecimal price;
    private boolean bestSeller;
    private LocalDate yearOfIssue;
    private int like;
    private int discount;

    public Book() {
    }

    public Book(String bookName,
                String authorFullName,
                TypeOfBook typeOfBook,
                int pageSize,
                BigDecimal price,
                boolean bestSeller,
                LocalDate yearOfIssue,
                int like,
                int discount) {
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.typeOfBook = typeOfBook;
        this.pageSize = pageSize;
        this.price = price;
        this.bestSeller = bestSeller;
        this.yearOfIssue = yearOfIssue;
        this.like = like;
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageSize == book.pageSize && bestSeller == book.bestSeller && like == book.like && discount == book.discount && Objects.equals(bookName, book.bookName) && Objects.equals(authorFullName, book.authorFullName) && typeOfBook == book.typeOfBook && Objects.equals(price, book.price) && Objects.equals(yearOfIssue, book.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorFullName, typeOfBook, pageSize, price, bestSeller, yearOfIssue, like, discount);
    }

    public TypeOfBook getTypeOfBook() {
        return typeOfBook;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Book [" +
                "bookName = " + bookName +
                " authorFullName = " + authorFullName +
                " pageSize = " + pageSize +
                " price = " + price +
                " bestSeller = " + bestSeller +
                " like = " + like +
                " discount = " + discount +
                " dateOfIssue = " + yearOfIssue +
                ']';
    }
}
