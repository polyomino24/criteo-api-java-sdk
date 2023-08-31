/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.criteo.api.retailmedia.preview.JSON;

/**
 * Async Revenue report body request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AsyncRevenueReport {
  /**
   * Gets or Sets reportType
   */
  @JsonAdapter(ReportTypeEnum.Adapter.class)
  public enum ReportTypeEnum {
    ADVERTISER("advertiser"),
    
    ENVIRONMENT("environment"),
    
    PAGETYPE("pageType"),
    
    PAGECATEGORY("pageCategory"),
    
    BRAND("brand");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportTypeEnum fromValue(String value) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReportTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPORT_TYPE = "reportType";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private ReportTypeEnum reportType;

  /**
   * Gets or Sets revenueType
   */
  @JsonAdapter(RevenueTypeEnum.Adapter.class)
  public enum RevenueTypeEnum {
    AUCTION("auction"),
    
    PREFERRED("preferred");

    private String value;

    RevenueTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RevenueTypeEnum fromValue(String value) {
      for (RevenueTypeEnum b : RevenueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RevenueTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RevenueTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RevenueTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RevenueTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REVENUE_TYPE = "revenueType";
  @SerializedName(SERIALIZED_NAME_REVENUE_TYPE)
  private RevenueTypeEnum revenueType;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<String> ids = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets metrics
   */
  @JsonAdapter(MetricsEnum.Adapter.class)
  public enum MetricsEnum {
    CLICKS("clicks"),
    
    SPEND("spend"),
    
    ATTRIBUTEDORDERS("attributedOrders"),
    
    ATTRIBUTEDSALES("attributedSales"),
    
    ATTRIBUTEDUNITS("attributedUnits"),
    
    CPC("cpc"),
    
    CPO("cpo"),
    
    ROAS("roas"),
    
    OPENAUCTIONREVENUE("openAuctionRevenue"),
    
    PREFERREDDEALSREVENUE("preferredDealsRevenue"),
    
    AVGCPC("avgCpc"),
    
    AVGCPM("avgCpm");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MetricsEnum fromValue(String value) {
      for (MetricsEnum b : MetricsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MetricsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetricsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MetricsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MetricsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<MetricsEnum> metrics = null;

  /**
   * Gets or Sets dimensions
   */
  @JsonAdapter(DimensionsEnum.Adapter.class)
  public enum DimensionsEnum {
    DATE("date"),
    
    ACCOUNTID("accountId"),
    
    ACCOUNTNAME("accountName"),
    
    ENVIRONMENT("environment"),
    
    ADVPRODUCTCATEGORY("advProductCategory"),
    
    BRANDID("brandId"),
    
    BRANDNAME("brandName"),
    
    PAGETYPENAME("pageTypeName");

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
  private List<DimensionsEnum> dimensions = null;

  /**
   * Gets or Sets format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    JSON("json"),
    
    JSON_COMPACT("json-compact"),
    
    JSON_NEWLINE("json-newline"),
    
    CSV("csv");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  /**
   * Gets or Sets campaignType
   */
  @JsonAdapter(CampaignTypeEnum.Adapter.class)
  public enum CampaignTypeEnum {
    SPONSOREDPRODUCTS("sponsoredProducts"),
    
    ONSITEDISPLAYS("onSiteDisplays");

    private String value;

    CampaignTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignTypeEnum fromValue(String value) {
      for (CampaignTypeEnum b : CampaignTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CampaignTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaignType";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private CampaignTypeEnum campaignType;

  /**
   * Gets or Sets salesChannel
   */
  @JsonAdapter(SalesChannelEnum.Adapter.class)
  public enum SalesChannelEnum {
    OFFLINE("offline"),
    
    ONLINE("online");

    private String value;

    SalesChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SalesChannelEnum fromValue(String value) {
      for (SalesChannelEnum b : SalesChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SalesChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SalesChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SalesChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SalesChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SALES_CHANNEL = "salesChannel";
  @SerializedName(SERIALIZED_NAME_SALES_CHANNEL)
  private SalesChannelEnum salesChannel;

  /**
   * Filter on the type of seller
   */
  @JsonAdapter(SoldByEnum.Adapter.class)
  public enum SoldByEnum {
    DIRECTSOLD("directSold"),
    
    INDIRECTSOLD("indirectSold"),
    
    PRIVATEMARKET("privateMarket");

    private String value;

    SoldByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SoldByEnum fromValue(String value) {
      for (SoldByEnum b : SoldByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SoldByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SoldByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SoldByEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SoldByEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOLD_BY = "soldBy";
  @SerializedName(SERIALIZED_NAME_SOLD_BY)
  private SoldByEnum soldBy;

  /**
   * Filter on the campaign sub type
   */
  @JsonAdapter(CampaignSubTypeEnum.Adapter.class)
  public enum CampaignSubTypeEnum {
    AUCTIONANDPREFERRED("auctionAndPreferred"),
    
    LOCKOUT("lockout");

    private String value;

    CampaignSubTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignSubTypeEnum fromValue(String value) {
      for (CampaignSubTypeEnum b : CampaignSubTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CampaignSubTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignSubTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignSubTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignSubTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_SUB_TYPE = "campaignSubType";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_SUB_TYPE)
  private CampaignSubTypeEnum campaignSubType;

  public AsyncRevenueReport() {
  }

  public AsyncRevenueReport reportType(ReportTypeEnum reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable

  public ReportTypeEnum getReportType() {
    return reportType;
  }


  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }


  public AsyncRevenueReport revenueType(RevenueTypeEnum revenueType) {
    
    this.revenueType = revenueType;
    return this;
  }

   /**
   * Get revenueType
   * @return revenueType
  **/
  @javax.annotation.Nullable

  public RevenueTypeEnum getRevenueType() {
    return revenueType;
  }


  public void setRevenueType(RevenueTypeEnum revenueType) {
    this.revenueType = revenueType;
  }


  public AsyncRevenueReport ids(List<String> ids) {
    
    this.ids = ids;
    return this;
  }

  public AsyncRevenueReport addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = null;
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable

  public List<String> getIds() {
    return ids;
  }


  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public AsyncRevenueReport id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AsyncRevenueReport metrics(List<MetricsEnum> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public AsyncRevenueReport addMetricsItem(MetricsEnum metricsItem) {
    if (this.metrics == null) {
      this.metrics = null;
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable

  public List<MetricsEnum> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }


  public AsyncRevenueReport dimensions(List<DimensionsEnum> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public AsyncRevenueReport addDimensionsItem(DimensionsEnum dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = null;
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable

  public List<DimensionsEnum> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<DimensionsEnum> dimensions) {
    this.dimensions = dimensions;
  }


  public AsyncRevenueReport format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public AsyncRevenueReport startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public AsyncRevenueReport endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public AsyncRevenueReport timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public AsyncRevenueReport campaignType(CampaignTypeEnum campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable

  public CampaignTypeEnum getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(CampaignTypeEnum campaignType) {
    this.campaignType = campaignType;
  }


  public AsyncRevenueReport salesChannel(SalesChannelEnum salesChannel) {
    
    this.salesChannel = salesChannel;
    return this;
  }

   /**
   * Get salesChannel
   * @return salesChannel
  **/
  @javax.annotation.Nullable

  public SalesChannelEnum getSalesChannel() {
    return salesChannel;
  }


  public void setSalesChannel(SalesChannelEnum salesChannel) {
    this.salesChannel = salesChannel;
  }


  public AsyncRevenueReport soldBy(SoldByEnum soldBy) {
    
    this.soldBy = soldBy;
    return this;
  }

   /**
   * Filter on the type of seller
   * @return soldBy
  **/
  @javax.annotation.Nullable

  public SoldByEnum getSoldBy() {
    return soldBy;
  }


  public void setSoldBy(SoldByEnum soldBy) {
    this.soldBy = soldBy;
  }


  public AsyncRevenueReport campaignSubType(CampaignSubTypeEnum campaignSubType) {
    
    this.campaignSubType = campaignSubType;
    return this;
  }

   /**
   * Filter on the campaign sub type
   * @return campaignSubType
  **/
  @javax.annotation.Nullable

  public CampaignSubTypeEnum getCampaignSubType() {
    return campaignSubType;
  }


  public void setCampaignSubType(CampaignSubTypeEnum campaignSubType) {
    this.campaignSubType = campaignSubType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AsyncRevenueReport instance itself
   */
  public AsyncRevenueReport putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncRevenueReport asyncRevenueReport = (AsyncRevenueReport) o;
    return Objects.equals(this.reportType, asyncRevenueReport.reportType) &&
        Objects.equals(this.revenueType, asyncRevenueReport.revenueType) &&
        Objects.equals(this.ids, asyncRevenueReport.ids) &&
        Objects.equals(this.id, asyncRevenueReport.id) &&
        Objects.equals(this.metrics, asyncRevenueReport.metrics) &&
        Objects.equals(this.dimensions, asyncRevenueReport.dimensions) &&
        Objects.equals(this.format, asyncRevenueReport.format) &&
        Objects.equals(this.startDate, asyncRevenueReport.startDate) &&
        Objects.equals(this.endDate, asyncRevenueReport.endDate) &&
        Objects.equals(this.timezone, asyncRevenueReport.timezone) &&
        Objects.equals(this.campaignType, asyncRevenueReport.campaignType) &&
        Objects.equals(this.salesChannel, asyncRevenueReport.salesChannel) &&
        Objects.equals(this.soldBy, asyncRevenueReport.soldBy) &&
        Objects.equals(this.campaignSubType, asyncRevenueReport.campaignSubType)&&
        Objects.equals(this.additionalProperties, asyncRevenueReport.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, revenueType, ids, id, metrics, dimensions, format, startDate, endDate, timezone, campaignType, salesChannel, soldBy, campaignSubType, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncRevenueReport {\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    revenueType: ").append(toIndentedString(revenueType)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    salesChannel: ").append(toIndentedString(salesChannel)).append("\n");
    sb.append("    soldBy: ").append(toIndentedString(soldBy)).append("\n");
    sb.append("    campaignSubType: ").append(toIndentedString(campaignSubType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("reportType");
    openapiFields.add("revenueType");
    openapiFields.add("ids");
    openapiFields.add("id");
    openapiFields.add("metrics");
    openapiFields.add("dimensions");
    openapiFields.add("format");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("timezone");
    openapiFields.add("campaignType");
    openapiFields.add("salesChannel");
    openapiFields.add("soldBy");
    openapiFields.add("campaignSubType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AsyncRevenueReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AsyncRevenueReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AsyncRevenueReport is not found in the empty JSON string", AsyncRevenueReport.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AsyncRevenueReport.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("reportType") != null && !jsonObj.get("reportType").isJsonNull()) && !jsonObj.get("reportType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportType").toString()));
      }
      if ((jsonObj.get("revenueType") != null && !jsonObj.get("revenueType").isJsonNull()) && !jsonObj.get("revenueType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revenueType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revenueType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("metrics") != null && !jsonObj.get("metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dimensions") != null && !jsonObj.get("dimensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("campaignType") != null && !jsonObj.get("campaignType").isJsonNull()) && !jsonObj.get("campaignType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignType").toString()));
      }
      if ((jsonObj.get("salesChannel") != null && !jsonObj.get("salesChannel").isJsonNull()) && !jsonObj.get("salesChannel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salesChannel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salesChannel").toString()));
      }
      if ((jsonObj.get("soldBy") != null && !jsonObj.get("soldBy").isJsonNull()) && !jsonObj.get("soldBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `soldBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("soldBy").toString()));
      }
      if ((jsonObj.get("campaignSubType") != null && !jsonObj.get("campaignSubType").isJsonNull()) && !jsonObj.get("campaignSubType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignSubType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignSubType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncRevenueReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncRevenueReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncRevenueReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncRevenueReport.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncRevenueReport>() {
           @Override
           public void write(JsonWriter out, AsyncRevenueReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncRevenueReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AsyncRevenueReport instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncRevenueReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncRevenueReport
  * @throws IOException if the JSON string is invalid with respect to AsyncRevenueReport
  */
  public static AsyncRevenueReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncRevenueReport.class);
  }

 /**
  * Convert an instance of AsyncRevenueReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

