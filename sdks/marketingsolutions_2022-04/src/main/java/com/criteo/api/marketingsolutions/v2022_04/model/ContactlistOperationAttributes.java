/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 2022-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2022_04.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * the contactlist operation attributes
 */
@ApiModel(description = "the contactlist operation attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactlistOperationAttributes {
  public static final String SERIALIZED_NAME_CONTACT_LIST_ID = "contactListId";
  @SerializedName(SERIALIZED_NAME_CONTACT_LIST_ID)
  private String contactListId;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_REQUEST_DATE = "requestDate";
  @SerializedName(SERIALIZED_NAME_REQUEST_DATE)
  private OffsetDateTime requestDate;

  public static final String SERIALIZED_NAME_IDENTIFIER_TYPE = "identifierType";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_TYPE)
  private String identifierType;

  public static final String SERIALIZED_NAME_NB_VALID_IDENTIFIERS = "nbValidIdentifiers";
  @SerializedName(SERIALIZED_NAME_NB_VALID_IDENTIFIERS)
  private Integer nbValidIdentifiers;

  public static final String SERIALIZED_NAME_NB_INVALID_IDENTIFIERS = "nbInvalidIdentifiers";
  @SerializedName(SERIALIZED_NAME_NB_INVALID_IDENTIFIERS)
  private Integer nbInvalidIdentifiers;

  public static final String SERIALIZED_NAME_SAMPLE_INVALID_IDENTIFIERS = "sampleInvalidIdentifiers";
  @SerializedName(SERIALIZED_NAME_SAMPLE_INVALID_IDENTIFIERS)
  private List<String> sampleInvalidIdentifiers = null;


  public ContactlistOperationAttributes contactListId(String contactListId) {
    
    this.contactListId = contactListId;
    return this;
  }

   /**
   * the affected user list id
   * @return contactListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the affected user list id")

  public String getContactListId() {
    return contactListId;
  }


  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }


  public ContactlistOperationAttributes operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * The action recorded
   * @return operation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The action recorded")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ContactlistOperationAttributes requestDate(OffsetDateTime requestDate) {
    
    this.requestDate = requestDate;
    return this;
  }

   /**
   * When the action was recorded
   * @return requestDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the action was recorded")

  public OffsetDateTime getRequestDate() {
    return requestDate;
  }


  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }


  public ContactlistOperationAttributes identifierType(String identifierType) {
    
    this.identifierType = identifierType;
    return this;
  }

   /**
   * The schema specified for of the identifiers
   * @return identifierType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The schema specified for of the identifiers")

  public String getIdentifierType() {
    return identifierType;
  }


  public void setIdentifierType(String identifierType) {
    this.identifierType = identifierType;
  }


  public ContactlistOperationAttributes nbValidIdentifiers(Integer nbValidIdentifiers) {
    
    this.nbValidIdentifiers = nbValidIdentifiers;
    return this;
  }

   /**
   * How many identifiers were valid for the specified schema
   * @return nbValidIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many identifiers were valid for the specified schema")

  public Integer getNbValidIdentifiers() {
    return nbValidIdentifiers;
  }


  public void setNbValidIdentifiers(Integer nbValidIdentifiers) {
    this.nbValidIdentifiers = nbValidIdentifiers;
  }


  public ContactlistOperationAttributes nbInvalidIdentifiers(Integer nbInvalidIdentifiers) {
    
    this.nbInvalidIdentifiers = nbInvalidIdentifiers;
    return this;
  }

   /**
   * How many identifiers were invalid for the specified schema
   * @return nbInvalidIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many identifiers were invalid for the specified schema")

  public Integer getNbInvalidIdentifiers() {
    return nbInvalidIdentifiers;
  }


  public void setNbInvalidIdentifiers(Integer nbInvalidIdentifiers) {
    this.nbInvalidIdentifiers = nbInvalidIdentifiers;
  }


  public ContactlistOperationAttributes sampleInvalidIdentifiers(List<String> sampleInvalidIdentifiers) {
    
    this.sampleInvalidIdentifiers = sampleInvalidIdentifiers;
    return this;
  }

  public ContactlistOperationAttributes addSampleInvalidIdentifiersItem(String sampleInvalidIdentifiersItem) {
    if (this.sampleInvalidIdentifiers == null) {
      this.sampleInvalidIdentifiers = new ArrayList<>();
    }
    this.sampleInvalidIdentifiers.add(sampleInvalidIdentifiersItem);
    return this;
  }

   /**
   * A sample of invalid identifiers if there is some
   * @return sampleInvalidIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A sample of invalid identifiers if there is some")

  public List<String> getSampleInvalidIdentifiers() {
    return sampleInvalidIdentifiers;
  }


  public void setSampleInvalidIdentifiers(List<String> sampleInvalidIdentifiers) {
    this.sampleInvalidIdentifiers = sampleInvalidIdentifiers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactlistOperationAttributes contactlistOperationAttributes = (ContactlistOperationAttributes) o;
    return Objects.equals(this.contactListId, contactlistOperationAttributes.contactListId) &&
        Objects.equals(this.operation, contactlistOperationAttributes.operation) &&
        Objects.equals(this.requestDate, contactlistOperationAttributes.requestDate) &&
        Objects.equals(this.identifierType, contactlistOperationAttributes.identifierType) &&
        Objects.equals(this.nbValidIdentifiers, contactlistOperationAttributes.nbValidIdentifiers) &&
        Objects.equals(this.nbInvalidIdentifiers, contactlistOperationAttributes.nbInvalidIdentifiers) &&
        Objects.equals(this.sampleInvalidIdentifiers, contactlistOperationAttributes.sampleInvalidIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactListId, operation, requestDate, identifierType, nbValidIdentifiers, nbInvalidIdentifiers, sampleInvalidIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactlistOperationAttributes {\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    nbValidIdentifiers: ").append(toIndentedString(nbValidIdentifiers)).append("\n");
    sb.append("    nbInvalidIdentifiers: ").append(toIndentedString(nbInvalidIdentifiers)).append("\n");
    sb.append("    sampleInvalidIdentifiers: ").append(toIndentedString(sampleInvalidIdentifiers)).append("\n");
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

}

