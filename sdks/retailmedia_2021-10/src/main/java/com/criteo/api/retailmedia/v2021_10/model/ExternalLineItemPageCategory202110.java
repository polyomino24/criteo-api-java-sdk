/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2021-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2021_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Category information for a preferred line item page
 */
@ApiModel(description = "Category information for a preferred line item page")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalLineItemPageCategory202110 {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_INCLUDE_CHILDREN = "includeChildren";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHILDREN)
  private Boolean includeChildren = true;


  public ExternalLineItemPageCategory202110 categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public ExternalLineItemPageCategory202110 includeChildren(Boolean includeChildren) {
    
    this.includeChildren = includeChildren;
    return this;
  }

   /**
   * Get includeChildren
   * @return includeChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeChildren() {
    return includeChildren;
  }


  public void setIncludeChildren(Boolean includeChildren) {
    this.includeChildren = includeChildren;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalLineItemPageCategory202110 externalLineItemPageCategory202110 = (ExternalLineItemPageCategory202110) o;
    return Objects.equals(this.categoryId, externalLineItemPageCategory202110.categoryId) &&
        Objects.equals(this.includeChildren, externalLineItemPageCategory202110.includeChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, includeChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalLineItemPageCategory202110 {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    includeChildren: ").append(toIndentedString(includeChildren)).append("\n");
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

