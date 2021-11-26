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


package com.criteo.api.marketingsolutions.v2021_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2021_10.model.PatchCampaignSpendLimit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * campaign patch model
 */
@ApiModel(description = "campaign patch model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchCampaign {
  public static final String SERIALIZED_NAME_SPEND_LIMIT = "spendLimit";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT)
  private PatchCampaignSpendLimit spendLimit;


  public PatchCampaign spendLimit(PatchCampaignSpendLimit spendLimit) {
    
    this.spendLimit = spendLimit;
    return this;
  }

   /**
   * Get spendLimit
   * @return spendLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PatchCampaignSpendLimit getSpendLimit() {
    return spendLimit;
  }


  public void setSpendLimit(PatchCampaignSpendLimit spendLimit) {
    this.spendLimit = spendLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchCampaign patchCampaign = (PatchCampaign) o;
    return Objects.equals(this.spendLimit, patchCampaign.spendLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spendLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchCampaign {\n");
    sb.append("    spendLimit: ").append(toIndentedString(spendLimit)).append("\n");
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

