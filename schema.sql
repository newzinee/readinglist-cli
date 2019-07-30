create table Book (
    id Long IDENTITY,
    reader VARCHAR(20) not null,
    isbn VARCHAR(10) not null,
    title VARCHAR(50) not null,
    author VARCHAR(50) not null,
    description VARCHAR(2000) not null
);