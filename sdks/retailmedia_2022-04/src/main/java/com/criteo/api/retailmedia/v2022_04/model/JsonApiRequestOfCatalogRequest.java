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
import com.criteo.api.retailmedia.v2022_04.model.JsonApiBodyWithoutIdOfCatalogRequestAndCatalogRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A JSON:API wrapper class to format a &lt;typeparamref name&#x3D;\&quot;TAttributes\&quot; /&gt; with Type, and Attributes properties
 */
@ApiModel(description = "A JSON:API wrapper class to format a <typeparamref name=\"TAttributes\" /> with Type, and Attributes properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JsonApiRequestOfCatalogRequest {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private JsonApiBodyWithoutIdOfCatalogRequestAndCatalogRequest data;


  public JsonApiRequestOfCatalogRequest data(JsonApiBodyWithoutIdOfCatalogRequestAndCatalogRequest data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JsonApiBodyWithoutIdOfCatalogRequestAndCatalogRequest getData() {
    return data;
  }


  public void setData(JsonApiBodyWithoutIdOfCatalogRequestAndCatalogRequest data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiRequestOfCatalogRequest jsonApiRequestOfCatalogRequest = (JsonApiRequestOfCatalogRequest) o;
    return Objects.equals(this.data, jsonApiRequestOfCatalogRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiRequestOfCatalogRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

