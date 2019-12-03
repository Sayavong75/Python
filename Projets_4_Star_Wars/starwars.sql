drop table if exists starship_name;
drop table if exists vehicle_name;
drop table if exists vehicle_class;
drop table if exists manufacturer;
drop table if exists model;


create table model
(
    -- definition de la clé primaire
    id                     serial
        constraint model_pk
            primary key,
    -- puis les autres colonnes
    name_model             varchar,
    length_model           double precision,
    cost_in_credits        int,
    max_atmosphering_speed double precision,
    crew                   int,
    passengers             int,
    cargo_capacity         int,
    consumables            varchar
);

create table manufacturer
(
    -- definition de la clé primaire
    id                serial
        constraint manufacturer_pk
            primary key,
    -- puis les autres colonnes
    name_manufacturer varchar
);

create table vehicle_class
(
    -- definition de la clé primaire
    id                 serial
        constraint vehicle_class_pk
            primary key,
    -- puis les autres colonnes
    name_vehicle_class varchar
);

create table vehicle_name
(
    -- definition de la clé primaire
    id               serial
        constraint vehicle_name_pk
            primary key,
    -- puis les autres colonnes
    name_vehicle     varchar,
    id_model         int
        constraint model_fk
            references model
            on delete cascade,
    id_manufacturer  int
        constraint manufacturer_fk
            references manufacturer
            on delete cascade,
    id_vehicle_class int
        constraint vehicle_class_fk
            references vehicle_class
            on delete cascade
);

create table starship_name
(
    -- definition de la clé primaire
    id                serial
        constraint starship_name_pk
            primary key,
    -- puis les autres colonnes
    name_starship     varchar,
    MGLT_model        int,
    hyperdrive_rating decimal(2, 1)
) inherits (vehicle_name);

------------------------------------------------------------------------------------------------------------------------

drop table if exists character;
drop type if exists e_type_color;
drop table if exists gender;
drop type if exists e_type_gender;
drop table if exists species;
drop table if exists classification;

create table classification
(
    -- definition de la clé primaire
    id                  serial
        constraint classification_pk
            primary key,
    -- puis les autres colonnes
    name_classification varchar
);

create table species
(
    -- definition de la clé primaire
    id                serial
        constraint species_pk
            primary key,
    -- puis les autres colonnes
    name_species      varchar,
    designation varchar,
    average_height int,
    average_lifespan int,
    language varchar,

    id_classification int
        constraint classification_fk
            references classification
            on delete cascade
);

create type e_type_gender as enum (
    'male',
    'female'
    );
create table gender
(
    -- definition de la clé primaire
    id          serial
        constraint gender_pk
            primary key,
    -- puis les autres colonnes
    type_gender e_type_gender
);

create type e_type_color as enum (
    'hair',
    'skin',
    'eye'
    );
create table character
(
    -- definition de la clé primaire
    id                   serial
        constraint character_pk
            primary key,
    -- puis les autres colonnes
    name_character       varchar,
    height_character     int,
    mass_character       double precision,
    birth_year_character varchar,

    type_color           e_type_color,

    id_gender            int
        constraint gender_fk
            references gender
            on delete cascade,
    id_species            int
        constraint species_fk
            references species
            on delete cascade
);







