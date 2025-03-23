package com.example.weeknightrecipes.constant;

public interface DatabaseConstants {

    interface TableNames {
        String RECIPE = "recipe";
        String INGREDIENT = "ingredient";
        String MEASURE = "measure";
        String RECIPE_INGREDIENT = "recipe_ingredient";
    }

    interface ColumnNames {
        String RECIPE_ID = "recipe_id";
        String INGREDIENT_ID = "ingredient_id";
        String MEASURE_ID = "measure_id";
    }

}
