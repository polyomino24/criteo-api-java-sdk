/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2023-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2023_07.model;

import java.util.Objects;
import java.util.Arrays;
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

import com.criteo.api.marketingsolutions.v2023_07.JSON;

/**
 * ad set delivery limitations model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdSetDeliveryLimitations {
  /**
   * Gets or Sets environments
   */
  @JsonAdapter(EnvironmentsEnum.Adapter.class)
  public enum EnvironmentsEnum {
    WEB("web"),
    
    INAPP("inApp");

    private String value;

    EnvironmentsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentsEnum fromValue(String value) {
      for (EnvironmentsEnum b : EnvironmentsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<EnvironmentsEnum> environments = null;

  /**
   * Gets or Sets devices
   */
  @JsonAdapter(DevicesEnum.Adapter.class)
  public enum DevicesEnum {
    OTHER("other"),
    
    DESKTOP("desktop"),
    
    MOBILE("mobile"),
    
    TABLET("tablet");

    private String value;

    DevicesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DevicesEnum fromValue(String value) {
      for (DevicesEnum b : DevicesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DevicesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DevicesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DevicesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DevicesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<DevicesEnum> devices = null;

  /**
   * Gets or Sets operatingSystems
   */
  @JsonAdapter(OperatingSystemsEnum.Adapter.class)
  public enum OperatingSystemsEnum {
    ANDROID("android"),
    
    IOS("ios"),
    
    UNKNOWN("unknown");

    private String value;

    OperatingSystemsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatingSystemsEnum fromValue(String value) {
      for (OperatingSystemsEnum b : OperatingSystemsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatingSystemsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatingSystemsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatingSystemsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatingSystemsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATING_SYSTEMS = "operatingSystems";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEMS)
  private List<OperatingSystemsEnum> operatingSystems = null;

  public AdSetDeliveryLimitations() {
  }

  public AdSetDeliveryLimitations environments(List<EnvironmentsEnum> environments) {
    
    this.environments = environments;
    return this;
  }

  public AdSetDeliveryLimitations addEnvironmentsItem(EnvironmentsEnum environmentsItem) {
    if (this.environments == null) {
      this.environments = null;
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * Get environments
   * @return environments
  **/
  @javax.annotation.Nullable

  public List<EnvironmentsEnum> getEnvironments() {
    return environments;
  }


  public void setEnvironments(List<EnvironmentsEnum> environments) {
    this.environments = environments;
  }


  public AdSetDeliveryLimitations devices(List<DevicesEnum> devices) {
    
    this.devices = devices;
    return this;
  }

  public AdSetDeliveryLimitations addDevicesItem(DevicesEnum devicesItem) {
    if (this.devices == null) {
      this.devices = null;
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable

  public List<DevicesEnum> getDevices() {
    return devices;
  }


  public void setDevices(List<DevicesEnum> devices) {
    this.devices = devices;
  }


  public AdSetDeliveryLimitations operatingSystems(List<OperatingSystemsEnum> operatingSystems) {
    
    this.operatingSystems = operatingSystems;
    return this;
  }

  public AdSetDeliveryLimitations addOperatingSystemsItem(OperatingSystemsEnum operatingSystemsItem) {
    if (this.operatingSystems == null) {
      this.operatingSystems = null;
    }
    this.operatingSystems.add(operatingSystemsItem);
    return this;
  }

   /**
   * Get operatingSystems
   * @return operatingSystems
  **/
  @javax.annotation.Nullable

  public List<OperatingSystemsEnum> getOperatingSystems() {
    return operatingSystems;
  }


  public void setOperatingSystems(List<OperatingSystemsEnum> operatingSystems) {
    this.operatingSystems = operatingSystems;
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
   * @return the AdSetDeliveryLimitations instance itself
   */
  public AdSetDeliveryLimitations putAdditionalProperty(String key, Object value) {
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
    AdSetDeliveryLimitations adSetDeliveryLimitations = (AdSetDeliveryLimitations) o;
    return Objects.equals(this.environments, adSetDeliveryLimitations.environments) &&
        Objects.equals(this.devices, adSetDeliveryLimitations.devices) &&
        Objects.equals(this.operatingSystems, adSetDeliveryLimitations.operatingSystems)&&
        Objects.equals(this.additionalProperties, adSetDeliveryLimitations.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(environments, devices, operatingSystems, additionalProperties);
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
    sb.append("class AdSetDeliveryLimitations {\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
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
    openapiFields.add("environments");
    openapiFields.add("devices");
    openapiFields.add("operatingSystems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdSetDeliveryLimitations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdSetDeliveryLimitations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdSetDeliveryLimitations is not found in the empty JSON string", AdSetDeliveryLimitations.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("environments") != null && !jsonObj.get("environments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `environments` to be an array in the JSON string but got `%s`", jsonObj.get("environments").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("operatingSystems") != null && !jsonObj.get("operatingSystems").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operatingSystems` to be an array in the JSON string but got `%s`", jsonObj.get("operatingSystems").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdSetDeliveryLimitations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdSetDeliveryLimitations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdSetDeliveryLimitations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdSetDeliveryLimitations.class));

       return (TypeAdapter<T>) new TypeAdapter<AdSetDeliveryLimitations>() {
           @Override
           public void write(JsonWriter out, AdSetDeliveryLimitations value) throws IOException {
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
           public AdSetDeliveryLimitations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AdSetDeliveryLimitations instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AdSetDeliveryLimitations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdSetDeliveryLimitations
  * @throws IOException if the JSON string is invalid with respect to AdSetDeliveryLimitations
  */
  public static AdSetDeliveryLimitations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdSetDeliveryLimitations.class);
  }

 /**
  * Convert an instance of AdSetDeliveryLimitations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

