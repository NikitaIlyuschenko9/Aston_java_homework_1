package postman_echo_tests;
import io.restassured.RestAssured;
import org.junit.Test;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoPostRawTest {
    @Test
    public static void postmanPostRawTest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "{\n" +
                "    \"test\": \"value\"\n" +
                "}";
        given()
                .header("Content-Type", "text/plain") // Устанавливаем заголовок Content-Type
                .body(requestBody) // Указываем тело запроса
                .when()
                .post("/post") // Отправляем запрос
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
                .and().body("headers.content-type", is("text/plain; charset=ISO-8859-1"))
                .and().body("headers.accept", is("*/*"))
                .and().body("headers.postman-token", not(emptyString()))
                .and().body("headers.accept-encoding", is("gzip,deflate"))
                .and().body("headers.cookie", not(emptyString()))
                .and().body("json", equalTo(null))
                .and().body("url", is("https://postman-echo.com/post"));
    }
}