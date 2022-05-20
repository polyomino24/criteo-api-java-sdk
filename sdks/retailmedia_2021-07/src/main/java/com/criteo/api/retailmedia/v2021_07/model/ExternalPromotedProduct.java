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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * identifies a promoted product
 */
@ApiModel(description = "identifies a promoted product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalPromotedProduct {
  public static final String SERIALIZED_NAME_BID_OVERRIDE = "bidOverride";
  @SerializedName(SERIALIZED_NAME_BID_OVERRIDE)
  private BigDecimal bidOverride;


  public ExternalPromotedProduct bidOverride(BigDecimal bidOverride) {
    
    this.bidOverride = bidOverride;
    return this;
  }

   /**
   * Get bidOverride
   * @return bidOverride
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getBidOverride() {
    return bidOverride;
  }


  public void setBidOverride(BigDecimal bidOverride) {
    this.bidOverride = bidOverride;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPromotedProduct externalPromotedProduct = (ExternalPromotedProduct) o;
    return Objects.equals(this.bidOverride, externalPromotedProduct.bidOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPromotedProduct {\n");
    sb.append("    bidOverride: ").append(toIndentedString(bidOverride)).append("\n");
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
