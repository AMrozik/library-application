CREATE schema libprod

CREATE TABLE IF NOT EXISTS libprod.BOOK (
    book_id serial PRIMARY KEY,
    title varchar(200) NOT NULL,
    author varchar(400) NOT NULL,
    release_date timestamp NOT NULL
)
