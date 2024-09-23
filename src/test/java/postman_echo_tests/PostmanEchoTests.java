package postman_echo_tests;

import org.junit.Test;
public class PostmanEchoTests {

    @Test
    public void runAllTests() {
        postman_echo_tests.PostmanEchoPostRawTest.postmanPostRawTest();
        postman_echo_tests.PostmanEchoGetTest.postmanGetTest();
        postman_echo_tests.PostmanEchoPostFormDataTest.postmanPostFormTest();
        postman_echo_tests.PostmanEchoPutRequestTest.postmanPutTest();
        postman_echo_tests.PostmanEchoPatchTest.postmanPatchTest();
        postman_echo_tests.PostmanEchoDeleteTest.postmanDeleteTest();
    }
}
