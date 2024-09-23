package postman_echo_tests;
import io.restassured.RestAssured;
import org.junit.Test;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoPatchTest {
    @Test
    public static void postmanPatchTest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";
        given()
                .header("Content-Type", "text/plain; charset=utf-8")
                .body(requestBody) // Указываем тело запроса
                .when()
                .patch("/patch") // Отправляем запрос
                .then()
                .statusCode(200).log().all()
                .body("args", is(Collections.emptyMap()))
                .and().body("data", is(requestBody))
                .and().body("files", is(Collections.emptyMap()))
                .and().body("form", is(Collections.emptyMap()))
                .and().body("headers.host", is("postman-echo.com"))
                .and().body("headers.x-forwarded-start", not(emptyString()))
                .and().body("headers.content-length", not(emptyString()))
                .and().body("headers.x-forwarded-proto", is("https"))
                .and().body("headers.x-forwarded-port", is("443"))
                .and().body("headers.x-amzn-trace-id", not(emptyString()))
                .and().body("headers.content-type", is("text/plain; charset=utf-8"))
                .and().body("headers.accept", is("*/*"))
                .and().body("headers.postman-token", not(emptyString()))
                .and().body("headers.accept-encoding", is("gzip,deflate"))
                .and().body("headers.cookie", not(emptyString()))
                .and().body("json", equalTo(null))
                .and().body("url", is("https://postman-echo.com/patch"));
    }
}
