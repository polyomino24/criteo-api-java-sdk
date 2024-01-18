/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2023-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2023_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2023_10.model.CreateAdSetBidding;
import com.criteo.api.marketingsolutions.v2023_10.model.CreateAdSetBudget;
import com.criteo.api.marketingsolutions.v2023_10.model.CreateAdSetSchedule;
import com.criteo.api.marketingsolutions.v2023_10.model.CreateAdSetTargeting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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

import com.criteo.api.marketingsolutions.v2023_10.JSON;

/**
 * ad set create model
 */
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

  /**
   * Objective of the ad set
   */
  @JsonAdapter(ObjectiveEnum.Adapter.class)
  public enum ObjectiveEnum {
    CUSTOMACTION("customAction"),
    
    CLICKS("clicks"),
    
    CONVERSIONS("conversions"),
    
    DISPLAYS("displays"),
    
    APPPROMOTION("appPromotion"),
    
    REVENUE("revenue"),
    
    STORECONVERSIONS("storeConversions"),
    
    VALUE("value"),
    
    REACH("reach"),
    
    VISITS("visits"),
    
    VIDEOVIEWS("videoViews");

    private String value;

    ObjectiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectiveEnum fromValue(String value) {
      for (ObjectiveEnum b : ObjectiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectiveEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectiveEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECTIVE = "objective";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE)
  private ObjectiveEnum objective;

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

  public static final String SERIALIZED_NAME_TRACKING_CODE = "trackingCode";
  @SerializedName(SERIALIZED_NAME_TRACKING_CODE)
  private String trackingCode;

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public CreateAdSet() {
  }

  public CreateAdSet name(String name) {
    
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


  public CreateAdSet datasetId(String datasetId) {
    
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


  public CreateAdSet campaignId(String campaignId) {
    
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


  public CreateAdSet objective(ObjectiveEnum objective) {
    
    this.objective = objective;
    return this;
  }

   /**
   * Objective of the ad set
   * @return objective
  **/
  @javax.annotation.Nonnull

  public ObjectiveEnum getObjective() {
    return objective;
  }


  public void setObjective(ObjectiveEnum objective) {
    this.objective = objective;
  }


  public CreateAdSet schedule(CreateAdSetSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nonnull

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
  @javax.annotation.Nonnull

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
  @javax.annotation.Nonnull

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
  @javax.annotation.Nonnull

  public CreateAdSetBudget getBudget() {
    return budget;
  }


  public void setBudget(CreateAdSetBudget budget) {
    this.budget = budget;
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

  public String getTrackingCode() {
    return trackingCode;
  }


  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }


  public CreateAdSet mediaType(MediaTypeEnum mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Media type for the ad set
   * @return mediaType
  **/
  @javax.annotation.Nonnull

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
   * @return the CreateAdSet instance itself
   */
  public CreateAdSet putAdditionalProperty(String key, Object value) {
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
    CreateAdSet createAdSet = (CreateAdSet) o;
    return Objects.equals(this.name, createAdSet.name) &&
        Objects.equals(this.datasetId, createAdSet.datasetId) &&
        Objects.equals(this.campaignId, createAdSet.campaignId) &&
        Objects.equals(this.objective, createAdSet.objective) &&
        Objects.equals(this.schedule, createAdSet.schedule) &&
        Objects.equals(this.bidding, createAdSet.bidding) &&
        Objects.equals(this.targeting, createAdSet.targeting) &&
        Objects.equals(this.budget, createAdSet.budget) &&
        Objects.equals(this.trackingCode, createAdSet.trackingCode) &&
        Objects.equals(this.mediaType, createAdSet.mediaType)&&
        Objects.equals(this.additionalProperties, createAdSet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, datasetId, campaignId, objective, schedule, bidding, targeting, budget, trackingCode, mediaType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAdSet {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    bidding: ").append(toIndentedString(bidding)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
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
    openapiFields.add("datasetId");
    openapiFields.add("campaignId");
    openapiFields.add("objective");
    openapiFields.add("schedule");
    openapiFields.add("bidding");
    openapiFields.add("targeting");
    openapiFields.add("budget");
    openapiFields.add("trackingCode");
    openapiFields.add("mediaType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("datasetId");
    openapiRequiredFields.add("campaignId");
    openapiRequiredFields.add("objective");
    openapiRequiredFields.add("schedule");
    openapiRequiredFields.add("bidding");
    openapiRequiredFields.add("targeting");
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("trackingCode");
    openapiRequiredFields.add("mediaType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAdSet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateAdSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAdSet is not found in the empty JSON string", CreateAdSet.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAdSet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("datasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetId").toString()));
      }
      if (!jsonObj.get("campaignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignId").toString()));
      }
      if (!jsonObj.get("objective").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objective` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objective").toString()));
      }
      // validate the required field `schedule`
      CreateAdSetSchedule.validateJsonObject(jsonObj.getAsJsonObject("schedule"));
      // validate the required field `bidding`
      CreateAdSetBidding.validateJsonObject(jsonObj.getAsJsonObject("bidding"));
      // validate the required field `targeting`
      CreateAdSetTargeting.validateJsonObject(jsonObj.getAsJsonObject("targeting"));
      // validate the required field `budget`
      CreateAdSetBudget.validateJsonObject(jsonObj.getAsJsonObject("budget"));
      if (!jsonObj.get("trackingCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackingCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackingCode").toString()));
      }
      if (!jsonObj.get("mediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAdSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAdSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAdSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAdSet.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAdSet>() {
           @Override
           public void write(JsonWriter out, CreateAdSet value) throws IOException {
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
           public CreateAdSet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateAdSet instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateAdSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAdSet
  * @throws IOException if the JSON string is invalid with respect to CreateAdSet
  */
  public static CreateAdSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAdSet.class);
  }

 /**
  * Convert an instance of CreateAdSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

