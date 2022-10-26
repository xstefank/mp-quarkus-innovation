package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.acme.entity.Avenger;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AvengerResourceTest {

    @Test
    public void testAvengerEndpoint() {
        Avenger avenger = new Avenger("Ant-Man", "Scott Lang", false);
        given()
            .contentType(ContentType.JSON)
            .body(avenger)
            .when().post("/avenger")
            .then()
            .statusCode(201);

        given()
          .when().get("/avenger")
          .then()
             .statusCode(200)
             .body("size()", is(5));
    }

}