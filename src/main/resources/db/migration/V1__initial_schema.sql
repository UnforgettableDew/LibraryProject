drop table if exists books;
drop table if exists students;
create table students(
    id bigint not null auto_increment,
    first_name varchar(32) not null,
    last_name varchar(32) not null,
    age int not null,
    email varchar(32) not null,
    faculty varchar(32) not null,
    primary key(id)
    );

create table  books(
    id bigint not null auto_increment,
    title varchar(32) not null,
    author varchar(32) not null,
    student_id bigint,
    primary key(id),
    foreign key(student_id) references students(id)
    on delete cascade
    on update cascade
    );

