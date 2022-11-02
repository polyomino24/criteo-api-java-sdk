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
 * The Product Button entity used for input
 */
@ApiModel(description = "The Product Button entity used for input")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalProductButtonRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BACKGROUND_IMAGE = "backgroundImage";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_IMAGE)
  private String backgroundImage;

  public static final String SERIALIZED_NAME_IS_MANDATORY = "isMandatory";
  @SerializedName(SERIALIZED_NAME_IS_MANDATORY)
  private Integer isMandatory;

  public static final String SERIALIZED_NAME_SKUS = "skus";
  @SerializedName(SERIALIZED_NAME_SKUS)
  private List<String> skus = new ArrayList<>();


  public ExternalProductButtonRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Product Button
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Product Button")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalProductButtonRequest backgroundImage(String backgroundImage) {
    
    this.backgroundImage = backgroundImage;
    return this;
  }

   /**
   * URL of the background image
   * @return backgroundImage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL of the background image")

  public String getBackgroundImage() {
    return backgroundImage;
  }


  public void setBackgroundImage(String backgroundImage) {
    this.backgroundImage = backgroundImage;
  }


  public ExternalProductButtonRequest isMandatory(Integer isMandatory) {
    
    this.isMandatory = isMandatory;
    return this;
  }

   /**
   * If the Product Button is Mandatory
   * @return isMandatory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If the Product Button is Mandatory")

  public Integer getIsMandatory() {
    return isMandatory;
  }


  public void setIsMandatory(Integer isMandatory) {
    this.isMandatory = isMandatory;
  }


  public ExternalProductButtonRequest skus(List<String> skus) {
    
    this.skus = skus;
    return this;
  }

  public ExternalProductButtonRequest addSkusItem(String skusItem) {
    this.skus.add(skusItem);
    return this;
  }

   /**
   * List of skus on the Product Button
   * @return skus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of skus on the Product Button")

  public List<String> getSkus() {
    return skus;
  }


  public void setSkus(List<String> skus) {
    this.skus = skus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalProductButtonRequest externalProductButtonRequest = (ExternalProductButtonRequest) o;
    return Objects.equals(this.name, externalProductButtonRequest.name) &&
        Objects.equals(this.backgroundImage, externalProductButtonRequest.backgroundImage) &&
        Objects.equals(this.isMandatory, externalProductButtonRequest.isMandatory) &&
        Objects.equals(this.skus, externalProductButtonRequest.skus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, backgroundImage, isMandatory, skus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalProductButtonRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
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
