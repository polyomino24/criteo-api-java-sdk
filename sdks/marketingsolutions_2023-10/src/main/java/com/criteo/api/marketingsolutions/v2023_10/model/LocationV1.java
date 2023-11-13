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
import com.criteo.api.marketingsolutions.v2023_10.model.PointOfInterestV1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.criteo.api.marketingsolutions.v2023_10.JSON;

/**
 * Settings to target users based on their location.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LocationV1 {
  public static final String SERIALIZED_NAME_POINTS_OF_INTEREST = "pointsOfInterest";
  @SerializedName(SERIALIZED_NAME_POINTS_OF_INTEREST)
  private List<PointOfInterestV1> pointsOfInterest = null;

  public static final String SERIALIZED_NAME_RADIUS_IN_KM = "radiusInKm";
  @SerializedName(SERIALIZED_NAME_RADIUS_IN_KM)
  private Integer radiusInKm;

  /**
   * The kind of Location audience
   */
  @JsonAdapter(RegistryTypeEnum.Adapter.class)
  public enum RegistryTypeEnum {
    UNKNOWN("Unknown"),
    
    POINTOFINTEREST("PointOfInterest");

    private String value;

    RegistryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RegistryTypeEnum fromValue(String value) {
      for (RegistryTypeEnum b : RegistryTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RegistryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegistryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegistryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RegistryTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REGISTRY_TYPE = "registryType";
  @SerializedName(SERIALIZED_NAME_REGISTRY_TYPE)
  private RegistryTypeEnum registryType;

  public LocationV1() {
  }

  public LocationV1 pointsOfInterest(List<PointOfInterestV1> pointsOfInterest) {
    
    this.pointsOfInterest = pointsOfInterest;
    return this;
  }

  public LocationV1 addPointsOfInterestItem(PointOfInterestV1 pointsOfInterestItem) {
    if (this.pointsOfInterest == null) {
      this.pointsOfInterest = null;
    }
    this.pointsOfInterest.add(pointsOfInterestItem);
    return this;
  }

   /**
   * Reach users which have been historically located in the given coordinates
   * @return pointsOfInterest
  **/
  @javax.annotation.Nullable

  public List<PointOfInterestV1> getPointsOfInterest() {
    return pointsOfInterest;
  }


  public void setPointsOfInterest(List<PointOfInterestV1> pointsOfInterest) {
    this.pointsOfInterest = pointsOfInterest;
  }


  public LocationV1 radiusInKm(Integer radiusInKm) {
    
    this.radiusInKm = radiusInKm;
    return this;
  }

   /**
   * The expected maximum distance in kilometers between a user and a point of interest
   * @return radiusInKm
  **/
  @javax.annotation.Nullable

  public Integer getRadiusInKm() {
    return radiusInKm;
  }


  public void setRadiusInKm(Integer radiusInKm) {
    this.radiusInKm = radiusInKm;
  }


  public LocationV1 registryType(RegistryTypeEnum registryType) {
    
    this.registryType = registryType;
    return this;
  }

   /**
   * The kind of Location audience
   * @return registryType
  **/
  @javax.annotation.Nullable

  public RegistryTypeEnum getRegistryType() {
    return registryType;
  }


  public void setRegistryType(RegistryTypeEnum registryType) {
    this.registryType = registryType;
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
   * @return the LocationV1 instance itself
   */
  public LocationV1 putAdditionalProperty(String key, Object value) {
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
    LocationV1 locationV1 = (LocationV1) o;
    return Objects.equals(this.pointsOfInterest, locationV1.pointsOfInterest) &&
        Objects.equals(this.radiusInKm, locationV1.radiusInKm) &&
        Objects.equals(this.registryType, locationV1.registryType)&&
        Objects.equals(this.additionalProperties, locationV1.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointsOfInterest, radiusInKm, registryType, additionalProperties);
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
    sb.append("class LocationV1 {\n");
    sb.append("    pointsOfInterest: ").append(toIndentedString(pointsOfInterest)).append("\n");
    sb.append("    radiusInKm: ").append(toIndentedString(radiusInKm)).append("\n");
    sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
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
    openapiFields.add("pointsOfInterest");
    openapiFields.add("radiusInKm");
    openapiFields.add("registryType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationV1 is not found in the empty JSON string", LocationV1.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("pointsOfInterest") != null && !jsonObj.get("pointsOfInterest").isJsonNull()) {
        JsonArray jsonArraypointsOfInterest = jsonObj.getAsJsonArray("pointsOfInterest");
        if (jsonArraypointsOfInterest != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pointsOfInterest").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pointsOfInterest` to be an array in the JSON string but got `%s`", jsonObj.get("pointsOfInterest").toString()));
          }

          // validate the optional field `pointsOfInterest` (array)
          for (int i = 0; i < jsonArraypointsOfInterest.size(); i++) {
            PointOfInterestV1.validateJsonObject(jsonArraypointsOfInterest.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("registryType") != null && !jsonObj.get("registryType").isJsonNull()) && !jsonObj.get("registryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registryType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationV1.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationV1>() {
           @Override
           public void write(JsonWriter out, LocationV1 value) throws IOException {
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
           public LocationV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocationV1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LocationV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationV1
  * @throws IOException if the JSON string is invalid with respect to LocationV1
  */
  public static LocationV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationV1.class);
  }

 /**
  * Convert an instance of LocationV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
