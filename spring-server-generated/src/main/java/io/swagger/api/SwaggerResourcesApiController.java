package io.swagger.api;

import io.swagger.model.SecurityConfiguration;
import io.swagger.model.SwaggerResource;
import io.swagger.model.UiConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-28T07:07:39.249850626Z[GMT]")
@RestController
public class SwaggerResourcesApiController implements SwaggerResourcesApi {

    private static final Logger log = LoggerFactory.getLogger(SwaggerResourcesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SwaggerResourcesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SecurityConfiguration> securityConfiguration() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SecurityConfiguration>(objectMapper.readValue("{\n  \"clientId\" : \"clientId\",\n  \"apiKey\" : \"apiKey\",\n  \"appName\" : \"appName\",\n  \"scopeSeparator\" : \"scopeSeparator\",\n  \"clientSecret\" : \"clientSecret\",\n  \"realm\" : \"realm\",\n  \"apiKeyName\" : \"apiKeyName\",\n  \"apiKeyVehicle\" : \"apiKeyVehicle\"\n}", SecurityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SecurityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SecurityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SecurityConfiguration> securityConfiguration1() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SecurityConfiguration>(objectMapper.readValue("{\n  \"clientId\" : \"clientId\",\n  \"apiKey\" : \"apiKey\",\n  \"appName\" : \"appName\",\n  \"scopeSeparator\" : \"scopeSeparator\",\n  \"clientSecret\" : \"clientSecret\",\n  \"realm\" : \"realm\",\n  \"apiKeyName\" : \"apiKeyName\",\n  \"apiKeyVehicle\" : \"apiKeyVehicle\"\n}", SecurityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SecurityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SecurityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SecurityConfiguration> securityConfiguration2() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SecurityConfiguration>(objectMapper.readValue("{\n  \"clientId\" : \"clientId\",\n  \"apiKey\" : \"apiKey\",\n  \"appName\" : \"appName\",\n  \"scopeSeparator\" : \"scopeSeparator\",\n  \"clientSecret\" : \"clientSecret\",\n  \"realm\" : \"realm\",\n  \"apiKeyName\" : \"apiKeyName\",\n  \"apiKeyVehicle\" : \"apiKeyVehicle\"\n}", SecurityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SecurityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SecurityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SecurityConfiguration> securityConfiguration3() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SecurityConfiguration>(objectMapper.readValue("{\n  \"clientId\" : \"clientId\",\n  \"apiKey\" : \"apiKey\",\n  \"appName\" : \"appName\",\n  \"scopeSeparator\" : \"scopeSeparator\",\n  \"clientSecret\" : \"clientSecret\",\n  \"realm\" : \"realm\",\n  \"apiKeyName\" : \"apiKeyName\",\n  \"apiKeyVehicle\" : \"apiKeyVehicle\"\n}", SecurityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SecurityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SecurityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SecurityConfiguration> securityConfiguration4() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SecurityConfiguration>(objectMapper.readValue("{\n  \"clientId\" : \"clientId\",\n  \"apiKey\" : \"apiKey\",\n  \"appName\" : \"appName\",\n  \"scopeSeparator\" : \"scopeSeparator\",\n  \"clientSecret\" : \"clientSecret\",\n  \"realm\" : \"realm\",\n  \"apiKeyName\" : \"apiKeyName\",\n  \"apiKeyVehicle\" : \"apiKeyVehicle\"\n}", SecurityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SecurityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SecurityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SecurityConfiguration> securityConfiguration5() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SecurityConfiguration>(objectMapper.readValue("{\n  \"clientId\" : \"clientId\",\n  \"apiKey\" : \"apiKey\",\n  \"appName\" : \"appName\",\n  \"scopeSeparator\" : \"scopeSeparator\",\n  \"clientSecret\" : \"clientSecret\",\n  \"realm\" : \"realm\",\n  \"apiKeyName\" : \"apiKeyName\",\n  \"apiKeyVehicle\" : \"apiKeyVehicle\"\n}", SecurityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SecurityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SecurityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SecurityConfiguration> securityConfiguration6() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SecurityConfiguration>(objectMapper.readValue("{\n  \"clientId\" : \"clientId\",\n  \"apiKey\" : \"apiKey\",\n  \"appName\" : \"appName\",\n  \"scopeSeparator\" : \"scopeSeparator\",\n  \"clientSecret\" : \"clientSecret\",\n  \"realm\" : \"realm\",\n  \"apiKeyName\" : \"apiKeyName\",\n  \"apiKeyVehicle\" : \"apiKeyVehicle\"\n}", SecurityConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SecurityConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SecurityConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SwaggerResource>> swaggerResources() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SwaggerResource>>(objectMapper.readValue("[ {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n}, {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SwaggerResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SwaggerResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SwaggerResource>> swaggerResources1() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SwaggerResource>>(objectMapper.readValue("[ {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n}, {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SwaggerResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SwaggerResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SwaggerResource>> swaggerResources2() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SwaggerResource>>(objectMapper.readValue("[ {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n}, {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SwaggerResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SwaggerResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SwaggerResource>> swaggerResources3() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SwaggerResource>>(objectMapper.readValue("[ {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n}, {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SwaggerResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SwaggerResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SwaggerResource>> swaggerResources4() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SwaggerResource>>(objectMapper.readValue("[ {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n}, {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SwaggerResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SwaggerResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SwaggerResource>> swaggerResources5() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SwaggerResource>>(objectMapper.readValue("[ {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n}, {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SwaggerResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SwaggerResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SwaggerResource>> swaggerResources6() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SwaggerResource>>(objectMapper.readValue("[ {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n}, {\n  \"swaggerVersion\" : \"swaggerVersion\",\n  \"name\" : \"name\",\n  \"location\" : \"location\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SwaggerResource>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SwaggerResource>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UiConfiguration> uiConfiguration() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UiConfiguration>(objectMapper.readValue("{\n  \"docExpansion\" : \"docExpansion\",\n  \"defaultModelRendering\" : \"defaultModelRendering\",\n  \"showRequestHeaders\" : true,\n  \"validatorUrl\" : \"validatorUrl\",\n  \"jsonEditor\" : true,\n  \"apisSorter\" : \"apisSorter\",\n  \"supportedSubmitMethods\" : [ \"supportedSubmitMethods\", \"supportedSubmitMethods\" ],\n  \"requestTimeout\" : 0\n}", UiConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UiConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UiConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UiConfiguration> uiConfiguration1() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UiConfiguration>(objectMapper.readValue("{\n  \"docExpansion\" : \"docExpansion\",\n  \"defaultModelRendering\" : \"defaultModelRendering\",\n  \"showRequestHeaders\" : true,\n  \"validatorUrl\" : \"validatorUrl\",\n  \"jsonEditor\" : true,\n  \"apisSorter\" : \"apisSorter\",\n  \"supportedSubmitMethods\" : [ \"supportedSubmitMethods\", \"supportedSubmitMethods\" ],\n  \"requestTimeout\" : 0\n}", UiConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UiConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UiConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UiConfiguration> uiConfiguration2() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UiConfiguration>(objectMapper.readValue("{\n  \"docExpansion\" : \"docExpansion\",\n  \"defaultModelRendering\" : \"defaultModelRendering\",\n  \"showRequestHeaders\" : true,\n  \"validatorUrl\" : \"validatorUrl\",\n  \"jsonEditor\" : true,\n  \"apisSorter\" : \"apisSorter\",\n  \"supportedSubmitMethods\" : [ \"supportedSubmitMethods\", \"supportedSubmitMethods\" ],\n  \"requestTimeout\" : 0\n}", UiConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UiConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UiConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UiConfiguration> uiConfiguration3() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UiConfiguration>(objectMapper.readValue("{\n  \"docExpansion\" : \"docExpansion\",\n  \"defaultModelRendering\" : \"defaultModelRendering\",\n  \"showRequestHeaders\" : true,\n  \"validatorUrl\" : \"validatorUrl\",\n  \"jsonEditor\" : true,\n  \"apisSorter\" : \"apisSorter\",\n  \"supportedSubmitMethods\" : [ \"supportedSubmitMethods\", \"supportedSubmitMethods\" ],\n  \"requestTimeout\" : 0\n}", UiConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UiConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UiConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UiConfiguration> uiConfiguration4() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UiConfiguration>(objectMapper.readValue("{\n  \"docExpansion\" : \"docExpansion\",\n  \"defaultModelRendering\" : \"defaultModelRendering\",\n  \"showRequestHeaders\" : true,\n  \"validatorUrl\" : \"validatorUrl\",\n  \"jsonEditor\" : true,\n  \"apisSorter\" : \"apisSorter\",\n  \"supportedSubmitMethods\" : [ \"supportedSubmitMethods\", \"supportedSubmitMethods\" ],\n  \"requestTimeout\" : 0\n}", UiConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UiConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UiConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UiConfiguration> uiConfiguration5() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UiConfiguration>(objectMapper.readValue("{\n  \"docExpansion\" : \"docExpansion\",\n  \"defaultModelRendering\" : \"defaultModelRendering\",\n  \"showRequestHeaders\" : true,\n  \"validatorUrl\" : \"validatorUrl\",\n  \"jsonEditor\" : true,\n  \"apisSorter\" : \"apisSorter\",\n  \"supportedSubmitMethods\" : [ \"supportedSubmitMethods\", \"supportedSubmitMethods\" ],\n  \"requestTimeout\" : 0\n}", UiConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UiConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UiConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UiConfiguration> uiConfiguration6() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UiConfiguration>(objectMapper.readValue("{\n  \"docExpansion\" : \"docExpansion\",\n  \"defaultModelRendering\" : \"defaultModelRendering\",\n  \"showRequestHeaders\" : true,\n  \"validatorUrl\" : \"validatorUrl\",\n  \"jsonEditor\" : true,\n  \"apisSorter\" : \"apisSorter\",\n  \"supportedSubmitMethods\" : [ \"supportedSubmitMethods\", \"supportedSubmitMethods\" ],\n  \"requestTimeout\" : 0\n}", UiConfiguration.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UiConfiguration>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UiConfiguration>(HttpStatus.NOT_IMPLEMENTED);
    }

}
