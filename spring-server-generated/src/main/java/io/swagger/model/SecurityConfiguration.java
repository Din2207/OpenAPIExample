package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-28T07:07:39.249850626Z[GMT]")


public class SecurityConfiguration   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("realm")
  private String realm = null;

  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("apiKey")
  private String apiKey = null;

  @JsonProperty("apiKeyVehicle")
  private String apiKeyVehicle = null;

  @JsonProperty("scopeSeparator")
  private String scopeSeparator = null;

  @JsonProperty("apiKeyName")
  private String apiKeyName = null;

  public SecurityConfiguration clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   **/
  @Schema(description = "")
  
    public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SecurityConfiguration clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Get clientSecret
   * @return clientSecret
   **/
  @Schema(description = "")
  
    public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public SecurityConfiguration realm(String realm) {
    this.realm = realm;
    return this;
  }

  /**
   * Get realm
   * @return realm
   **/
  @Schema(description = "")
  
    public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public SecurityConfiguration appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   **/
  @Schema(description = "")
  
    public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public SecurityConfiguration apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Get apiKey
   * @return apiKey
   **/
  @Schema(description = "")
  
    public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public SecurityConfiguration apiKeyVehicle(String apiKeyVehicle) {
    this.apiKeyVehicle = apiKeyVehicle;
    return this;
  }

  /**
   * Get apiKeyVehicle
   * @return apiKeyVehicle
   **/
  @Schema(description = "")
  
    public String getApiKeyVehicle() {
    return apiKeyVehicle;
  }

  public void setApiKeyVehicle(String apiKeyVehicle) {
    this.apiKeyVehicle = apiKeyVehicle;
  }

  public SecurityConfiguration scopeSeparator(String scopeSeparator) {
    this.scopeSeparator = scopeSeparator;
    return this;
  }

  /**
   * Get scopeSeparator
   * @return scopeSeparator
   **/
  @Schema(description = "")
  
    public String getScopeSeparator() {
    return scopeSeparator;
  }

  public void setScopeSeparator(String scopeSeparator) {
    this.scopeSeparator = scopeSeparator;
  }

  public SecurityConfiguration apiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
    return this;
  }

  /**
   * Get apiKeyName
   * @return apiKeyName
   **/
  @Schema(description = "")
  
    public String getApiKeyName() {
    return apiKeyName;
  }

  public void setApiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityConfiguration securityConfiguration = (SecurityConfiguration) o;
    return Objects.equals(this.clientId, securityConfiguration.clientId) &&
        Objects.equals(this.clientSecret, securityConfiguration.clientSecret) &&
        Objects.equals(this.realm, securityConfiguration.realm) &&
        Objects.equals(this.appName, securityConfiguration.appName) &&
        Objects.equals(this.apiKey, securityConfiguration.apiKey) &&
        Objects.equals(this.apiKeyVehicle, securityConfiguration.apiKeyVehicle) &&
        Objects.equals(this.scopeSeparator, securityConfiguration.scopeSeparator) &&
        Objects.equals(this.apiKeyName, securityConfiguration.apiKeyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, realm, appName, apiKey, apiKeyVehicle, scopeSeparator, apiKeyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityConfiguration {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiKeyVehicle: ").append(toIndentedString(apiKeyVehicle)).append("\n");
    sb.append("    scopeSeparator: ").append(toIndentedString(scopeSeparator)).append("\n");
    sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
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
