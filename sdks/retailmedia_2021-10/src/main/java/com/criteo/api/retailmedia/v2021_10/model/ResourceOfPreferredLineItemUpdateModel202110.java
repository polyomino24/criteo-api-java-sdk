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
import com.criteo.api.retailmedia.v2021_10.model.ExternalPreferredLineItemUpdateModel202110;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data model for a Resource
 */
@ApiModel(description = "Data model for a Resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResourceOfPreferredLineItemUpdateModel202110 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private ExternalPreferredLineItemUpdateModel202110 attributes;


  public ResourceOfPreferredLineItemUpdateModel202110 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the entity")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ResourceOfPreferredLineItemUpdateModel202110 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Canonical type name of the entity
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Canonical type name of the entity")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ResourceOfPreferredLineItemUpdateModel202110 attributes(ExternalPreferredLineItemUpdateModel202110 attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPreferredLineItemUpdateModel202110 getAttributes() {
    return attributes;
  }


  public void setAttributes(ExternalPreferredLineItemUpdateModel202110 attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceOfPreferredLineItemUpdateModel202110 resourceOfPreferredLineItemUpdateModel202110 = (ResourceOfPreferredLineItemUpdateModel202110) o;
    return Objects.equals(this.id, resourceOfPreferredLineItemUpdateModel202110.id) &&
        Objects.equals(this.type, resourceOfPreferredLineItemUpdateModel202110.type) &&
        Objects.equals(this.attributes, resourceOfPreferredLineItemUpdateModel202110.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceOfPreferredLineItemUpdateModel202110 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

