CREATE DATABASE workouts;

CREATE TABLE exercise (
exerciseId int NOT NULL AUTO_INCREMENT,
name VARCHAR(20),
 sets INT(2),
 reps INT(3),
 weight INT(4),
day DATE,

primary key (exerciseId));
