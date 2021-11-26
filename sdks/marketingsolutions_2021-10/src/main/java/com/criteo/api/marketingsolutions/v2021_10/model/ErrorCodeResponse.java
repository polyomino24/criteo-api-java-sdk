/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2021_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2021_10.model.AudienceError;
import com.criteo.api.marketingsolutions.v2021_10.model.AudienceWarning;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition of the error code
 */
@ApiModel(description = "Definition of the error code")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorCodeResponse {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AudienceError> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<AudienceWarning> warnings = null;


  public ErrorCodeResponse errors(List<AudienceError> errors) {
    
    this.errors = errors;
    return this;
  }

  public ErrorCodeResponse addErrorsItem(AudienceError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<AudienceError> getErrors() {
    return errors;
  }


  public void setErrors(List<AudienceError> errors) {
    this.errors = errors;
  }


  public ErrorCodeResponse warnings(List<AudienceWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public ErrorCodeResponse addWarningsItem(AudienceWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AudienceWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<AudienceWarning> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorCodeResponse errorCodeResponse = (ErrorCodeResponse) o;
    return Objects.equals(this.errors, errorCodeResponse.errors) &&
        Objects.equals(this.warnings, errorCodeResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorCodeResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

