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
import com.criteo.api.marketingsolutions.preview.model.CreateAdSetAudienceConfiguration;
import com.criteo.api.marketingsolutions.preview.model.CreateAdSetBidding;
import com.criteo.api.marketingsolutions.preview.model.CreateAdSetBudget;
import com.criteo.api.marketingsolutions.preview.model.CreateAdSetSchedule;
import com.criteo.api.marketingsolutions.preview.model.CreateAdSetTargeting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ad set create model
 */
@ApiModel(description = "ad set create model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAdSet {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private CreateAdSetSchedule schedule;

  public static final String SERIALIZED_NAME_BIDDING = "bidding";
  @SerializedName(SERIALIZED_NAME_BIDDING)
  private CreateAdSetBidding bidding;

  public static final String SERIALIZED_NAME_TARGETING = "targeting";
  @SerializedName(SERIALIZED_NAME_TARGETING)
  private CreateAdSetTargeting targeting;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private CreateAdSetBudget budget;

  public static final String SERIALIZED_NAME_AUDIENCE_CONFIGURATION = "audienceConfiguration";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_CONFIGURATION)
  private CreateAdSetAudienceConfiguration audienceConfiguration;

  public static final String SERIALIZED_NAME_TRACKING_CODE = "trackingCode";
  @SerializedName(SERIALIZED_NAME_TRACKING_CODE)
  private String trackingCode;


  public CreateAdSet name(String name) {
    
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


  public CreateAdSet datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * Dataset id of this ad set
   * @return datasetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dataset id of this ad set")

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public CreateAdSet campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Campaign id this ad set belongs to
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Campaign id this ad set belongs to")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public CreateAdSet schedule(CreateAdSetSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAdSetSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(CreateAdSetSchedule schedule) {
    this.schedule = schedule;
  }


  public CreateAdSet bidding(CreateAdSetBidding bidding) {
    
    this.bidding = bidding;
    return this;
  }

   /**
   * Get bidding
   * @return bidding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAdSetBidding getBidding() {
    return bidding;
  }


  public void setBidding(CreateAdSetBidding bidding) {
    this.bidding = bidding;
  }


  public CreateAdSet targeting(CreateAdSetTargeting targeting) {
    
    this.targeting = targeting;
    return this;
  }

   /**
   * Get targeting
   * @return targeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAdSetTargeting getTargeting() {
    return targeting;
  }


  public void setTargeting(CreateAdSetTargeting targeting) {
    this.targeting = targeting;
  }


  public CreateAdSet budget(CreateAdSetBudget budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAdSetBudget getBudget() {
    return budget;
  }


  public void setBudget(CreateAdSetBudget budget) {
    this.budget = budget;
  }


  public CreateAdSet audienceConfiguration(CreateAdSetAudienceConfiguration audienceConfiguration) {
    
    this.audienceConfiguration = audienceConfiguration;
    return this;
  }

   /**
   * Get audienceConfiguration
   * @return audienceConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAdSetAudienceConfiguration getAudienceConfiguration() {
    return audienceConfiguration;
  }


  public void setAudienceConfiguration(CreateAdSetAudienceConfiguration audienceConfiguration) {
    this.audienceConfiguration = audienceConfiguration;
  }


  public CreateAdSet trackingCode(String trackingCode) {
    
    this.trackingCode = trackingCode;
    return this;
  }

   /**
   * The click tracking code associated to this Ad Set.
   * @return trackingCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The click tracking code associated to this Ad Set.")

  public String getTrackingCode() {
    return trackingCode;
  }


  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAdSet createAdSet = (CreateAdSet) o;
    return Objects.equals(this.name, createAdSet.name) &&
        Objects.equals(this.datasetId, createAdSet.datasetId) &&
        Objects.equals(this.campaignId, createAdSet.campaignId) &&
        Objects.equals(this.schedule, createAdSet.schedule) &&
        Objects.equals(this.bidding, createAdSet.bidding) &&
        Objects.equals(this.targeting, createAdSet.targeting) &&
        Objects.equals(this.budget, createAdSet.budget) &&
        Objects.equals(this.audienceConfiguration, createAdSet.audienceConfiguration) &&
        Objects.equals(this.trackingCode, createAdSet.trackingCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, datasetId, campaignId, schedule, bidding, targeting, budget, audienceConfiguration, trackingCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAdSet {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    bidding: ").append(toIndentedString(bidding)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    audienceConfiguration: ").append(toIndentedString(audienceConfiguration)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
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

