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
import com.criteo.api.marketingsolutions.preview.model.AdSetTargeting;
import com.criteo.api.marketingsolutions.preview.model.PatchAdSetBidding;
import com.criteo.api.marketingsolutions.preview.model.PatchAdSetBudget;
import com.criteo.api.marketingsolutions.preview.model.PatchAdSetScheduling;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set patch model
 */
@ApiModel(description = "ad set patch model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchAdSet {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEDULING = "scheduling";
  @SerializedName(SERIALIZED_NAME_SCHEDULING)
  private PatchAdSetScheduling scheduling;

  public static final String SERIALIZED_NAME_BIDDING = "bidding";
  @SerializedName(SERIALIZED_NAME_BIDDING)
  private PatchAdSetBidding bidding;

  public static final String SERIALIZED_NAME_TARGETING = "targeting";
  @SerializedName(SERIALIZED_NAME_TARGETING)
  private AdSetTargeting targeting;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private PatchAdSetBudget budget;


  public PatchAdSet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the ad set
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the ad set")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PatchAdSet scheduling(PatchAdSetScheduling scheduling) {
    
    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PatchAdSetScheduling getScheduling() {
    return scheduling;
  }


  public void setScheduling(PatchAdSetScheduling scheduling) {
    this.scheduling = scheduling;
  }


  public PatchAdSet bidding(PatchAdSetBidding bidding) {
    
    this.bidding = bidding;
    return this;
  }

   /**
   * Get bidding
   * @return bidding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PatchAdSetBidding getBidding() {
    return bidding;
  }


  public void setBidding(PatchAdSetBidding bidding) {
    this.bidding = bidding;
  }


  public PatchAdSet targeting(AdSetTargeting targeting) {
    
    this.targeting = targeting;
    return this;
  }

   /**
   * Get targeting
   * @return targeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdSetTargeting getTargeting() {
    return targeting;
  }


  public void setTargeting(AdSetTargeting targeting) {
    this.targeting = targeting;
  }


  public PatchAdSet budget(PatchAdSetBudget budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PatchAdSetBudget getBudget() {
    return budget;
  }


  public void setBudget(PatchAdSetBudget budget) {
    this.budget = budget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchAdSet patchAdSet = (PatchAdSet) o;
    return Objects.equals(this.name, patchAdSet.name) &&
        Objects.equals(this.scheduling, patchAdSet.scheduling) &&
        Objects.equals(this.bidding, patchAdSet.bidding) &&
        Objects.equals(this.targeting, patchAdSet.targeting) &&
        Objects.equals(this.budget, patchAdSet.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scheduling, bidding, targeting, budget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchAdSet {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    bidding: ").append(toIndentedString(bidding)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
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

