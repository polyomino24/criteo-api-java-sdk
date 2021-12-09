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


package com.criteo.api.marketingsolutions.v2021_10.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * This is the message defining the query for Adset report
 */
@ApiModel(description = "This is the message defining the query for Adset report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatisticsReportQueryMessage {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private String advertiserIds;

  /**
   * Gets or Sets dimensions
   */
  @JsonAdapter(DimensionsEnum.Adapter.class)
  public enum DimensionsEnum {
    ADSETID("AdsetId"),
    
    ADSET("Adset"),
    
    ADVERTISERID("AdvertiserId"),
    
    ADVERTISER("Advertiser"),
    
    CATEGORYID("CategoryId"),
    
    CATEGORY("Category"),
    
    HOUR("Hour"),
    
    DAY("Day"),
    
    WEEK("Week"),
    
    MONTH("Month"),
    
    YEAR("Year"),
    
    OS("Os"),
    
    DEVICE("Device"),
    
    CAMPAIGNID("CampaignId"),
    
    CAMPAIGN("Campaign");

    private String value;

    DimensionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DimensionsEnum fromValue(String value) {
      for (DimensionsEnum b : DimensionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DimensionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DimensionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DimensionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DimensionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<DimensionsEnum> dimensions = new ArrayList<>();

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<String> metrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone = "UTC";

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;


  public StatisticsReportQueryMessage advertiserIds(String advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

   /**
   * The comma-separated list of advertiser ids. If empty, all the advertisers in the portfolio will be used
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comma-separated list of advertiser ids. If empty, all the advertisers in the portfolio will be used")

  public String getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(String advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public StatisticsReportQueryMessage dimensions(List<DimensionsEnum> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public StatisticsReportQueryMessage addDimensionsItem(DimensionsEnum dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * The dimensions for the report.
   * @return dimensions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The dimensions for the report.")

  public List<DimensionsEnum> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<DimensionsEnum> dimensions) {
    this.dimensions = dimensions;
  }


  public StatisticsReportQueryMessage metrics(List<String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public StatisticsReportQueryMessage addMetricsItem(String metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * The list of metrics to report.
   * @return metrics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of metrics to report.")

  public List<String> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }


  public StatisticsReportQueryMessage currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency used for the report. ISO 4217 code (three-letter capitals).
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The currency used for the report. ISO 4217 code (three-letter capitals).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public StatisticsReportQueryMessage format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * The file format of the generated report: csv, xml, excel or json.
   * @return format
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The file format of the generated report: csv, xml, excel or json.")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public StatisticsReportQueryMessage timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone used for the report. Timezone Database format (Tz).
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone used for the report. Timezone Database format (Tz).")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public StatisticsReportQueryMessage startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Start date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public StatisticsReportQueryMessage endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "End date of the report. Date component of ISO 8061 format, any time or timezone component is ignored.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsReportQueryMessage statisticsReportQueryMessage = (StatisticsReportQueryMessage) o;
    return Objects.equals(this.advertiserIds, statisticsReportQueryMessage.advertiserIds) &&
        Objects.equals(this.dimensions, statisticsReportQueryMessage.dimensions) &&
        Objects.equals(this.metrics, statisticsReportQueryMessage.metrics) &&
        Objects.equals(this.currency, statisticsReportQueryMessage.currency) &&
        Objects.equals(this.format, statisticsReportQueryMessage.format) &&
        Objects.equals(this.timezone, statisticsReportQueryMessage.timezone) &&
        Objects.equals(this.startDate, statisticsReportQueryMessage.startDate) &&
        Objects.equals(this.endDate, statisticsReportQueryMessage.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, dimensions, metrics, currency, format, timezone, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsReportQueryMessage {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

