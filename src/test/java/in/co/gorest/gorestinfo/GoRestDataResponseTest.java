package in.co.gorest.gorestinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GoRestDataResponseTest extends TestBase {

    @Test  //1.Total records are 20
    public void Test001() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

        List<Integer> listOfdata = response.then().extract().path("data");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The Total record on the  page is : " + listOfdata.size());
        System.out.println("------------------End of Test---------------------------");
    }

    @Test  //2.id 3261 has name = "Sukanya Varma"
    public void Test002() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

        String username = response.then().extract().path("[3].name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The Total record on the  page is : " + username);
        System.out.println("------------------End of Test---------------------------");
    }


    @Test  //3.id 3262 has email = "chandravati_pilla@hyatt-hermann.co"
    public void Test003() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

        String useremail = response.then().extract().path("[4].email");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The User eamil is : " + useremail);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test  //4.id 3262 has email = "chandravati_pilla@hyatt-hermann.co"
    public void Test004() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

        String useremail = response.then().extract().path("[4].email");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The User eamil is : " + useremail);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test  //4.id 3262 has gender = "female"
    public void Test005() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

        String usergender = response.then().extract().path("[2].gender");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The User's gender is : " + usergender);
        System.out.println("------------------End of Test---------------------------");
    }
    @Test  //4.id 3261 has gender = "male"
    public void Test006() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

        String usergender = response.then().extract().path("[3].gender");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The User's gender is : " + usergender);
        System.out.println("------------------End of Test---------------------------");
    }
}