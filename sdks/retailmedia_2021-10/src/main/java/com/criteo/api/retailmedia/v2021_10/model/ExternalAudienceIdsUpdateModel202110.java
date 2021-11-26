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
import java.util.ArrayList;
import java.util.List;

/**
 * Update model for updating audience target ids
 */
@ApiModel(description = "Update model for updating audience target ids")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAudienceIdsUpdateModel202110 {
  public static final String SERIALIZED_NAME_AUDIENCE_IDS = "audienceIds";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_IDS)
  private List<String> audienceIds = new ArrayList<>();


  public ExternalAudienceIdsUpdateModel202110 audienceIds(List<String> audienceIds) {
    
    this.audienceIds = audienceIds;
    return this;
  }

  public ExternalAudienceIdsUpdateModel202110 addAudienceIdsItem(String audienceIdsItem) {
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

   /**
   * Audience ids that should be targeted
   * @return audienceIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Audience ids that should be targeted")

  public List<String> getAudienceIds() {
    return audienceIds;
  }


  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAudienceIdsUpdateModel202110 externalAudienceIdsUpdateModel202110 = (ExternalAudienceIdsUpdateModel202110) o;
    return Objects.equals(this.audienceIds, externalAudienceIdsUpdateModel202110.audienceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAudienceIdsUpdateModel202110 {\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
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

