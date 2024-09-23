package postman_echo_tests;
import io.restassured.RestAssured;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoPostFormDataTest {
    @Test
    public static void postmanPostFormTest() {
        RestAssured.baseURI = "https://postman-echo.com";
        Map<String, String> list = Map.of("foo1", "bar1", "foo2", "bar2");


        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=utf-8") // Устанавливаем заголовок Content-Type
                .formParam("foo1", "bar1") // Передаем параметр foo1
                .formParam("foo2", "bar2") // Передаем параметр foo2
                .when()
                .post("/post") // Отправляем запрос
                .then()
                .statusCode(200).log().all()// Проверяем, что статус-код 200 (OK)
                .body("args", is(Collections.emptyMap()))
                .and().body("data", is(""))
                .and().body("files", is(Collections.emptyMap()))
                .and().body("form.foo1", equalTo("bar1")) // Проверяем, что поле form.foo1 равно "bar1"
                .and().body("form.foo2", equalTo("bar2")) // Проверяем, что поле form.foo2 равно "bar2"
                .and().body("headers.host", is("postman-echo.com"))
                .and().body("headers.x-forwarded-start", not(emptyString()))
                .and().body("headers.content-length", not(emptyString()))
                .and().body("headers.x-forwarded-proto", is("https"))
                .and().body("headers.x-forwarded-port", is("443"))
                .and().body("headers.x-amzn-trace-id", not(emptyString()))
                .and().body("headers.accept", is("*/*"))
                .and().body("headers.postman-token", not(emptyString()))
                .and().body("headers.accept-encoding", is("gzip,deflate"))
                .and().body("headers.cookie", not(emptyString()))
                .and().body("json", is(list))
                .and().body("url", is("https://postman-echo.com/post"));
    }
}