/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2023-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2023_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2023_04.model.NillableDecimal;
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

import com.criteo.api.marketingsolutions.v2023_04.JSON;

/**
 * campaign spend limit model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignSpendLimit {
  /**
   * Gets or Sets spendLimitType
   */
  @JsonAdapter(SpendLimitTypeEnum.Adapter.class)
  public enum SpendLimitTypeEnum {
    CAPPED("capped"),
    
    UNCAPPED("uncapped");

    private String value;

    SpendLimitTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpendLimitTypeEnum fromValue(String value) {
      for (SpendLimitTypeEnum b : SpendLimitTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpendLimitTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpendLimitTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpendLimitTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpendLimitTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEND_LIMIT_TYPE = "spendLimitType";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_TYPE)
  private SpendLimitTypeEnum spendLimitType;

  /**
   * Gets or Sets spendLimitRenewal
   */
  @JsonAdapter(SpendLimitRenewalEnum.Adapter.class)
  public enum SpendLimitRenewalEnum {
    UNDEFINED("undefined"),
    
    DAILY("daily"),
    
    MONTHLY("monthly"),
    
    LIFETIME("lifetime");

    private String value;

    SpendLimitRenewalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpendLimitRenewalEnum fromValue(String value) {
      for (SpendLimitRenewalEnum b : SpendLimitRenewalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpendLimitRenewalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpendLimitRenewalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpendLimitRenewalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpendLimitRenewalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPEND_LIMIT_RENEWAL = "spendLimitRenewal";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_RENEWAL)
  private SpendLimitRenewalEnum spendLimitRenewal;

  public static final String SERIALIZED_NAME_SPEND_LIMIT_AMOUNT = "spendLimitAmount";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT_AMOUNT)
  private NillableDecimal spendLimitAmount;

  public CampaignSpendLimit() {
  }

  public CampaignSpendLimit spendLimitType(SpendLimitTypeEnum spendLimitType) {
    
    this.spendLimitType = spendLimitType;
    return this;
  }

   /**
   * Get spendLimitType
   * @return spendLimitType
  **/
  @javax.annotation.Nullable

  public SpendLimitTypeEnum getSpendLimitType() {
    return spendLimitType;
  }


  public void setSpendLimitType(SpendLimitTypeEnum spendLimitType) {
    this.spendLimitType = spendLimitType;
  }


  public CampaignSpendLimit spendLimitRenewal(SpendLimitRenewalEnum spendLimitRenewal) {
    
    this.spendLimitRenewal = spendLimitRenewal;
    return this;
  }

   /**
   * Get spendLimitRenewal
   * @return spendLimitRenewal
  **/
  @javax.annotation.Nullable

  public SpendLimitRenewalEnum getSpendLimitRenewal() {
    return spendLimitRenewal;
  }


  public void setSpendLimitRenewal(SpendLimitRenewalEnum spendLimitRenewal) {
    this.spendLimitRenewal = spendLimitRenewal;
  }


  public CampaignSpendLimit spendLimitAmount(NillableDecimal spendLimitAmount) {
    
    this.spendLimitAmount = spendLimitAmount;
    return this;
  }

   /**
   * Get spendLimitAmount
   * @return spendLimitAmount
  **/
  @javax.annotation.Nullable

  public NillableDecimal getSpendLimitAmount() {
    return spendLimitAmount;
  }


  public void setSpendLimitAmount(NillableDecimal spendLimitAmount) {
    this.spendLimitAmount = spendLimitAmount;
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
   * @return the CampaignSpendLimit instance itself
   */
  public CampaignSpendLimit putAdditionalProperty(String key, Object value) {
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
    CampaignSpendLimit campaignSpendLimit = (CampaignSpendLimit) o;
    return Objects.equals(this.spendLimitType, campaignSpendLimit.spendLimitType) &&
        Objects.equals(this.spendLimitRenewal, campaignSpendLimit.spendLimitRenewal) &&
        Objects.equals(this.spendLimitAmount, campaignSpendLimit.spendLimitAmount)&&
        Objects.equals(this.additionalProperties, campaignSpendLimit.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(spendLimitType, spendLimitRenewal, spendLimitAmount, additionalProperties);
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
    sb.append("class CampaignSpendLimit {\n");
    sb.append("    spendLimitType: ").append(toIndentedString(spendLimitType)).append("\n");
    sb.append("    spendLimitRenewal: ").append(toIndentedString(spendLimitRenewal)).append("\n");
    sb.append("    spendLimitAmount: ").append(toIndentedString(spendLimitAmount)).append("\n");
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
    openapiFields.add("spendLimitType");
    openapiFields.add("spendLimitRenewal");
    openapiFields.add("spendLimitAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignSpendLimit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignSpendLimit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignSpendLimit is not found in the empty JSON string", CampaignSpendLimit.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("spendLimitType") != null && !jsonObj.get("spendLimitType").isJsonNull()) && !jsonObj.get("spendLimitType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spendLimitType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spendLimitType").toString()));
      }
      if ((jsonObj.get("spendLimitRenewal") != null && !jsonObj.get("spendLimitRenewal").isJsonNull()) && !jsonObj.get("spendLimitRenewal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spendLimitRenewal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spendLimitRenewal").toString()));
      }
      // validate the optional field `spendLimitAmount`
      if (jsonObj.get("spendLimitAmount") != null && !jsonObj.get("spendLimitAmount").isJsonNull()) {
        NillableDecimal.validateJsonObject(jsonObj.getAsJsonObject("spendLimitAmount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignSpendLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignSpendLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignSpendLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignSpendLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignSpendLimit>() {
           @Override
           public void write(JsonWriter out, CampaignSpendLimit value) throws IOException {
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
           public CampaignSpendLimit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CampaignSpendLimit instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignSpendLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignSpendLimit
  * @throws IOException if the JSON string is invalid with respect to CampaignSpendLimit
  */
  public static CampaignSpendLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignSpendLimit.class);
  }

 /**
  * Convert an instance of CampaignSpendLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

