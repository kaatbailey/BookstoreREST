-- Insert authors
INSERT INTO authors (id, name, biography) VALUES
    (1, 'Jane Austen', 'Jane Austen was an English novelist known primarily for her six major novels.');

-- Insert categories
INSERT INTO categories (id, name) VALUES
                                      (1, 'Fiction'),
                                      (2, 'Non-fiction'),
                                      (3, 'Science Fiction');

-- Insert books
INSERT INTO books (id, title, isbn, author_id, category_id) VALUES
                                                                (1, 'Pride and Prejudice', '9780141439518', 1, 1),
                                                                (2, 'Sense and Sensibility', '9780141439662', 1, 1),
                                                                (3, 'Emma', '9780141439587', 1, 1);
