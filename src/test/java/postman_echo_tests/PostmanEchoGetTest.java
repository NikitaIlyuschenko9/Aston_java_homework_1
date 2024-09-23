package postman_echo_tests;
import io.restassured.RestAssured;
import org.junit.Test;

import static org.hamcrest.Matchers.*;

public class PostmanEchoGetTest {

    @Test
    public static void postmanGetTest() {

        RestAssured
                .when().get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .then().assertThat().statusCode(200).log().all()
                .and().body("args.foo1", is("bar1"))
                .and().body("args.foo2", is("bar2"))
                .and().body("headers.host", is("postman-echo.com"))
                .and().body("headers.x-forwarded-start", not(emptyString()))
                .and().body("headers.x-amzn-trace-id", not(emptyString()))
                .and().body("headers.x-forwarded-proto", is("https"))
                .and().body("headers.x-forwarded-port", is("443"))
                .and().body("headers.accept", is("*/*"))
                .and().body("headers.postman-token", not(emptyString()))
                .and().body("headers.cookie", not(emptyString()))
                .and().body("url", is("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }
}