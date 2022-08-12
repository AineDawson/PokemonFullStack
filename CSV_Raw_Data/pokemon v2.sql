CREATE TABLE Pokemon(
    dex_number Integer(4) not null,
    pokemon_name varchar(30) not null,
    legend_status varchar(30),
    catch_rate Integer(10),
    base_friendship Integer(9),
    growth_rate varchar(20),
    primary key(dex_number)
);

LOAD DATA LOCAL INFILE "C:/Users/demur/Documents/Coding/Practice Code/Full Stack Pokemon App/CSV_Raw_Data/pokemon.csv"
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
    stat_total Integer(9),
    hp Integer(9),
    attack Integer(9),
    defense Integer(9),
    special_attack Integer(9),
    special_defense Integer(9),
    speed Integer(9),
    percent_male Integer(9),
    primary key(dex_number, form_name),
    FOREIGN KEY (dex_number) REFERENCES Pokemon(dex_number)
);

LOAD DATA LOCAL INFILE "C:/Users/demur/Documents/Coding/Practice Code/Full Stack Pokemon App/CSV_Raw_Data/PokemonForm.csv"
INTO TABLE PokemonForm
FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

CREATE TABLE Abilities(
    abilities_index Integer(9) not null,
    ability_name varchar(45),
    ability_description varchar(150),
    generation integer(2),
    primary key(abilities_index)
);

LOAD DATA LOCAL INFILE "C:/Users/demur/Documents/Coding/Practice Code/Full Stack Pokemon App/CSV_Raw_Data/Abilities.csv"
INTO TABLE Abilities
FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

CREATE TABLE PokemonFormAbilities(
    dex_number Integer(9) not null,
    form_name Varchar(45) not null,
    ability_index Integer(9) not null,
    primary key(dex_number, form_name, ability_index),
    FOREIGN KEY (dex_number, form_name) REFERENCES PokemonForm(dex_number, form_name),
    FOREIGN KEY (ability_index) REFERENCES Abilities(abilities_index)
);

LOAD DATA LOCAL INFILE "C:/Users/demur/Documents/Coding/Practice Code/Full Stack Pokemon App/CSV_Raw_Data/PokemonFormAbilities.csv"
INTO TABLE pokemonformabilities
FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

CREATE TABLE Types(
    type_index Integer(9) not null,
    type_name varchar(20) not null,
    primary key(type_index)
);

LOAD DATA LOCAL INFILE "C:/Users/demur/Documents/Coding/Practice Code/Full Stack Pokemon App/CSV_Raw_Data/Types.csv"
INTO TABLE types
FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

CREATE TABLE TypeMatchups(
    attack_type_index Integer(9) not null,
    defense_type_index Integer(9) not null,
    modifier double,
    primary key(attack_type_index, defense_type_index),
    FOREIGN KEY (attack_type_index) REFERENCES Types(type_index),
    FOREIGN KEY (defense_type_index) REFERENCES Types(type_index)
);

LOAD DATA LOCAL INFILE "C:/Users/demur/Documents/Coding/Practice Code/Full Stack Pokemon App/CSV_Raw_Data/TypeMatchups.csv"
INTO TABLE typematchups
FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

CREATE TABLE PokemonFormTypes(
    dex_number Integer(9) not null,
    form_name varchar(45) not null,
    type_index Integer(9) not null,
    primary key(dex_number, form_name, type_index),
    FOREIGN KEY (dex_number, form_name) REFERENCES PokemonForm(dex_number, form_name),
    FOREIGN KEY (type_index) REFERENCES Types(type_index)
);

LOAD DATA LOCAL INFILE "C:/Users/demur/Documents/Coding/Practice Code/Full Stack Pokemon App/CSV_Raw_Data/PokemonFormTypes.csv"
INTO TABLE pokemonformtypes
FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

DROP TABLE PokemonFormTypes;
DROP TABLE TypeMatchups;
DROP TABLE Types;
DROP TABLE PokemonFormAbilities;
DROP TABLE Abilities;
DROP TABLE PokemonForm;
DROP TABLE Pokemon;