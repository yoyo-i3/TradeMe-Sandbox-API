package apiServices;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

public class UsedCars {

    public String subCategoryItemAvailability(Response response, String subCategoryItem, String subCategoryItemValue,
                                              String availabilityCondition) {
        String result;
        try {
            if (availabilityCondition.equalsIgnoreCase("exist")) {
                response.
                        then().
                        assertThat().body("Subcategories." + subCategoryItem, hasItem(subCategoryItemValue));
                result = subCategoryItemValue + " brand does " + availabilityCondition;
            } else if (availabilityCondition.equalsIgnoreCase("NOT exist")) {
                response.
                        then().
                        assertThat().body("Subcategories." + subCategoryItem, not(hasItem(subCategoryItemValue)));
                result = subCategoryItemValue + " brand does " + availabilityCondition;
            } else{
                result = "Invalid test data";
            }
        } catch (AssertionError e) {
            result = subCategoryItemValue + " brand is expected to "
                    + availabilityCondition + " but the expectation failed";
        }
        return result;
    }

    public Integer requestSubCategoryAttribute_getIndex(Response response, String attributeName, String attributeValue) {
        List<String> attributeNameValues = response.jsonPath().getList("Subcategories." + attributeName);
        return attributeNameValues.indexOf(attributeValue);
    }

    public List<Map<String, String>> requestSubCategoryAttribute_getValuesList(Response response) {
        return response.jsonPath().getList("Subcategories");
    }

}
