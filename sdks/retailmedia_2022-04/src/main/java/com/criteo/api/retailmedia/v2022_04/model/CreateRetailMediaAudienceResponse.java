/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2022_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2022_04.model.CommonError;
import com.criteo.api.retailmedia.v2022_04.model.CommonWarning;
import com.criteo.api.retailmedia.v2022_04.model.RetailMediaAudience;
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
 * Response of CreateAudienceRequest
 */
@ApiModel(description = "Response of CreateAudienceRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRetailMediaAudienceResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private RetailMediaAudience data;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CommonError> errors = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CommonWarning> warnings = null;


  public CreateRetailMediaAudienceResponse data(RetailMediaAudience data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RetailMediaAudience getData() {
    return data;
  }


  public void setData(RetailMediaAudience data) {
    this.data = data;
  }


  public CreateRetailMediaAudienceResponse errors(List<CommonError> errors) {
    
    this.errors = errors;
    return this;
  }

  public CreateRetailMediaAudienceResponse addErrorsItem(CommonError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommonError> getErrors() {
    return errors;
  }


  public void setErrors(List<CommonError> errors) {
    this.errors = errors;
  }


  public CreateRetailMediaAudienceResponse warnings(List<CommonWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public CreateRetailMediaAudienceResponse addWarningsItem(CommonWarning warningsItem) {
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

  public List<CommonWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<CommonWarning> warnings) {
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
    CreateRetailMediaAudienceResponse createRetailMediaAudienceResponse = (CreateRetailMediaAudienceResponse) o;
    return Objects.equals(this.data, createRetailMediaAudienceResponse.data) &&
        Objects.equals(this.errors, createRetailMediaAudienceResponse.errors) &&
        Objects.equals(this.warnings, createRetailMediaAudienceResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRetailMediaAudienceResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

