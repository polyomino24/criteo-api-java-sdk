/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

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

import com.criteo.api.marketingsolutions.preview.JSON;

/**
 * This is the message defining the query for Adset report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatisticsReportQueryMessage {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiserIds";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private String advertiserIds;

  public static final String SERIALIZED_NAME_AD_SET_IDS = "adSetIds";
  @SerializedName(SERIALIZED_NAME_AD_SET_IDS)
  private List<String> adSetIds = null;

  public static final String SERIALIZED_NAME_AD_SET_NAMES = "adSetNames";
  @SerializedName(SERIALIZED_NAME_AD_SET_NAMES)
  private List<String> adSetNames = null;

  public static final String SERIALIZED_NAME_AD_SET_STATUS = "adSetStatus";
  @SerializedName(SERIALIZED_NAME_AD_SET_STATUS)
  private List<String> adSetStatus = null;

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
    
    CAMPAIGN("Campaign"),
    
    ADID("AdId"),
    
    AD("Ad"),
    
    COUPONID("CouponId"),
    
    COUPON("Coupon"),
    
    MARKETINGOBJECTIVEID("MarketingObjectiveId"),
    
    MARKETINGOBJECTIVE("MarketingObjective"),
    
    CHANNELID("ChannelId"),
    
    CHANNEL("Channel"),
    
    GOAL("Goal");

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

  public StatisticsReportQueryMessage() {
  }

  public StatisticsReportQueryMessage advertiserIds(String advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

   /**
   * The comma-separated list of advertiser ids. If empty, all the advertisers in the portfolio will be used
   * @return advertiserIds
  **/
  @javax.annotation.Nullable

  public String getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(String advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public StatisticsReportQueryMessage adSetIds(List<String> adSetIds) {
    
    this.adSetIds = adSetIds;
    return this;
  }

  public StatisticsReportQueryMessage addAdSetIdsItem(String adSetIdsItem) {
    if (this.adSetIds == null) {
      this.adSetIds = null;
    }
    this.adSetIds.add(adSetIdsItem);
    return this;
  }

   /**
   * list of adSets ids. If empty, all the adSets will be fetched
   * @return adSetIds
  **/
  @javax.annotation.Nullable

  public List<String> getAdSetIds() {
    return adSetIds;
  }


  public void setAdSetIds(List<String> adSetIds) {
    this.adSetIds = adSetIds;
  }


  public StatisticsReportQueryMessage adSetNames(List<String> adSetNames) {
    
    this.adSetNames = adSetNames;
    return this;
  }

  public StatisticsReportQueryMessage addAdSetNamesItem(String adSetNamesItem) {
    if (this.adSetNames == null) {
      this.adSetNames = null;
    }
    this.adSetNames.add(adSetNamesItem);
    return this;
  }

   /**
   * list of adSets names. If empty, all the adSets will be fetched
   * @return adSetNames
  **/
  @javax.annotation.Nullable

  public List<String> getAdSetNames() {
    return adSetNames;
  }


  public void setAdSetNames(List<String> adSetNames) {
    this.adSetNames = adSetNames;
  }


  public StatisticsReportQueryMessage adSetStatus(List<String> adSetStatus) {
    
    this.adSetStatus = adSetStatus;
    return this;
  }

  public StatisticsReportQueryMessage addAdSetStatusItem(String adSetStatusItem) {
    if (this.adSetStatus == null) {
      this.adSetStatus = null;
    }
    this.adSetStatus.add(adSetStatusItem);
    return this;
  }

   /**
   * list of adSets status. If empty, all the adSets will be fetched
   * @return adSetStatus
  **/
  @javax.annotation.Nullable

  public List<String> getAdSetStatus() {
    return adSetStatus;
  }


  public void setAdSetStatus(List<String> adSetStatus) {
    this.adSetStatus = adSetStatus;
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

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
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
   * @return the StatisticsReportQueryMessage instance itself
   */
  public StatisticsReportQueryMessage putAdditionalProperty(String key, Object value) {
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
    StatisticsReportQueryMessage statisticsReportQueryMessage = (StatisticsReportQueryMessage) o;
    return Objects.equals(this.advertiserIds, statisticsReportQueryMessage.advertiserIds) &&
        Objects.equals(this.adSetIds, statisticsReportQueryMessage.adSetIds) &&
        Objects.equals(this.adSetNames, statisticsReportQueryMessage.adSetNames) &&
        Objects.equals(this.adSetStatus, statisticsReportQueryMessage.adSetStatus) &&
        Objects.equals(this.dimensions, statisticsReportQueryMessage.dimensions) &&
        Objects.equals(this.metrics, statisticsReportQueryMessage.metrics) &&
        Objects.equals(this.currency, statisticsReportQueryMessage.currency) &&
        Objects.equals(this.format, statisticsReportQueryMessage.format) &&
        Objects.equals(this.timezone, statisticsReportQueryMessage.timezone) &&
        Objects.equals(this.startDate, statisticsReportQueryMessage.startDate) &&
        Objects.equals(this.endDate, statisticsReportQueryMessage.endDate)&&
        Objects.equals(this.additionalProperties, statisticsReportQueryMessage.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, adSetIds, adSetNames, adSetStatus, dimensions, metrics, currency, format, timezone, startDate, endDate, additionalProperties);
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
    sb.append("class StatisticsReportQueryMessage {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    adSetIds: ").append(toIndentedString(adSetIds)).append("\n");
    sb.append("    adSetNames: ").append(toIndentedString(adSetNames)).append("\n");
    sb.append("    adSetStatus: ").append(toIndentedString(adSetStatus)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("advertiserIds");
    openapiFields.add("adSetIds");
    openapiFields.add("adSetNames");
    openapiFields.add("adSetStatus");
    openapiFields.add("dimensions");
    openapiFields.add("metrics");
    openapiFields.add("currency");
    openapiFields.add("format");
    openapiFields.add("timezone");
    openapiFields.add("startDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dimensions");
    openapiRequiredFields.add("metrics");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatisticsReportQueryMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatisticsReportQueryMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatisticsReportQueryMessage is not found in the empty JSON string", StatisticsReportQueryMessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatisticsReportQueryMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("advertiserIds") != null && !jsonObj.get("advertiserIds").isJsonNull()) && !jsonObj.get("advertiserIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adSetIds") != null && !jsonObj.get("adSetIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetIds` to be an array in the JSON string but got `%s`", jsonObj.get("adSetIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adSetNames") != null && !jsonObj.get("adSetNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetNames` to be an array in the JSON string but got `%s`", jsonObj.get("adSetNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("adSetStatus") != null && !jsonObj.get("adSetStatus").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `adSetStatus` to be an array in the JSON string but got `%s`", jsonObj.get("adSetStatus").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("dimensions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("dimensions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("metrics") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("metrics").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatisticsReportQueryMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatisticsReportQueryMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatisticsReportQueryMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatisticsReportQueryMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<StatisticsReportQueryMessage>() {
           @Override
           public void write(JsonWriter out, StatisticsReportQueryMessage value) throws IOException {
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
           public StatisticsReportQueryMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StatisticsReportQueryMessage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StatisticsReportQueryMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatisticsReportQueryMessage
  * @throws IOException if the JSON string is invalid with respect to StatisticsReportQueryMessage
  */
  public static StatisticsReportQueryMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatisticsReportQueryMessage.class);
  }

 /**
  * Convert an instance of StatisticsReportQueryMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

