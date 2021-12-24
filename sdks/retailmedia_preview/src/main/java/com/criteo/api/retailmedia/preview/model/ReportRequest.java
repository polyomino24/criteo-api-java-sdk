/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.preview.model.ReportRequestAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Report Request
 */
@ApiModel(description = "Report Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportRequest {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private ReportRequestAttributes attributes;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ReportRequest attributes(ReportRequestAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportRequestAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(ReportRequestAttributes attributes) {
    this.attributes = attributes;
  }


  public ReportRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Always \&quot;RetailMediaReportRequest\&quot;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Always \"RetailMediaReportRequest\"")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRequest reportRequest = (ReportRequest) o;
    return Objects.equals(this.attributes, reportRequest.attributes) &&
        Objects.equals(this.type, reportRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRequest {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
