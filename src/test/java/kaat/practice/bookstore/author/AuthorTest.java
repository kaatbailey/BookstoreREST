package kaat.practice.bookstore.author;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(RestDocumentationExtension.class)
@SpringBootTest
@Transactional
class AuthorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
    }

    @Test
    void getName() {
    }

    @Test
    void getBiography() {
    }

    @Test
    void setId() {
    }

    @Test
    void setName() {
    }

    @Test
    void setBiography() {
    }
}