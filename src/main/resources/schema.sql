CREATE TABLE authors (
                         id INTEGER PRIMARY KEY AUTO_INCREMENT,
                         name VARCHAR(100) NOT NULL,
                         biography TEXT
);

CREATE TABLE categories (
                            id INTEGER PRIMARY KEY AUTO_INCREMENT,
                            name VARCHAR(100) NOT NULL
);

CREATE TABLE books (
                       id INTEGER PRIMARY KEY AUTO_INCREMENT,
                       title VARCHAR(255) NOT NULL,
                       isbn VARCHAR(20),
                       author_id INTEGER,
                       category_id INTEGER,
                       FOREIGN KEY (author_id) REFERENCES authors(id),
                       FOREIGN KEY (category_id) REFERENCES categories(id)
);
