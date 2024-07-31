package kaat.practice.bookstore.book;

import jakarta.persistence.*;
import kaat.practice.bookstore.author.Author;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "isbn", nullable = false, length = 20)
    private String isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "publish_date")
    private LocalDate publishDate;

}