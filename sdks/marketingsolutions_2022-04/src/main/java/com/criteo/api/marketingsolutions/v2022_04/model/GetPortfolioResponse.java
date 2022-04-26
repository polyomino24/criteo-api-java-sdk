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


package com.criteo.api.marketingsolutions.v2022_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2022_04.model.CriteoApiError;
import com.criteo.api.marketingsolutions.v2022_04.model.CriteoApiWarning;
import com.criteo.api.marketingsolutions.v2022_04.model.EntityOfPortfolioMessage;
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
 * Portfolio fetch Response
 */
@ApiModel(description = "Portfolio fetch Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetPortfolioResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<EntityOfPortfolioMessage> data = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CriteoApiError> errors = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CriteoApiWarning> warnings = null;


  public GetPortfolioResponse data(List<EntityOfPortfolioMessage> data) {
    
    this.data = data;
    return this;
  }

  public GetPortfolioResponse addDataItem(EntityOfPortfolioMessage dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The response�s primary data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The response�s primary data")

  public List<EntityOfPortfolioMessage> getData() {
    return data;
  }


  public void setData(List<EntityOfPortfolioMessage> data) {
    this.data = data;
  }


  public GetPortfolioResponse errors(List<CriteoApiError> errors) {
    
    this.errors = errors;
    return this;
  }

  public GetPortfolioResponse addErrorsItem(CriteoApiError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error list returned by the Criteo API  For successful requests it is empty
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error list returned by the Criteo API  For successful requests it is empty")

  public List<CriteoApiError> getErrors() {
    return errors;
  }


  public void setErrors(List<CriteoApiError> errors) {
    this.errors = errors;
  }


  public GetPortfolioResponse warnings(List<CriteoApiWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public GetPortfolioResponse addWarningsItem(CriteoApiWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Warnings list returned by the Criteo API  In some situations the operations are successful but it may be useful to issue warnings to the API consumer.  For example the endpoint, entity or field is deprecated. Warnings are like compiler warnings, they indicate that problems may occur in the future.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Warnings list returned by the Criteo API  In some situations the operations are successful but it may be useful to issue warnings to the API consumer.  For example the endpoint, entity or field is deprecated. Warnings are like compiler warnings, they indicate that problems may occur in the future.")

  public List<CriteoApiWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<CriteoApiWarning> warnings) {
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
    GetPortfolioResponse getPortfolioResponse = (GetPortfolioResponse) o;
    return Objects.equals(this.data, getPortfolioResponse.data) &&
        Objects.equals(this.errors, getPortfolioResponse.errors) &&
        Objects.equals(this.warnings, getPortfolioResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPortfolioResponse {\n");
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

