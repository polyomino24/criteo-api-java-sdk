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
import com.criteo.api.retailmedia.v2021_07.model.PageMetadata;
import com.criteo.api.retailmedia.v2021_07.model.ProblemDetails;
import com.criteo.api.retailmedia.v2021_07.model.ResourceOfPreferredLineItem;
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
 * Data model for a paged list of response resources
 */
@ApiModel(description = "Data model for a paged list of response resources")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreferredLineItemPagedListResponse {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private PageMetadata metadata;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ResourceOfPreferredLineItem> data = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<ProblemDetails> warnings = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ProblemDetails> errors = null;


  public PreferredLineItemPagedListResponse metadata(PageMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(PageMetadata metadata) {
    this.metadata = metadata;
  }


  public PreferredLineItemPagedListResponse data(List<ResourceOfPreferredLineItem> data) {
    
    this.data = data;
    return this;
  }

  public PreferredLineItemPagedListResponse addDataItem(ResourceOfPreferredLineItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ResourceOfPreferredLineItem> getData() {
    return data;
  }


  public void setData(List<ResourceOfPreferredLineItem> data) {
    this.data = data;
  }


   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProblemDetails> getWarnings() {
    return warnings;
  }




   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProblemDetails> getErrors() {
    return errors;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreferredLineItemPagedListResponse preferredLineItemPagedListResponse = (PreferredLineItemPagedListResponse) o;
    return Objects.equals(this.metadata, preferredLineItemPagedListResponse.metadata) &&
        Objects.equals(this.data, preferredLineItemPagedListResponse.data) &&
        Objects.equals(this.warnings, preferredLineItemPagedListResponse.warnings) &&
        Objects.equals(this.errors, preferredLineItemPagedListResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, data, warnings, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferredLineItemPagedListResponse {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

