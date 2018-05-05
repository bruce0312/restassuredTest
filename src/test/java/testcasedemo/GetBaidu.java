package testcasedemo;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class GetBaidu {
    public static void main(String[] args){

    }

    @Test
    public void getBaidu(){

        given()
            .when()
                .get("https://www.baidu.com").prettyPeek()
            .then()
                .statusCode(200);
    }



}
