/*
 * Criteo API
 * Criteo API - MarketingSolutions
 *
 * The version of the OpenAPI document: 2022-10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2022_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.criteo.api.marketingsolutions.v2022_10.JSON;

/**
 * AudienceAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceAttributes {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiserId";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_NB_LINES = "nbLines";
  @SerializedName(SERIALIZED_NAME_NB_LINES)
  private Integer nbLines;

  public static final String SERIALIZED_NAME_NB_LINES_EMAIL = "nbLinesEmail";
  @SerializedName(SERIALIZED_NAME_NB_LINES_EMAIL)
  private Integer nbLinesEmail;

  public static final String SERIALIZED_NAME_NB_MATCHES_EMAIL = "nbMatchesEmail";
  @SerializedName(SERIALIZED_NAME_NB_MATCHES_EMAIL)
  private Integer nbMatchesEmail;

  public AudienceAttributes() {
  }

  public AudienceAttributes advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * The advertiser id that owns this Audience
   * @return advertiserId
  **/
  @javax.annotation.Nullable

  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AudienceAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Audience
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudienceAttributes description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The string description of the Audience
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AudienceAttributes created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Date and time ISO 8601 formatted string
   * @return created
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public AudienceAttributes updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Date and time ISO 8601 formatted string
   * @return updated
  **/
  @javax.annotation.Nonnull

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public AudienceAttributes nbLines(Integer nbLines) {
    
    this.nbLines = nbLines;
    return this;
  }

   /**
   * The number of line in the audience available once processed
   * @return nbLines
  **/
  @javax.annotation.Nullable

  public Integer getNbLines() {
    return nbLines;
  }


  public void setNbLines(Integer nbLines) {
    this.nbLines = nbLines;
  }


  public AudienceAttributes nbLinesEmail(Integer nbLinesEmail) {
    
    this.nbLinesEmail = nbLinesEmail;
    return this;
  }

   /**
   * The number of email line in the audience available once processed
   * @return nbLinesEmail
  **/
  @javax.annotation.Nullable

  public Integer getNbLinesEmail() {
    return nbLinesEmail;
  }


  public void setNbLinesEmail(Integer nbLinesEmail) {
    this.nbLinesEmail = nbLinesEmail;
  }


  public AudienceAttributes nbMatchesEmail(Integer nbMatchesEmail) {
    
    this.nbMatchesEmail = nbMatchesEmail;
    return this;
  }

   /**
   * The number of email matches in the audience available once processed
   * @return nbMatchesEmail
  **/
  @javax.annotation.Nullable

  public Integer getNbMatchesEmail() {
    return nbMatchesEmail;
  }


  public void setNbMatchesEmail(Integer nbMatchesEmail) {
    this.nbMatchesEmail = nbMatchesEmail;
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
   * @return the AudienceAttributes instance itself
   */
  public AudienceAttributes putAdditionalProperty(String key, Object value) {
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
    AudienceAttributes audienceAttributes = (AudienceAttributes) o;
    return Objects.equals(this.advertiserId, audienceAttributes.advertiserId) &&
        Objects.equals(this.name, audienceAttributes.name) &&
        Objects.equals(this.description, audienceAttributes.description) &&
        Objects.equals(this.created, audienceAttributes.created) &&
        Objects.equals(this.updated, audienceAttributes.updated) &&
        Objects.equals(this.nbLines, audienceAttributes.nbLines) &&
        Objects.equals(this.nbLinesEmail, audienceAttributes.nbLinesEmail) &&
        Objects.equals(this.nbMatchesEmail, audienceAttributes.nbMatchesEmail)&&
        Objects.equals(this.additionalProperties, audienceAttributes.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, name, description, created, updated, nbLines, nbLinesEmail, nbMatchesEmail, additionalProperties);
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
    sb.append("class AudienceAttributes {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    nbLines: ").append(toIndentedString(nbLines)).append("\n");
    sb.append("    nbLinesEmail: ").append(toIndentedString(nbLinesEmail)).append("\n");
    sb.append("    nbMatchesEmail: ").append(toIndentedString(nbMatchesEmail)).append("\n");
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
    openapiFields.add("advertiserId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("created");
    openapiFields.add("updated");
    openapiFields.add("nbLines");
    openapiFields.add("nbLinesEmail");
    openapiFields.add("nbMatchesEmail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("updated");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudienceAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudienceAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudienceAttributes is not found in the empty JSON string", AudienceAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AudienceAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("advertiserId") != null && !jsonObj.get("advertiserId").isJsonNull()) && !jsonObj.get("advertiserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advertiserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advertiserId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudienceAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudienceAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudienceAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudienceAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<AudienceAttributes>() {
           @Override
           public void write(JsonWriter out, AudienceAttributes value) throws IOException {
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
           public AudienceAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudienceAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AudienceAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudienceAttributes
  * @throws IOException if the JSON string is invalid with respect to AudienceAttributes
  */
  public static AudienceAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudienceAttributes.class);
  }

 /**
  * Convert an instance of AudienceAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

