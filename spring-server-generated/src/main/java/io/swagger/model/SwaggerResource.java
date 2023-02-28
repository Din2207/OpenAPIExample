package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SwaggerResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-28T07:07:39.249850626Z[GMT]")


public class SwaggerResource   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("swaggerVersion")
  private String swaggerVersion = null;

  public SwaggerResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SwaggerResource location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(description = "")
  
    public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public SwaggerResource swaggerVersion(String swaggerVersion) {
    this.swaggerVersion = swaggerVersion;
    return this;
  }

  /**
   * Get swaggerVersion
   * @return swaggerVersion
   **/
  @Schema(description = "")
  
    public String getSwaggerVersion() {
    return swaggerVersion;
  }

  public void setSwaggerVersion(String swaggerVersion) {
    this.swaggerVersion = swaggerVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerResource swaggerResource = (SwaggerResource) o;
    return Objects.equals(this.name, swaggerResource.name) &&
        Objects.equals(this.location, swaggerResource.location) &&
        Objects.equals(this.swaggerVersion, swaggerResource.swaggerVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location, swaggerVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerResource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    swaggerVersion: ").append(toIndentedString(swaggerVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
