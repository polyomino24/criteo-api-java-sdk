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


package com.criteo.api.marketingsolutions.v2020_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2020_10.model.AdSetDeliveryLimitations;
import com.criteo.api.marketingsolutions.v2020_10.model.AdSetFrequencyCapping;
import com.criteo.api.marketingsolutions.v2020_10.model.AdSetGeoLocation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set targeting model
 */
@ApiModel(description = "ad set targeting model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdSetTargeting {
  public static final String SERIALIZED_NAME_DELIVERY_LIMITATIONS = "deliveryLimitations";
  @SerializedName(SERIALIZED_NAME_DELIVERY_LIMITATIONS)
  private AdSetDeliveryLimitations deliveryLimitations;

  public static final String SERIALIZED_NAME_GEO_LOCATION = "geoLocation";
  @SerializedName(SERIALIZED_NAME_GEO_LOCATION)
  private AdSetGeoLocation geoLocation;

  public static final String SERIALIZED_NAME_FREQUENCY_CAPPING = "frequencyCapping";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_CAPPING)
  private AdSetFrequencyCapping frequencyCapping;


  public AdSetTargeting deliveryLimitations(AdSetDeliveryLimitations deliveryLimitations) {
    
    this.deliveryLimitations = deliveryLimitations;
    return this;
  }

   /**
   * Get deliveryLimitations
   * @return deliveryLimitations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdSetDeliveryLimitations getDeliveryLimitations() {
    return deliveryLimitations;
  }


  public void setDeliveryLimitations(AdSetDeliveryLimitations deliveryLimitations) {
    this.deliveryLimitations = deliveryLimitations;
  }


  public AdSetTargeting geoLocation(AdSetGeoLocation geoLocation) {
    
    this.geoLocation = geoLocation;
    return this;
  }

   /**
   * Get geoLocation
   * @return geoLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdSetGeoLocation getGeoLocation() {
    return geoLocation;
  }


  public void setGeoLocation(AdSetGeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }


  public AdSetTargeting frequencyCapping(AdSetFrequencyCapping frequencyCapping) {
    
    this.frequencyCapping = frequencyCapping;
    return this;
  }

   /**
   * Get frequencyCapping
   * @return frequencyCapping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdSetFrequencyCapping getFrequencyCapping() {
    return frequencyCapping;
  }


  public void setFrequencyCapping(AdSetFrequencyCapping frequencyCapping) {
    this.frequencyCapping = frequencyCapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdSetTargeting adSetTargeting = (AdSetTargeting) o;
    return Objects.equals(this.deliveryLimitations, adSetTargeting.deliveryLimitations) &&
        Objects.equals(this.geoLocation, adSetTargeting.geoLocation) &&
        Objects.equals(this.frequencyCapping, adSetTargeting.frequencyCapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryLimitations, geoLocation, frequencyCapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdSetTargeting {\n");
    sb.append("    deliveryLimitations: ").append(toIndentedString(deliveryLimitations)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
    sb.append("    frequencyCapping: ").append(toIndentedString(frequencyCapping)).append("\n");
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

