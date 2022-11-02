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


package com.criteo.api.marketingsolutions.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.preview.model.AlgebraNodeV1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Audience of people of interest for a marketer.
 */
@ApiModel(description = "Audience of people of interest for a marketer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceEstimateSizeEntityV1 {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_ALGEBRA = "algebra";
  @SerializedName(SERIALIZED_NAME_ALGEBRA)
  private AlgebraNodeV1 algebra;


  public AudienceEstimateSizeEntityV1 advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser associated to the audience
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Advertiser associated to the audience")

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AudienceEstimateSizeEntityV1 algebra(AlgebraNodeV1 algebra) {
    
    this.algebra = algebra;
    return this;
  }

   /**
   * Get algebra
   * @return algebra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlgebraNodeV1 getAlgebra() {
    return algebra;
  }


  public void setAlgebra(AlgebraNodeV1 algebra) {
    this.algebra = algebra;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceEstimateSizeEntityV1 audienceEstimateSizeEntityV1 = (AudienceEstimateSizeEntityV1) o;
    return Objects.equals(this.advertiserId, audienceEstimateSizeEntityV1.advertiserId) &&
        Objects.equals(this.algebra, audienceEstimateSizeEntityV1.algebra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, algebra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceEstimateSizeEntityV1 {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    algebra: ").append(toIndentedString(algebra)).append("\n");
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
