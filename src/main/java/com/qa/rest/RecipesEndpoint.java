package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.business.service.RecipeService;

@Path("/recipe")
public class RecipesEndpoint {
	
	@Inject
	private RecipeService service;

	@Path("/getAllRecipes")
	@GET
	@Produces({ "application/json" })
	public String getAllRecipes() {
		return service.getAllRecipes();
	}
	
	@Path("/cycleRecipes/{title}")
	@GET
	@Produces({ "application/json" })
	public int cycleRecipes(@PathParam("title") String title) {
		return service.cycleRecipes(title);
	}
	
	@Path("/getARecipes/{id}")
	@GET
	@Produces({ "application/json" })
	public String getARecipe(@PathParam("id") Long id) {
		return service.getARecipe(id);
	}

	@Path("/createRecipe")
	@POST
	@Produces({ "application/json" })
	public String addRecipe(String recipe) {
		return service.addRecipe(recipe);
	}

	@Path("/deleteRecipe/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteRecipe(@PathParam("id") Long id) {
		return service.deleteRecipe(id);
	}

	public void setService(RecipeService service) {
		this.service = service;
	}

}
