CREATE TABLE recipe (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    video_url TEXT
);

CREATE TABLE ingredient (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL UNIQUE
);

CREATE TABLE measure (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL UNIQUE
);

CREATE TABLE recipe_ingredient (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    recipe_id INTEGER NOT NULL,
    ingredient_id INTEGER NOT NULL,
    measure_id INTEGER,
    amount REAL NOT NULL,
    FOREIGN KEY (recipe_id) REFERENCES recipe(id) ON DELETE CASCADE,
    FOREIGN KEY (ingredient_id) REFERENCES ingredient(id) ON DELETE CASCADE,
    FOREIGN KEY (measure_id) REFERENCES measure(id)
);

insert into measure (name) values ('grams');
insert into measure (name) values ('milliliters');
insert into measure (name) values ('pieces');

insert into ingredient (name) values ('Potato');
insert into ingredient (name) values ('Tomato');
insert into ingredient (name) values ('Garlic');
insert into ingredient (name) values ('Onion');

insert into recipe (name, video_url) values ('Soup', 'https://www.tiktok.com/@scout2015/video/6718335390845095173');
insert into recipe (name, video_url) values ('Fried potatoes', 'https://www.tiktok.com/@scout2015/video/6718335390845095173');

insert into recipe_ingredient (recipe_id, ingredient_id, measure_id, amount) values (1, 1, 3, 3);
insert into recipe_ingredient (recipe_id, ingredient_id, measure_id, amount) values (1, 3, 3, 3);
insert into recipe_ingredient (recipe_id, ingredient_id, measure_id, amount) values (1, 4, 3, 2);
insert into recipe_ingredient (recipe_id, ingredient_id, measure_id, amount) values (2, 1, 3, 4);
insert into recipe_ingredient (recipe_id, ingredient_id, measure_id, amount) values (2, 2, 3, 3);