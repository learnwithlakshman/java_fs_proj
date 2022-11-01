create table team_details(
team_label varchar(5) primary key,
team_name varchar(250),
home_ground varchar(250),
city varchar(250),
coach varchar(250),
captain varchar(250),
debut int);

create table player(
id int primary key,
name varchar(250),
team_label varchar(5) references team_details(team_label),
role varchar(250),
country varchar(250),
amount float
);

