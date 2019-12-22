CREATE TABLE book (
    book_id INT AUTO_INCREMENT,
    title VARCHAR(255),
    price INT,
    PRIMARY KEY (book_id)
);

CREATE TABLE sales (
    sales_id INT AUTO_INCREMENT,
    book_id INT,
    sales_count INT,
    sales_datetime DATETIME,
    PRIMARY KEY (sales_id),
    FOREIGN KEY (book_id) REFERENCES book(book_id)
);
