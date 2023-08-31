/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2022-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2022_07.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2022_07.model.AdSetTargeting;
import com.criteo.api.marketingsolutions.v2022_07.model.ReadAdSetBidding;
import com.criteo.api.marketingsolutions.v2022_07.model.ReadAdSetBudget;
import com.criteo.api.marketingsolutions.v2022_07.model.ReadAdSetSchedule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.criteo.api.marketingsolutions.v2022_07.JSON;

/**
 * ad set read model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadAdSet {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  /**
   * The environment that an ad click will lead a user to
   */
  @JsonAdapter(DestinationEnvironmentEnum.Adapter.class)
  public enum DestinationEnvironmentEnum {
    UNDEFINED("undefined"),
    
    WEB("web"),
    
    APP("app");

    private String value;

    DestinationEnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationEnvironmentEnum fromValue(String value) {
      for (DestinationEnvironmentEnum b : DestinationEnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DestinationEnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationEnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationEnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationEnvironmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_ENVIRONMENT = "destinationEnvironment";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ENVIRONMENT)
  private DestinationEnvironmentEnum destinationEnvironment;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private ReadAdSetSchedule schedule;

  public static final String SERIALIZED_NAME_BIDDING = "bidding";
  @SerializedName(SERIALIZED_NAME_BIDDING)
  private ReadAdSetBidding bidding;

  public static final String SERIALIZED_NAME_TARGETING = "targeting";
  @SerializedName(SERIALIZED_NAME_TARGETING)
  private AdSetTargeting targeting;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private ReadAdSetBudget budget;

  /**
   * Media type for the ad set
   */
  @JsonAdapter(MediaTypeEnum.Adapter.class)
  public enum MediaTypeEnum {
    DISPLAY("display"),
    
    VIDEO("video");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MediaTypeEnum fromValue(String value) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MediaTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MediaTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MediaTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MediaTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private MediaTypeEnum mediaType;

  public ReadAdSet() {
  }

  public ReadAdSet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the ad set
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReadAdSet advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser id of the campaign this ad set belongs to
   * @return advertiserId
  **/
  @javax.annotation.Nullable

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ReadAdSet datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * Dataset id of this ad set
   * @return datasetId
  **/
  @javax.annotation.Nullable

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public ReadAdSet campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Campaign id this ad set belongs to
   * @return campaignId
  **/
  @javax.annotation.Nullable

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public ReadAdSet destinationEnvironment(DestinationEnvironmentEnum destinationEnvironment) {
    
    this.destinationEnvironment = destinationEnvironment;
    return this;
  }

   /**
   * The environment that an ad click will lead a user to
   * @return destinationEnvironment
  **/
  @javax.annotation.Nullable

  public DestinationEnvironmentEnum getDestinationEnvironment() {
    return destinationEnvironment;
  }


  public void setDestinationEnvironment(DestinationEnvironmentEnum destinationEnvironment) {
    this.destinationEnvironment = destinationEnvironment;
  }


  public ReadAdSet schedule(ReadAdSetSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable

  public ReadAdSetSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(ReadAdSetSchedule schedule) {
    this.schedule = schedule;
  }


  public ReadAdSet bidding(ReadAdSetBidding bidding) {
    
    this.bidding = bidding;
    return this;
  }

   /**
   * Get bidding
   * @return bidding
  **/
  @javax.annotation.Nullable

  public ReadAdSetBidding getBidding() {
    return bidding;
  }


  public void setBidding(ReadAdSetBidding bidding) {
    this.bidding = bidding;
  }


  public ReadAdSet targeting(AdSetTargeting targeting) {
    
    this.targeting = targeting;
    return this;
  }

   /**
   * Get targeting
   * @return targeting
  **/
  @javax.annotation.Nullable

  public AdSetTargeting getTargeting() {
    return targeting;
  }


  public void setTargeting(AdSetTargeting targeting) {
    this.targeting = targeting;
  }


  public ReadAdSet budget(ReadAdSetBudget budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable

  public ReadAdSetBudget getBudget() {
    return budget;
  }


  public void setBudget(ReadAdSetBudget budget) {
    this.budget = budget;
  }


  public ReadAdSet mediaType(MediaTypeEnum mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Media type for the ad set
   * @return mediaType
  **/
  @javax.annotation.Nullable

  public MediaTypeEnum getMediaType() {
    return mediaType;
  }


  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
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
   * @return the ReadAdSet instance itself
   */
  public ReadAdSet putAdditionalProperty(String key, Object value) {
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
    ReadAdSet readAdSet = (ReadAdSet) o;
    return Objects.equals(this.name, readAdSet.name) &&
        Objects.equals(this.advertiserId, readAdSet.advertiserId) &&
        Objects.equals(this.datasetId, readAdSet.datasetId) &&
        Objects.equals(this.campaignId, readAdSet.campaignId) &&
        Objects.equals(this.destinationEnvironment, readAdSet.destinationEnvironment) &&
        Objects.equals(this.schedule, readAdSet.schedule) &&
        Objects.equals(this.bidding, readAdSet.bidding) &&
        Objects.equals(this.targeting, readAdSet.targeting) &&
        Objects.equals(this.budget, readAdSet.budget) &&
        Objects.equals(this.mediaType, readAdSet.mediaType)&&
        Objects.equals(this.additionalProperties, readAdSet.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, advertiserId, datasetId, campaignId, destinationEnvironment, schedule, bidding, targeting, budget, mediaType, additionalProperties);
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
    sb.append("class ReadAdSet {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    destinationEnvironment: ").append(toIndentedString(destinationEnvironment)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    bidding: ").append(toIndentedString(bidding)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("advertiserId");
    openapiFields.add("datasetId");
    openapiFields.add("campaignId");
    openapiFields.add("destinationEnvironment");
    openapiFields.add("schedule");
    openapiFields.add("bidding");
    openapiFields.add("targeting");
    openapiFields.add("budget");
    openapiFields.add("mediaType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadAdSet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReadAdSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadAdSet is not found in the empty JSON string", ReadAdSet.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("advertiserId") != null && !jsonObj.get("advertiserId").isJsonNull()) && !jsonObj.get("advertiserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserId").toString()));
      }
      if ((jsonObj.get("datasetId") != null && !jsonObj.get("datasetId").isJsonNull()) && !jsonObj.get("datasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetId").toString()));
      }
      if ((jsonObj.get("campaignId") != null && !jsonObj.get("campaignId").isJsonNull()) && !jsonObj.get("campaignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignId").toString()));
      }
      if ((jsonObj.get("destinationEnvironment") != null && !jsonObj.get("destinationEnvironment").isJsonNull()) && !jsonObj.get("destinationEnvironment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationEnvironment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationEnvironment").toString()));
      }
      // validate the optional field `schedule`
      if (jsonObj.get("schedule") != null && !jsonObj.get("schedule").isJsonNull()) {
        ReadAdSetSchedule.validateJsonObject(jsonObj.getAsJsonObject("schedule"));
      }
      // validate the optional field `bidding`
      if (jsonObj.get("bidding") != null && !jsonObj.get("bidding").isJsonNull()) {
        ReadAdSetBidding.validateJsonObject(jsonObj.getAsJsonObject("bidding"));
      }
      // validate the optional field `targeting`
      if (jsonObj.get("targeting") != null && !jsonObj.get("targeting").isJsonNull()) {
        AdSetTargeting.validateJsonObject(jsonObj.getAsJsonObject("targeting"));
      }
      // validate the optional field `budget`
      if (jsonObj.get("budget") != null && !jsonObj.get("budget").isJsonNull()) {
        ReadAdSetBudget.validateJsonObject(jsonObj.getAsJsonObject("budget"));
      }
      if ((jsonObj.get("mediaType") != null && !jsonObj.get("mediaType").isJsonNull()) && !jsonObj.get("mediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadAdSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadAdSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadAdSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadAdSet.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadAdSet>() {
           @Override
           public void write(JsonWriter out, ReadAdSet value) throws IOException {
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
           public ReadAdSet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReadAdSet instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReadAdSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadAdSet
  * @throws IOException if the JSON string is invalid with respect to ReadAdSet
  */
  public static ReadAdSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadAdSet.class);
  }

 /**
  * Convert an instance of ReadAdSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

