package api;

import static io.dropwizard.testing.FixtureHelpers.*;
import static org.assertj.core.api.Assertions.assertThat;
import io.dropwizard.jackson.Jackson;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Created by goutham on 03/05/16.
 */

public class ColorTest {
    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void deserializesFromJSON() throws Exception {
        Color c = new Color(0, 0, 0);
        String json = MAPPER.writeValueAsString(c);
        JSONAssert.assertEquals(json, fixture("fixtures/api/color_simple.json"), false);

        c = new Color(255, 255, 255);
        json = MAPPER.writeValueAsString(c);
        JSONAssert.assertEquals(json, fixture("fixtures/api/color_extreme.json"), false);

        c = new Color(123, 189, 126);
        json = MAPPER.writeValueAsString(c);
        JSONAssert.assertEquals(json, fixture("fixtures/api/color_random.json"), false);
    }
}
