package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UiConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-28T07:07:39.249850626Z[GMT]")


public class UiConfiguration   {
  @JsonProperty("validatorUrl")
  private String validatorUrl = null;

  @JsonProperty("docExpansion")
  private String docExpansion = null;

  @JsonProperty("apisSorter")
  private String apisSorter = null;

  @JsonProperty("defaultModelRendering")
  private String defaultModelRendering = null;

  @JsonProperty("requestTimeout")
  private Long requestTimeout = null;

  @JsonProperty("supportedSubmitMethods")
  @Valid
  private List<String> supportedSubmitMethods = null;

  @JsonProperty("jsonEditor")
  private Boolean jsonEditor = null;

  @JsonProperty("showRequestHeaders")
  private Boolean showRequestHeaders = null;

  public UiConfiguration validatorUrl(String validatorUrl) {
    this.validatorUrl = validatorUrl;
    return this;
  }

  /**
   * Get validatorUrl
   * @return validatorUrl
   **/
  @Schema(description = "")
  
    public String getValidatorUrl() {
    return validatorUrl;
  }

  public void setValidatorUrl(String validatorUrl) {
    this.validatorUrl = validatorUrl;
  }

  public UiConfiguration docExpansion(String docExpansion) {
    this.docExpansion = docExpansion;
    return this;
  }

  /**
   * Get docExpansion
   * @return docExpansion
   **/
  @Schema(description = "")
  
    public String getDocExpansion() {
    return docExpansion;
  }

  public void setDocExpansion(String docExpansion) {
    this.docExpansion = docExpansion;
  }

  public UiConfiguration apisSorter(String apisSorter) {
    this.apisSorter = apisSorter;
    return this;
  }

  /**
   * Get apisSorter
   * @return apisSorter
   **/
  @Schema(description = "")
  
    public String getApisSorter() {
    return apisSorter;
  }

  public void setApisSorter(String apisSorter) {
    this.apisSorter = apisSorter;
  }

  public UiConfiguration defaultModelRendering(String defaultModelRendering) {
    this.defaultModelRendering = defaultModelRendering;
    return this;
  }

  /**
   * Get defaultModelRendering
   * @return defaultModelRendering
   **/
  @Schema(description = "")
  
    public String getDefaultModelRendering() {
    return defaultModelRendering;
  }

  public void setDefaultModelRendering(String defaultModelRendering) {
    this.defaultModelRendering = defaultModelRendering;
  }

  public UiConfiguration requestTimeout(Long requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

  /**
   * Get requestTimeout
   * @return requestTimeout
   **/
  @Schema(description = "")
  
    public Long getRequestTimeout() {
    return requestTimeout;
  }

  public void setRequestTimeout(Long requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public UiConfiguration supportedSubmitMethods(List<String> supportedSubmitMethods) {
    this.supportedSubmitMethods = supportedSubmitMethods;
    return this;
  }

  public UiConfiguration addSupportedSubmitMethodsItem(String supportedSubmitMethodsItem) {
    if (this.supportedSubmitMethods == null) {
      this.supportedSubmitMethods = new ArrayList<String>();
    }
    this.supportedSubmitMethods.add(supportedSubmitMethodsItem);
    return this;
  }

  /**
   * Get supportedSubmitMethods
   * @return supportedSubmitMethods
   **/
  @Schema(description = "")
  
    public List<String> getSupportedSubmitMethods() {
    return supportedSubmitMethods;
  }

  public void setSupportedSubmitMethods(List<String> supportedSubmitMethods) {
    this.supportedSubmitMethods = supportedSubmitMethods;
  }

  public UiConfiguration jsonEditor(Boolean jsonEditor) {
    this.jsonEditor = jsonEditor;
    return this;
  }

  /**
   * Get jsonEditor
   * @return jsonEditor
   **/
  @Schema(description = "")
  
    public Boolean isJsonEditor() {
    return jsonEditor;
  }

  public void setJsonEditor(Boolean jsonEditor) {
    this.jsonEditor = jsonEditor;
  }

  public UiConfiguration showRequestHeaders(Boolean showRequestHeaders) {
    this.showRequestHeaders = showRequestHeaders;
    return this;
  }

  /**
   * Get showRequestHeaders
   * @return showRequestHeaders
   **/
  @Schema(description = "")
  
    public Boolean isShowRequestHeaders() {
    return showRequestHeaders;
  }

  public void setShowRequestHeaders(Boolean showRequestHeaders) {
    this.showRequestHeaders = showRequestHeaders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiConfiguration uiConfiguration = (UiConfiguration) o;
    return Objects.equals(this.validatorUrl, uiConfiguration.validatorUrl) &&
        Objects.equals(this.docExpansion, uiConfiguration.docExpansion) &&
        Objects.equals(this.apisSorter, uiConfiguration.apisSorter) &&
        Objects.equals(this.defaultModelRendering, uiConfiguration.defaultModelRendering) &&
        Objects.equals(this.requestTimeout, uiConfiguration.requestTimeout) &&
        Objects.equals(this.supportedSubmitMethods, uiConfiguration.supportedSubmitMethods) &&
        Objects.equals(this.jsonEditor, uiConfiguration.jsonEditor) &&
        Objects.equals(this.showRequestHeaders, uiConfiguration.showRequestHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatorUrl, docExpansion, apisSorter, defaultModelRendering, requestTimeout, supportedSubmitMethods, jsonEditor, showRequestHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiConfiguration {\n");
    
    sb.append("    validatorUrl: ").append(toIndentedString(validatorUrl)).append("\n");
    sb.append("    docExpansion: ").append(toIndentedString(docExpansion)).append("\n");
    sb.append("    apisSorter: ").append(toIndentedString(apisSorter)).append("\n");
    sb.append("    defaultModelRendering: ").append(toIndentedString(defaultModelRendering)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    supportedSubmitMethods: ").append(toIndentedString(supportedSubmitMethods)).append("\n");
    sb.append("    jsonEditor: ").append(toIndentedString(jsonEditor)).append("\n");
    sb.append("    showRequestHeaders: ").append(toIndentedString(showRequestHeaders)).append("\n");
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
