package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AvengerResourceTest {

    @Test
    public void testAvengerEndpoint() {
        given()
          .when().get("/avenger")
          .then()
             .statusCode(200)
             .body("size()", is(4));
    }

}