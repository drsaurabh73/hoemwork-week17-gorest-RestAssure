package in.co.gorest.gorestinfo;

import in.co.gorest.model.GorestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GoRestCreateUserTest extends TestBase {

    @Test
    public void setCreateUser() {
        GorestPojo gorestPojo = new GorestPojo();
        gorestPojo.setName("Tenali Ramakrishna");
        gorestPojo.setEmail("ten_ali.rama_krishna1234@gmail.com");
        gorestPojo.setStatus("active");
        gorestPojo.setGender("female");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .body(gorestPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();
    }

    @Test
    public void setPatchUser() {
        GorestPojo gorestPojo = new GorestPojo();
        gorestPojo.setName("Allasani Peddana");
        gorestPojo.setEmail("allasani.peddana1_1_3@gmail.com");
        gorestPojo.setStatus("active");
        gorestPojo.setGender("female");

        Response response = given()

                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .body(gorestPojo)
                .pathParam("id", 4225)
                .when()
                .patch("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}