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


package com.criteo.api.retailmedia.v2021_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2021_10.model.CommonError;
import com.criteo.api.retailmedia.v2021_10.model.CommonWarning;
import com.criteo.api.retailmedia.v2021_10.model.PageMetadata;
import com.criteo.api.retailmedia.v2021_10.model.RetailMediaAudience;
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
 * Response for page of audiences by given account
 */
@ApiModel(description = "Response for page of audiences by given account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetPageOfAudiencesByAccountIdResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<RetailMediaAudience> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CommonError> errors = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CommonWarning> warnings = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private PageMetadata metadata;


   /**
   * data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "data")

  public List<RetailMediaAudience> getData() {
    return data;
  }




   /**
   * errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "errors")

  public List<CommonError> getErrors() {
    return errors;
  }




   /**
   * warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "warnings")

  public List<CommonWarning> getWarnings() {
    return warnings;
  }




  public GetPageOfAudiencesByAccountIdResponse metadata(PageMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PageMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(PageMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPageOfAudiencesByAccountIdResponse getPageOfAudiencesByAccountIdResponse = (GetPageOfAudiencesByAccountIdResponse) o;
    return Objects.equals(this.data, getPageOfAudiencesByAccountIdResponse.data) &&
        Objects.equals(this.errors, getPageOfAudiencesByAccountIdResponse.errors) &&
        Objects.equals(this.warnings, getPageOfAudiencesByAccountIdResponse.warnings) &&
        Objects.equals(this.metadata, getPageOfAudiencesByAccountIdResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, warnings, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPageOfAudiencesByAccountIdResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

