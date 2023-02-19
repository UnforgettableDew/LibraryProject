use library;
insert into students(first_name, last_name, age, email, faculty)
values
    ('Andrew', 'Grom', 21, 'sagittariusdew@gmail.com', 'FICT'),
    ('Artem', 'Licherep', 20, 'artemlicherep@gmail.com', 'FFM'),
    ('Vlad', 'Shvets', 20, 'vladshvets@gmail.com', 'FSI'),
    ('Igor', 'Kavetskiy', 19, 'igorkavetsky@gmail.com', 'SAO'),
    ('Lelya', 'Basilevska', 17, 'lelyabasilevska@gmail.com', 'KDS'),
    ('Ira', 'Donets', 17, 'iradonets@gmail.com', 'KWOD');

insert into books(title, author, student_id)
values
    ('Robinson Crusoe', 'Daniel Defoe', 1),
    ('Clarissa', 'Samuel Richardson', 3),
    ('Tom Jones', 'Henry Fielding', 3),
    ('Emma', 'Jane Austen', null),
    ('Frankenstein', 'Mary Shelley', 2),
    ('Sybil', 'Benjamin Disraeli', 1),
    ('Sybil', 'Benjamin Disraeli', 2),
    ('Sybil', 'Benjamin Disraeli', 3),
    ('Jane Eyre', 'Charlotte Bronte', 5),
    ('Moby-Dick', 'Herman Melville', 6),
    ('The Moonstone', 'Wilkie Collins', 4),
    ('Middlemarch', 'George Eliot', 5),
    ('Nightmare Abbey', 'Thomas Love', 6);