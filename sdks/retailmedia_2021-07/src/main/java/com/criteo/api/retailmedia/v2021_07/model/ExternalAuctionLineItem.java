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
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * A Retail Media Auction Line Item used to hold bid settings for one or many promoted products on a single retailer
 */
@ApiModel(description = "A Retail Media Auction Line Item used to hold bid settings for one or many promoted products on a single retailer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalAuctionLineItem {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_MAX_BID = "maxBid";
  @SerializedName(SERIALIZED_NAME_MAX_BID)
  private BigDecimal maxBid;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BigDecimal budget;

  public static final String SERIALIZED_NAME_MONTHLY_PACING = "monthlyPacing";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PACING)
  private BigDecimal monthlyPacing;

  public static final String SERIALIZED_NAME_DAILY_PACING = "dailyPacing";
  @SerializedName(SERIALIZED_NAME_DAILY_PACING)
  private BigDecimal dailyPacing;

  /**
   * Gets or Sets bidStrategy
   */
  @JsonAdapter(BidStrategyEnum.Adapter.class)
  public enum BidStrategyEnum {
    UNKNOWN("unknown"),
    
    CONVERSION("conversion"),
    
    CLICKS("clicks"),
    
    REVENUE("revenue");

    private String value;

    BidStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BidStrategyEnum fromValue(String value) {
      for (BidStrategyEnum b : BidStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BidStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BidStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BidStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BidStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BID_STRATEGY = "bidStrategy";
  @SerializedName(SERIALIZED_NAME_BID_STRATEGY)
  private BidStrategyEnum bidStrategy = BidStrategyEnum.CONVERSION;

  public static final String SERIALIZED_NAME_TARGET_RETAILER_ID = "targetRetailerId";
  @SerializedName(SERIALIZED_NAME_TARGET_RETAILER_ID)
  private String targetRetailerId;

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

  public static final String SERIALIZED_NAME_TARGET_BID = "targetBid";
  @SerializedName(SERIALIZED_NAME_TARGET_BID)
  private BigDecimal targetBid;

  public static final String SERIALIZED_NAME_IS_AUTO_DAILY_PACING = "isAutoDailyPacing";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_DAILY_PACING)
  private Boolean isAutoDailyPacing = false;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_BUDGET_SPENT = "budgetSpent";
  @SerializedName(SERIALIZED_NAME_BUDGET_SPENT)
  private Double budgetSpent;

  public static final String SERIALIZED_NAME_BUDGET_REMAINING = "budgetRemaining";
  @SerializedName(SERIALIZED_NAME_BUDGET_REMAINING)
  private BigDecimal budgetRemaining;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public ExternalAuctionLineItem name(String name) {
    
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


  public ExternalAuctionLineItem startDate(LocalDate startDate) {
    
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


  public ExternalAuctionLineItem endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Represents the Date as a year, month, and day in the format YYYY-MM-DD
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the Date as a year, month, and day in the format YYYY-MM-DD")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ExternalAuctionLineItem maxBid(BigDecimal maxBid) {
    
    this.maxBid = maxBid;
    return this;
  }

   /**
   * Get maxBid
   * @return maxBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxBid() {
    return maxBid;
  }


  public void setMaxBid(BigDecimal maxBid) {
    this.maxBid = maxBid;
  }


  public ExternalAuctionLineItem budget(BigDecimal budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBudget() {
    return budget;
  }


  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }


  public ExternalAuctionLineItem monthlyPacing(BigDecimal monthlyPacing) {
    
    this.monthlyPacing = monthlyPacing;
    return this;
  }

   /**
   * Get monthlyPacing
   * @return monthlyPacing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMonthlyPacing() {
    return monthlyPacing;
  }


  public void setMonthlyPacing(BigDecimal monthlyPacing) {
    this.monthlyPacing = monthlyPacing;
  }


  public ExternalAuctionLineItem dailyPacing(BigDecimal dailyPacing) {
    
    this.dailyPacing = dailyPacing;
    return this;
  }

   /**
   * Get dailyPacing
   * @return dailyPacing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDailyPacing() {
    return dailyPacing;
  }


  public void setDailyPacing(BigDecimal dailyPacing) {
    this.dailyPacing = dailyPacing;
  }


  public ExternalAuctionLineItem bidStrategy(BidStrategyEnum bidStrategy) {
    
    this.bidStrategy = bidStrategy;
    return this;
  }

   /**
   * Get bidStrategy
   * @return bidStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BidStrategyEnum getBidStrategy() {
    return bidStrategy;
  }


  public void setBidStrategy(BidStrategyEnum bidStrategy) {
    this.bidStrategy = bidStrategy;
  }


  public ExternalAuctionLineItem targetRetailerId(String targetRetailerId) {
    
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


  public ExternalAuctionLineItem status(StatusEnum status) {
    
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


  public ExternalAuctionLineItem targetBid(BigDecimal targetBid) {
    
    this.targetBid = targetBid;
    return this;
  }

   /**
   * Get targetBid
   * @return targetBid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTargetBid() {
    return targetBid;
  }


  public void setTargetBid(BigDecimal targetBid) {
    this.targetBid = targetBid;
  }


  public ExternalAuctionLineItem isAutoDailyPacing(Boolean isAutoDailyPacing) {
    
    this.isAutoDailyPacing = isAutoDailyPacing;
    return this;
  }

   /**
   * Get isAutoDailyPacing
   * @return isAutoDailyPacing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAutoDailyPacing() {
    return isAutoDailyPacing;
  }


  public void setIsAutoDailyPacing(Boolean isAutoDailyPacing) {
    this.isAutoDailyPacing = isAutoDailyPacing;
  }


  public ExternalAuctionLineItem campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public ExternalAuctionLineItem budgetSpent(Double budgetSpent) {
    
    this.budgetSpent = budgetSpent;
    return this;
  }

   /**
   * Get budgetSpent
   * @return budgetSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBudgetSpent() {
    return budgetSpent;
  }


  public void setBudgetSpent(Double budgetSpent) {
    this.budgetSpent = budgetSpent;
  }


  public ExternalAuctionLineItem budgetRemaining(BigDecimal budgetRemaining) {
    
    this.budgetRemaining = budgetRemaining;
    return this;
  }

   /**
   * Get budgetRemaining
   * @return budgetRemaining
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getBudgetRemaining() {
    return budgetRemaining;
  }


  public void setBudgetRemaining(BigDecimal budgetRemaining) {
    this.budgetRemaining = budgetRemaining;
  }


  public ExternalAuctionLineItem createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ExternalAuctionLineItem updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAuctionLineItem externalAuctionLineItem = (ExternalAuctionLineItem) o;
    return Objects.equals(this.name, externalAuctionLineItem.name) &&
        Objects.equals(this.startDate, externalAuctionLineItem.startDate) &&
        Objects.equals(this.endDate, externalAuctionLineItem.endDate) &&
        Objects.equals(this.maxBid, externalAuctionLineItem.maxBid) &&
        Objects.equals(this.budget, externalAuctionLineItem.budget) &&
        Objects.equals(this.monthlyPacing, externalAuctionLineItem.monthlyPacing) &&
        Objects.equals(this.dailyPacing, externalAuctionLineItem.dailyPacing) &&
        Objects.equals(this.bidStrategy, externalAuctionLineItem.bidStrategy) &&
        Objects.equals(this.targetRetailerId, externalAuctionLineItem.targetRetailerId) &&
        Objects.equals(this.status, externalAuctionLineItem.status) &&
        Objects.equals(this.targetBid, externalAuctionLineItem.targetBid) &&
        Objects.equals(this.isAutoDailyPacing, externalAuctionLineItem.isAutoDailyPacing) &&
        Objects.equals(this.campaignId, externalAuctionLineItem.campaignId) &&
        Objects.equals(this.budgetSpent, externalAuctionLineItem.budgetSpent) &&
        Objects.equals(this.budgetRemaining, externalAuctionLineItem.budgetRemaining) &&
        Objects.equals(this.createdAt, externalAuctionLineItem.createdAt) &&
        Objects.equals(this.updatedAt, externalAuctionLineItem.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startDate, endDate, maxBid, budget, monthlyPacing, dailyPacing, bidStrategy, targetRetailerId, status, targetBid, isAutoDailyPacing, campaignId, budgetSpent, budgetRemaining, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAuctionLineItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    maxBid: ").append(toIndentedString(maxBid)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    monthlyPacing: ").append(toIndentedString(monthlyPacing)).append("\n");
    sb.append("    dailyPacing: ").append(toIndentedString(dailyPacing)).append("\n");
    sb.append("    bidStrategy: ").append(toIndentedString(bidStrategy)).append("\n");
    sb.append("    targetRetailerId: ").append(toIndentedString(targetRetailerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetBid: ").append(toIndentedString(targetBid)).append("\n");
    sb.append("    isAutoDailyPacing: ").append(toIndentedString(isAutoDailyPacing)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    budgetSpent: ").append(toIndentedString(budgetSpent)).append("\n");
    sb.append("    budgetRemaining: ").append(toIndentedString(budgetRemaining)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

