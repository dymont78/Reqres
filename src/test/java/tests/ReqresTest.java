package tests;

import org.testng.annotations.Test;
import reqres_objects.User;

import static io.restassured.RestAssured.given;

public class ReqresTest {

    @Test
    public void postUserTest() {
        User user = User.builder()
                .name("morpheus")
                .job("leader")
                .build();
        given()
                .body(user)
                .header("Content-Type", "application/json")
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201);
    }
}
