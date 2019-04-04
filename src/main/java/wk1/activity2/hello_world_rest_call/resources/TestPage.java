package wk1.activity2.hello_world_rest_call.resources;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.io.IOException;

// Set the Path for this resource

public class TestPage {
    // Set the path for this function

    // Set the HTTP request method

    // Set the type of content that will be sent in response

    public Response helloWorld() {
        System.err.println("Hello world!");
        return null;
    }

    // Set the path for this function

    // Set the HTTP request method

    // Set the type of content that will be sent in response

    public Response getProduct(String jsonText) {
        System.err.println("Getting product...");

        // Create an ObjectMapper to parse the JSON text.

        int num1;
        int num2;
        int product;
        String resultJSON = "";

        try {
            // Get the first integer from the JSON text

            // Get the second integer from the JSON text

            product = num1 * num2;
            System.err.println(num1 + " * " + num2 + " = " + product);

            // Create a string to return as JSON
            resultJSON = Integer.toString(product);
        } catch (IOException e) {
            // Some error occurred extracting values from the JSON text
            return null;
        }
        // Success. Return a JSON string in the response
        return null;
    }
}
