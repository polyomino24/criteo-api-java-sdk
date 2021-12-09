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
import com.criteo.api.retailmedia.v2021_10.model.ExternalLineItemCapping202110;
import com.criteo.api.retailmedia.v2021_10.model.ExternalLineItemPage202110;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Model used to create a preferred line item
 */
@ApiModel(description = "Model used to create a preferred line item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalPreferredLineItemCreateModel202110 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    ACTIVE("active"),
    
    SCHEDULED("scheduled"),
    
    DRAFT("draft"),
    
    PAUSED("paused"),
    
    BUDGETHIT("budgetHit"),
    
    ENDED("ended"),
    
    ARCHIVED("archived"),
    
    NOFUNDS("noFunds");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * Gets or Sets pacing
   */
  @JsonAdapter(PacingEnum.Adapter.class)
  public enum PacingEnum {
    UNKNOWN("unknown"),
    
    STANDARD("standard"),
    
    ACCELERATED("accelerated");

    private String value;

    PacingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PacingEnum fromValue(String value) {
      for (PacingEnum b : PacingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PacingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PacingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PacingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PacingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PACING = "pacing";
  @SerializedName(SERIALIZED_NAME_PACING)
  private PacingEnum pacing;

  public static final String SERIALIZED_NAME_CAPPING = "capping";
  @SerializedName(SERIALIZED_NAME_CAPPING)
  private ExternalLineItemCapping202110 capping;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private ExternalLineItemPage202110 page;

  public static final String SERIALIZED_NAME_TARGET_RETAILER_ID = "targetRetailerId";
  @SerializedName(SERIALIZED_NAME_TARGET_RETAILER_ID)
  private String targetRetailerId;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creativeId";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId;


  public ExternalPreferredLineItemCreateModel202110 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalPreferredLineItemCreateModel202110 startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the Date as a year, month, and day in the format YYYY-MM-DD")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public ExternalPreferredLineItemCreateModel202110 endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the Date as a year, month, and day in the format YYYY-MM-DD")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ExternalPreferredLineItemCreateModel202110 status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExternalPreferredLineItemCreateModel202110 pacing(PacingEnum pacing) {
    
    this.pacing = pacing;
    return this;
  }

   /**
   * Get pacing
   * @return pacing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PacingEnum getPacing() {
    return pacing;
  }


  public void setPacing(PacingEnum pacing) {
    this.pacing = pacing;
  }


  public ExternalPreferredLineItemCreateModel202110 capping(ExternalLineItemCapping202110 capping) {
    
    this.capping = capping;
    return this;
  }

   /**
   * Get capping
   * @return capping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalLineItemCapping202110 getCapping() {
    return capping;
  }


  public void setCapping(ExternalLineItemCapping202110 capping) {
    this.capping = capping;
  }


  public ExternalPreferredLineItemCreateModel202110 page(ExternalLineItemPage202110 page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ExternalLineItemPage202110 getPage() {
    return page;
  }


  public void setPage(ExternalLineItemPage202110 page) {
    this.page = page;
  }


  public ExternalPreferredLineItemCreateModel202110 targetRetailerId(String targetRetailerId) {
    
    this.targetRetailerId = targetRetailerId;
    return this;
  }

   /**
   * Get targetRetailerId
   * @return targetRetailerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTargetRetailerId() {
    return targetRetailerId;
  }


  public void setTargetRetailerId(String targetRetailerId) {
    this.targetRetailerId = targetRetailerId;
  }


  public ExternalPreferredLineItemCreateModel202110 budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public ExternalPreferredLineItemCreateModel202110 creativeId(String creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * Get creativeId
   * @return creativeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPreferredLineItemCreateModel202110 externalPreferredLineItemCreateModel202110 = (ExternalPreferredLineItemCreateModel202110) o;
    return Objects.equals(this.name, externalPreferredLineItemCreateModel202110.name) &&
        Objects.equals(this.startDate, externalPreferredLineItemCreateModel202110.startDate) &&
        Objects.equals(this.endDate, externalPreferredLineItemCreateModel202110.endDate) &&
        Objects.equals(this.status, externalPreferredLineItemCreateModel202110.status) &&
        Objects.equals(this.pacing, externalPreferredLineItemCreateModel202110.pacing) &&
        Objects.equals(this.capping, externalPreferredLineItemCreateModel202110.capping) &&
        Objects.equals(this.page, externalPreferredLineItemCreateModel202110.page) &&
        Objects.equals(this.targetRetailerId, externalPreferredLineItemCreateModel202110.targetRetailerId) &&
        Objects.equals(this.budget, externalPreferredLineItemCreateModel202110.budget) &&
        Objects.equals(this.creativeId, externalPreferredLineItemCreateModel202110.creativeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startDate, endDate, status, pacing, capping, page, targetRetailerId, budget, creativeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPreferredLineItemCreateModel202110 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pacing: ").append(toIndentedString(pacing)).append("\n");
    sb.append("    capping: ").append(toIndentedString(capping)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    targetRetailerId: ").append(toIndentedString(targetRetailerId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
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

