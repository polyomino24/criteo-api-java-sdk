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


package com.criteo.api.marketingsolutions.v2021_07.model;

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
import java.time.OffsetDateTime;

/**
 * AudienceAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceAttributes {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_NB_LINES = "nbLines";
  @SerializedName(SERIALIZED_NAME_NB_LINES)
  private Integer nbLines;

  public static final String SERIALIZED_NAME_NB_LINES_EMAIL = "nbLinesEmail";
  @SerializedName(SERIALIZED_NAME_NB_LINES_EMAIL)
  private Integer nbLinesEmail;

  public static final String SERIALIZED_NAME_NB_MATCHES_EMAIL = "nbMatchesEmail";
  @SerializedName(SERIALIZED_NAME_NB_MATCHES_EMAIL)
  private Integer nbMatchesEmail;


  public AudienceAttributes advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * The advertiser id that owns this Audience
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The advertiser id that owns this Audience")

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AudienceAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Audience
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the Audience")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudienceAttributes description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The string description of the Audience
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The string description of the Audience")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AudienceAttributes created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Date and time ISO 8601 formatted string
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date and time ISO 8601 formatted string")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public AudienceAttributes updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Date and time ISO 8601 formatted string
   * @return updated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date and time ISO 8601 formatted string")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public AudienceAttributes nbLines(Integer nbLines) {
    
    this.nbLines = nbLines;
    return this;
  }

   /**
   * The number of line in the audience available once processed
   * @return nbLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of line in the audience available once processed")

  public Integer getNbLines() {
    return nbLines;
  }


  public void setNbLines(Integer nbLines) {
    this.nbLines = nbLines;
  }


  public AudienceAttributes nbLinesEmail(Integer nbLinesEmail) {
    
    this.nbLinesEmail = nbLinesEmail;
    return this;
  }

   /**
   * The number of email line in the audience available once processed
   * @return nbLinesEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of email line in the audience available once processed")

  public Integer getNbLinesEmail() {
    return nbLinesEmail;
  }


  public void setNbLinesEmail(Integer nbLinesEmail) {
    this.nbLinesEmail = nbLinesEmail;
  }


  public AudienceAttributes nbMatchesEmail(Integer nbMatchesEmail) {
    
    this.nbMatchesEmail = nbMatchesEmail;
    return this;
  }

   /**
   * The number of email matches in the audience available once processed
   * @return nbMatchesEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of email matches in the audience available once processed")

  public Integer getNbMatchesEmail() {
    return nbMatchesEmail;
  }


  public void setNbMatchesEmail(Integer nbMatchesEmail) {
    this.nbMatchesEmail = nbMatchesEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceAttributes audienceAttributes = (AudienceAttributes) o;
    return Objects.equals(this.advertiserId, audienceAttributes.advertiserId) &&
        Objects.equals(this.name, audienceAttributes.name) &&
        Objects.equals(this.description, audienceAttributes.description) &&
        Objects.equals(this.created, audienceAttributes.created) &&
        Objects.equals(this.updated, audienceAttributes.updated) &&
        Objects.equals(this.nbLines, audienceAttributes.nbLines) &&
        Objects.equals(this.nbLinesEmail, audienceAttributes.nbLinesEmail) &&
        Objects.equals(this.nbMatchesEmail, audienceAttributes.nbMatchesEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, name, description, created, updated, nbLines, nbLinesEmail, nbMatchesEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceAttributes {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    nbLines: ").append(toIndentedString(nbLines)).append("\n");
    sb.append("    nbLinesEmail: ").append(toIndentedString(nbLinesEmail)).append("\n");
    sb.append("    nbMatchesEmail: ").append(toIndentedString(nbMatchesEmail)).append("\n");
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

