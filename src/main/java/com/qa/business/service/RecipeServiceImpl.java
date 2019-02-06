package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.RecipeRepository;

public class RecipeServiceImpl implements RecipeService {

	@Inject
	private RecipeRepository repo;

	public String getAllMovies() {
		return repo.getAllRecipes();
	}

	@Override
	public String addRecipe(String recipe) {
		if (recipe.toLowerCase().contains("bacon")) {

			return "Can't Add This Recipe, IT HAS BACON!!!";
		}
		return repo.createRecipe(recipe);
	}

	@Override
	public String getAllRecipes() {
		return repo.getAllRecipes();
	}

	@Override
	public String getARecipe(Long id) {
		return repo.getARecipe(id);

	}

	@Override
	public String updateRecipe(String recipe, Long id) {
		return repo.updateRecipe(recipe, id);
	}

	@Override
	public String deleteRecipe(Long id) {
		return repo.deleteRecipe(id);
	}

	@Override
	public int cycleRecipes(String recipeName) {
		return repo.cycleRecipes(recipeName);
	}

}
