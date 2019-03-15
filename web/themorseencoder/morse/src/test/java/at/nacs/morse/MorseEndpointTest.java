package at.nacs.morse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class MorseEndpointTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    String url = "/morse";

    @Test
    void encode() {
        String actual = testRestTemplate.postForObject(url, "m", String.class);
        String expected = "--";

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}