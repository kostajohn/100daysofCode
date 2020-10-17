create database workouts;

create table exercise (name varchar(20), sets int(2), reps int(3), weight int(4),
date DATE, exerciseId int Not Null auto increment, primary key exerciseId);
