CREATE TABLE Pokemon(
    dex_number Integer(4) not null,
    english_name varchar(30) not null,
    legend_status varchar(30),
    catch_rate integer(10),
    base_friendship int(9),
    growth_rate varchar(20),
    primary key(dex_number)
);

LOAD DATA LOCAL INFILE "C:\Users\demur\OneDrive\Documents\GitHub\PokemonFullStack\CSV_Raw_Data\pokémon.sql"
INTO TABLE Pokemon
FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

CREATE TABLE PokemonForm(
    dex_number Integer(4) not null,
    form_name Varchar(45) not null,
    generation Integer(2),
    species Varchar(45),
    height double,
    weight double,
    stattotal Integer(9),
    hp Integer(9),
    attack Integer(9),
    defense Integer(9),
    special_attack Integer(9),
    special_defense Integer(9),
    speed Integer(9),
    percentMale Integer(9),
    primary key(dex_number, form_name),
    FOREIGN KEY (dex_number) REFERENCES Pokemon(dex_number)
);

CREATE TABLE Abilities(
    abilities_index Integer(9) not null,
    ability_name varchar(45),
    ability_description varchar(45),
    primary key(abilities_index)
);

CREATE TABLE PokemonFormAbilities(
    dex_number Integer(9) not null,
    form_name Varchar(45) not null,
    ability_index Integer(9) not null,
    primary key(dex_number, form_name, ability_index),
    FOREIGN KEY (dex_number, form_name) REFERENCES PokemonForm(dex_number, form_name),
    FOREIGN KEY (ability_index) REFERENCES Abilities(abilities_index)
);

CREATE TABLE Types(
    type_index Integer(9) not null,
    type_name varchar(20) not null,
    primary key(type_index)
);

CREATE TABLE TypeMatchups(
    attack_type_index Integer(9) not null,
    defense_type_index Integer(9) not null,
    modifier double,
    primary key(attack_type_index, defense_type_index),
    FOREIGN KEY (attack_type_index) REFERENCES Types(type_index),
    FOREIGN KEY (defense_type_index) REFERENCES Types(type_index)
);

CREATE TABLE PokemonFormTypes(
    dex_number Integer(9) not null,
    form_name varchar(45) not null,
    type_index Integer(9) not null,
    primary key(dex_number, form_name, type_index),
    FOREIGN KEY (dex_number, form_name) REFERENCES PokemonForm(dex_number, form_name),
    FOREIGN KEY (type_index) REFERENCES Types(type_index)
);

DROP TABLE PokemonFormTypes;
DROP TABLE TypeMatchups;
DROP TABLE Types;
DROP TABLE PokemonFormAbilities;
DROP TABLE Abilities;
DROP TABLE PokemonForm;
DROP TABLE Pokemon;