package stepDefinitions;



import org.junit.Assert;

import AmazonImplimentation.Product;
import AmazonImplimentation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;
	Search search;
	
	@Given("i have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step1: im on search page");
		
	}

	@When("i search for a product name with {string} and price {int}")
	public void i_search_for_a_product_name_with_and_price(String productName, Integer price) {
		System.out.println("Step2: search the product with name:" + productName + "price:" + price);
			
		product = new Product(productName, price);
	  
	}

	@Then("product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step3: product "  + productName +  " isDisplayed");		
		
		search= new Search();
		String name= search.displayProduct(product);
		System.out.println("search product is:" + name);
		Assert.assertEquals(name, product.getProductName());
	
	}
	
	@Then("order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer int1, String string) {
	System.out.println(int1 + string);
	}


}
