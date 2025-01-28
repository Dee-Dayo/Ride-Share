truncate table users cascade;

insert into users(id, first_name, last_name, email, password, phone_number)values
(100, 'Doe', 'John', 'darhyor2050@gmail.com', 'password', '11111111111'),
(101, 'Bull', 'Joe', 'bulljoe@gmail.com', 'password', '22222222222'),
(103, 'Sam', 'Cole', 'colesam@gmail.com', '$2a$10$seAKbpBsTn/xgAg7nbRKWuH1dnRvMlLloxMOjH00zMmTu3vLCtlee', '33333333333'),
(109, 'Sam', 'Cole', 'renter@email.com', '$2a$10$seAKbpBsTn/xgAg7nbRKWuH1dnRvMlLloxMOjH00zMmTu3vLCtlee', '44444444444'),
(104, 'Palmer', 'James', 'jamespalmer@gmail.com', '$2a$10$seAKbpBsTn/xgAg7nbRKWuH1dnRvMlLloxMOjH00zMmTu3vLCtlee', '55555555555'),
(105, 'Theodore', 'Bagwell', 'bagwell@gmail.com', 'password', '66666666666'),
(106, 'john', 'Blakes', 'blakes@gmail.com', 'password', '77777777777'),
(107, 'Ashley', 'Cole', 'renter@gmail.com', '$2a$10$seAKbpBsTn/xgAg7nbRKWuH1dnRvMlLloxMOjH00zMmTu3vLCtlee', '88888888888');

