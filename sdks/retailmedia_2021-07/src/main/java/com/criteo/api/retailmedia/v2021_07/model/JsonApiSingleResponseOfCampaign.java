/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2021-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2021_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2021_07.model.CommonError;
import com.criteo.api.retailmedia.v2021_07.model.CommonWarning;
import com.criteo.api.retailmedia.v2021_07.model.JsonApiBodyWithIdOfInt64AndCampaignAndCampaign;
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
 * A JSON:API wrapper class to add one JSON:API &lt;typeparamref name&#x3D;\&quot;T\&quot; /&gt; within a data property
 */
@ApiModel(description = "A JSON:API wrapper class to add one JSON:API <typeparamref name=\"T\" /> within a data property")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JsonApiSingleResponseOfCampaign {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private JsonApiBodyWithIdOfInt64AndCampaignAndCampaign data;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CommonError> errors = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CommonWarning> warnings = null;


  public JsonApiSingleResponseOfCampaign data(JsonApiBodyWithIdOfInt64AndCampaignAndCampaign data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonApiBodyWithIdOfInt64AndCampaignAndCampaign getData() {
    return data;
  }


  public void setData(JsonApiBodyWithIdOfInt64AndCampaignAndCampaign data) {
    this.data = data;
  }


  public JsonApiSingleResponseOfCampaign errors(List<CommonError> errors) {
    
    this.errors = errors;
    return this;
  }

  public JsonApiSingleResponseOfCampaign addErrorsItem(CommonError errorsItem) {
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


  public JsonApiSingleResponseOfCampaign warnings(List<CommonWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public JsonApiSingleResponseOfCampaign addWarningsItem(CommonWarning warningsItem) {
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
    JsonApiSingleResponseOfCampaign jsonApiSingleResponseOfCampaign = (JsonApiSingleResponseOfCampaign) o;
    return Objects.equals(this.data, jsonApiSingleResponseOfCampaign.data) &&
        Objects.equals(this.errors, jsonApiSingleResponseOfCampaign.errors) &&
        Objects.equals(this.warnings, jsonApiSingleResponseOfCampaign.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiSingleResponseOfCampaign {\n");
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

