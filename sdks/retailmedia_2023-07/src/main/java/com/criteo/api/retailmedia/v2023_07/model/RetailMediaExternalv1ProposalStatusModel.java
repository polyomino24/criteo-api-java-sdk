/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: 2023-07
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2023_07.model;

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

import com.criteo.api.retailmedia.v2023_07.JSON;

/**
 * The proposal status includes the state of the proposal, the status of the booking and approval, as well as any comments explaining why it might have been rejected.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaExternalv1ProposalStatusModel {
  /**
   * Gets or Sets negotiationState
   */
  @JsonAdapter(NegotiationStateEnum.Adapter.class)
  public enum NegotiationStateEnum {
    INVALID("Invalid"),
    
    MODIFIED("Modified"),
    
    SUBMITTED("Submitted"),
    
    REVIEWED("Reviewed"),
    
    APPROVED("Approved");

    private String value;

    NegotiationStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NegotiationStateEnum fromValue(String value) {
      for (NegotiationStateEnum b : NegotiationStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NegotiationStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NegotiationStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NegotiationStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NegotiationStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NEGOTIATION_STATE = "negotiationState";
  @SerializedName(SERIALIZED_NAME_NEGOTIATION_STATE)
  private NegotiationStateEnum negotiationState;

  /**
   * Gets or Sets bookingStatus
   */
  @JsonAdapter(BookingStatusEnum.Adapter.class)
  public enum BookingStatusEnum {
    NOTSUBMITTED("NotSubmitted"),
    
    SUBMITTED("Submitted"),
    
    REJECTED("Rejected"),
    
    APPROVED("Approved");

    private String value;

    BookingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BookingStatusEnum fromValue(String value) {
      for (BookingStatusEnum b : BookingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BookingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BookingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BookingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BookingStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BOOKING_STATUS = "bookingStatus";
  @SerializedName(SERIALIZED_NAME_BOOKING_STATUS)
  private BookingStatusEnum bookingStatus;

  /**
   * Gets or Sets runnableStatus
   */
  @JsonAdapter(RunnableStatusEnum.Adapter.class)
  public enum RunnableStatusEnum {
    NOTSUBMITTED("NotSubmitted"),
    
    SUBMITTED("Submitted"),
    
    REJECTED("Rejected"),
    
    APPROVED("Approved");

    private String value;

    RunnableStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RunnableStatusEnum fromValue(String value) {
      for (RunnableStatusEnum b : RunnableStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RunnableStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RunnableStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RunnableStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RunnableStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RUNNABLE_STATUS = "runnableStatus";
  @SerializedName(SERIALIZED_NAME_RUNNABLE_STATUS)
  private RunnableStatusEnum runnableStatus;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public RetailMediaExternalv1ProposalStatusModel() {
  }

  public RetailMediaExternalv1ProposalStatusModel negotiationState(NegotiationStateEnum negotiationState) {
    
    this.negotiationState = negotiationState;
    return this;
  }

   /**
   * Get negotiationState
   * @return negotiationState
  **/
  @javax.annotation.Nonnull

  public NegotiationStateEnum getNegotiationState() {
    return negotiationState;
  }


  public void setNegotiationState(NegotiationStateEnum negotiationState) {
    this.negotiationState = negotiationState;
  }


  public RetailMediaExternalv1ProposalStatusModel bookingStatus(BookingStatusEnum bookingStatus) {
    
    this.bookingStatus = bookingStatus;
    return this;
  }

   /**
   * Get bookingStatus
   * @return bookingStatus
  **/
  @javax.annotation.Nonnull

  public BookingStatusEnum getBookingStatus() {
    return bookingStatus;
  }


  public void setBookingStatus(BookingStatusEnum bookingStatus) {
    this.bookingStatus = bookingStatus;
  }


  public RetailMediaExternalv1ProposalStatusModel runnableStatus(RunnableStatusEnum runnableStatus) {
    
    this.runnableStatus = runnableStatus;
    return this;
  }

   /**
   * Get runnableStatus
   * @return runnableStatus
  **/
  @javax.annotation.Nonnull

  public RunnableStatusEnum getRunnableStatus() {
    return runnableStatus;
  }


  public void setRunnableStatus(RunnableStatusEnum runnableStatus) {
    this.runnableStatus = runnableStatus;
  }


  public RetailMediaExternalv1ProposalStatusModel comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public RetailMediaExternalv1ProposalStatusModel createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public RetailMediaExternalv1ProposalStatusModel updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return the RetailMediaExternalv1ProposalStatusModel instance itself
   */
  public RetailMediaExternalv1ProposalStatusModel putAdditionalProperty(String key, Object value) {
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
    RetailMediaExternalv1ProposalStatusModel retailMediaExternalv1ProposalStatusModel = (RetailMediaExternalv1ProposalStatusModel) o;
    return Objects.equals(this.negotiationState, retailMediaExternalv1ProposalStatusModel.negotiationState) &&
        Objects.equals(this.bookingStatus, retailMediaExternalv1ProposalStatusModel.bookingStatus) &&
        Objects.equals(this.runnableStatus, retailMediaExternalv1ProposalStatusModel.runnableStatus) &&
        Objects.equals(this.comment, retailMediaExternalv1ProposalStatusModel.comment) &&
        Objects.equals(this.createdAt, retailMediaExternalv1ProposalStatusModel.createdAt) &&
        Objects.equals(this.updatedAt, retailMediaExternalv1ProposalStatusModel.updatedAt)&&
        Objects.equals(this.additionalProperties, retailMediaExternalv1ProposalStatusModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(negotiationState, bookingStatus, runnableStatus, comment, createdAt, updatedAt, additionalProperties);
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
    sb.append("class RetailMediaExternalv1ProposalStatusModel {\n");
    sb.append("    negotiationState: ").append(toIndentedString(negotiationState)).append("\n");
    sb.append("    bookingStatus: ").append(toIndentedString(bookingStatus)).append("\n");
    sb.append("    runnableStatus: ").append(toIndentedString(runnableStatus)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("negotiationState");
    openapiFields.add("bookingStatus");
    openapiFields.add("runnableStatus");
    openapiFields.add("comment");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("negotiationState");
    openapiRequiredFields.add("bookingStatus");
    openapiRequiredFields.add("runnableStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetailMediaExternalv1ProposalStatusModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetailMediaExternalv1ProposalStatusModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetailMediaExternalv1ProposalStatusModel is not found in the empty JSON string", RetailMediaExternalv1ProposalStatusModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetailMediaExternalv1ProposalStatusModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("negotiationState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `negotiationState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("negotiationState").toString()));
      }
      if (!jsonObj.get("bookingStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bookingStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bookingStatus").toString()));
      }
      if (!jsonObj.get("runnableStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runnableStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runnableStatus").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetailMediaExternalv1ProposalStatusModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetailMediaExternalv1ProposalStatusModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetailMediaExternalv1ProposalStatusModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetailMediaExternalv1ProposalStatusModel.class));

       return (TypeAdapter<T>) new TypeAdapter<RetailMediaExternalv1ProposalStatusModel>() {
           @Override
           public void write(JsonWriter out, RetailMediaExternalv1ProposalStatusModel value) throws IOException {
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
           public RetailMediaExternalv1ProposalStatusModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetailMediaExternalv1ProposalStatusModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetailMediaExternalv1ProposalStatusModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetailMediaExternalv1ProposalStatusModel
  * @throws IOException if the JSON string is invalid with respect to RetailMediaExternalv1ProposalStatusModel
  */
  public static RetailMediaExternalv1ProposalStatusModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetailMediaExternalv1ProposalStatusModel.class);
  }

 /**
  * Convert an instance of RetailMediaExternalv1ProposalStatusModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

