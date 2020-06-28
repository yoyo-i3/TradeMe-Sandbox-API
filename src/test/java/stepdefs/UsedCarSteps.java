package stepdefs;

import apiServices.BaseService;
import apiServices.UsedCars;
import domain.UsedCarsDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UsedCarSteps {
    private final UsedCars usedCars = new UsedCars();
    private final UsedCarsDetails usedCarsDetails = new UsedCarsDetails();

    @Given("^I go to the Used Cars Category API$")
    public void onTheUsedCarsApi() {
        String endpointPath = "Categories/{subCategoryItem}.{file_format}";
        usedCarsDetails.setApiResponse(BaseService.getJsonResponse(System.getProperty("site.url"), endpointPath,
                "UsedCars", "json"));
    }

    @When("^I get list of Used Cars Brands$")
    public void getUsedCarBrand() {
        usedCarsDetails.setSubcategoryList(usedCarsDetails.getApiResponse().jsonPath().getList("Subcategories"));
    }

    @Then("^Total Number of named brands of used cars available in the TradeMe UsedCars category is (.+)$")
    public void getTotalUsedCarBrands(Integer brandCount) {
        Integer count = UsedCarsDetails.getSubcategoryList().size();
        assertThat(count, equalTo(brandCount));
        System.out.println("Total Number of named brands of used cars available: " + brandCount);
    }

    @Then("^I verify that brand '(.+)' does (.+) in the Used Cars List$")
    public void verifyBrandAvailabilityInUsedCars(String brandName, String availability) {
        String result = usedCars.subCategoryItemAvailability(usedCarsDetails.getApiResponse(), "Name",
                brandName, availability);
        System.out.println(result);
        assertThat(result, equalTo(
                brandName + " brand does " + availability)
        );
        if(brandName.equalsIgnoreCase("Kia")){
            getKiaNumber();
        }
    }

    @And("^I check Kia Number$")
    public void getKiaNumber() {
        Integer KiaIndex = usedCars.requestSubCategoryAttribute_getIndex(usedCarsDetails.getApiResponse(),
                "Name", "Kia");
        String message = "The current Number of Kia cars listed: ";
        System.out.println(message + usedCars.requestSubCategoryAttribute_getValuesList(
                usedCarsDetails.getApiResponse()).get(KiaIndex).get("Number"));
    }
}
