package in.co.gorest.gorestinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GoRestDeleteUserTest extends TestBase {
    @Test
    public void deleteSigleUserInfo() {
        Response response = given()
                .pathParam("id", 4225)
                .when()
                .delete("/users/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }

}
