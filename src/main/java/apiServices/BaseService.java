package apiServices;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseService {

    public static Response getJsonResponse(String baseURI, String endpoint, String subCategoryItem, String file_format) {
        return given().
                pathParam("subCategoryItem", subCategoryItem).pathParam("file_format", file_format).
                when().get(baseURI + endpoint).
                then().contentType(ContentType.JSON).extract().response();
    }

}
