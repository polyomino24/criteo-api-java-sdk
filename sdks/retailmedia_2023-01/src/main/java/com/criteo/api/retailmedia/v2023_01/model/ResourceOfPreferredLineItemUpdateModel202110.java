/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2023-01
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_01.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.retailmedia.v2023_01.model.ExternalPreferredLineItemUpdateModel202110;
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

import com.criteo.api.retailmedia.v2023_01.JSON;

/**
 * Data model for a Resource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResourceOfPreferredLineItemUpdateModel202110 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private ExternalPreferredLineItemUpdateModel202110 attributes;

  public ResourceOfPreferredLineItemUpdateModel202110() {
  }

  public ResourceOfPreferredLineItemUpdateModel202110 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ResourceOfPreferredLineItemUpdateModel202110 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Canonical type name of the entity
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ResourceOfPreferredLineItemUpdateModel202110 attributes(ExternalPreferredLineItemUpdateModel202110 attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable

  public ExternalPreferredLineItemUpdateModel202110 getAttributes() {
    return attributes;
  }


  public void setAttributes(ExternalPreferredLineItemUpdateModel202110 attributes) {
    this.attributes = attributes;
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
   * @return the ResourceOfPreferredLineItemUpdateModel202110 instance itself
   */
  public ResourceOfPreferredLineItemUpdateModel202110 putAdditionalProperty(String key, Object value) {
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
    ResourceOfPreferredLineItemUpdateModel202110 resourceOfPreferredLineItemUpdateModel202110 = (ResourceOfPreferredLineItemUpdateModel202110) o;
    return Objects.equals(this.id, resourceOfPreferredLineItemUpdateModel202110.id) &&
        Objects.equals(this.type, resourceOfPreferredLineItemUpdateModel202110.type) &&
        Objects.equals(this.attributes, resourceOfPreferredLineItemUpdateModel202110.attributes)&&
        Objects.equals(this.additionalProperties, resourceOfPreferredLineItemUpdateModel202110.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, attributes, additionalProperties);
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
    sb.append("class ResourceOfPreferredLineItemUpdateModel202110 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResourceOfPreferredLineItemUpdateModel202110
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResourceOfPreferredLineItemUpdateModel202110.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceOfPreferredLineItemUpdateModel202110 is not found in the empty JSON string", ResourceOfPreferredLineItemUpdateModel202110.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `attributes`
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        ExternalPreferredLineItemUpdateModel202110.validateJsonObject(jsonObj.getAsJsonObject("attributes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceOfPreferredLineItemUpdateModel202110.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceOfPreferredLineItemUpdateModel202110' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceOfPreferredLineItemUpdateModel202110> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceOfPreferredLineItemUpdateModel202110.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceOfPreferredLineItemUpdateModel202110>() {
           @Override
           public void write(JsonWriter out, ResourceOfPreferredLineItemUpdateModel202110 value) throws IOException {
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
           public ResourceOfPreferredLineItemUpdateModel202110 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ResourceOfPreferredLineItemUpdateModel202110 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ResourceOfPreferredLineItemUpdateModel202110 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceOfPreferredLineItemUpdateModel202110
  * @throws IOException if the JSON string is invalid with respect to ResourceOfPreferredLineItemUpdateModel202110
  */
  public static ResourceOfPreferredLineItemUpdateModel202110 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceOfPreferredLineItemUpdateModel202110.class);
  }

 /**
  * Convert an instance of ResourceOfPreferredLineItemUpdateModel202110 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

