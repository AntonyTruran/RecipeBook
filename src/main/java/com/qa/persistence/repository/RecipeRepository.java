package com.qa.persistence.repository;

public interface RecipeRepository {
	// C
	String createRecipe(String recipe);

	// R
	String getAllRecipes();

	String getARecipe(Long id);

	// U
	String updateRecipe(String recipe, Long id);

	// D
	String deleteRecipe(Long id);

	int cycleRecipes(String recipe_name);
}
