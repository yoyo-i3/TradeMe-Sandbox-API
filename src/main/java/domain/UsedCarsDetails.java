package domain;

import io.restassured.response.Response;

import java.util.List;

public class UsedCarsDetails {

    public UsedCarsDetails() {
    }

    private Response apiResponse;
    private static List<String> SubcategoryList;

    public Response getApiResponse() {
        return apiResponse;
    }

    public void setApiResponse(Response apiResponse) {
        this.apiResponse = apiResponse;
    }

    public static List<String> getSubcategoryList() {
        return SubcategoryList;
    }

    public void setSubcategoryList(List<String> subcategoryList) {
        UsedCarsDetails.SubcategoryList = subcategoryList;
    }

    public void resetAll(){
        setApiResponse(null);
        setSubcategoryList(null);
    }


}
