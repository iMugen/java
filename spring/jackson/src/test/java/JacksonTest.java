import Car.Car;
import Person.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Daniel Liu 2020/3/4 7:30
 */


public class JacksonTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void jackson_api_test() throws JsonProcessingException {
        String person = "{\"name\":\"Jin\",\"age\":\"20\"}";
        Person value = objectMapper.readValue(person, Person.class);
        System.out.println("value = " + value);
    }

    @Test
    void jsonNode() throws JsonProcessingException {
        String json = "{ \"color\" : \"Black\", \"type\" : \"FIAT\" }";
        JsonNode jsonNode = objectMapper.readTree(json);
        String color = jsonNode.get("color").asText();
        System.out.println("color = " + color);
    }

    @Test
    void jsonArrayString_to_javaList() throws JsonProcessingException {
        String jsonCarArray = "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
        List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>() {
        });
    }

    @Test
    void configuring() throws JsonProcessingException {
        String jsonString = "{ \"color\" : \"Black\", \"type\" : \"Fiat\", \"year\":null }";
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true);
        Car car = objectMapper.readValue(jsonString, Car.class);

        JsonNode jsonNodeRoot = objectMapper.readTree(jsonString);
        JsonNode jsonNodeYear = jsonNodeRoot.get("year");
        String year = jsonNodeYear.asText();
        System.out.println("year = " + year);
    }

    @Test
    void enumTest() {
    }
}