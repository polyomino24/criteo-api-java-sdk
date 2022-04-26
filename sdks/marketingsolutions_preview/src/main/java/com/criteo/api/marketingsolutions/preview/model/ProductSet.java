/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.preview.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.preview.model.ProductSetRule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulate a group of product
 */
@ApiModel(description = "Encapsulate a group of product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductSet {
  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The status of the product set
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("Unknown"),
    
    DRAFT("Draft"),
    
    PENDING("Pending"),
    
    VALID("Valid"),
    
    INVALID("Invalid"),
    
    DELETED("Deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_NUMBER_OF_PRODUCTS = "numberOfProducts";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PRODUCTS)
  private Integer numberOfProducts;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<ProductSetRule> rules = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public ProductSet partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * The partner to which the product set belong
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The partner to which the product set belong")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public ProductSet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the product set
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the product set")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductSet status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the product set
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the product set")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ProductSet isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * True if the product set is active
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the product set is active")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public ProductSet numberOfProducts(Integer numberOfProducts) {
    
    this.numberOfProducts = numberOfProducts;
    return this;
  }

   /**
   * The number of product matching the product set
   * @return numberOfProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of product matching the product set")

  public Integer getNumberOfProducts() {
    return numberOfProducts;
  }


  public void setNumberOfProducts(Integer numberOfProducts) {
    this.numberOfProducts = numberOfProducts;
  }


  public ProductSet creationDate(String creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Optional: The creation date of the product set (UTC time in ISO8601 format). Example: \&quot;02/25/2022 14:51:26\&quot;  Can be null if the value doesn&#39;t exist.
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: The creation date of the product set (UTC time in ISO8601 format). Example: \"02/25/2022 14:51:26\"  Can be null if the value doesn't exist.")

  public String getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public ProductSet rules(List<ProductSetRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public ProductSet addRulesItem(ProductSetRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The rules identifying the product belonging to the set
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rules identifying the product belonging to the set")

  public List<ProductSetRule> getRules() {
    return rules;
  }


  public void setRules(List<ProductSetRule> rules) {
    this.rules = rules;
  }


  public ProductSet id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSet productSet = (ProductSet) o;
    return Objects.equals(this.partnerId, productSet.partnerId) &&
        Objects.equals(this.name, productSet.name) &&
        Objects.equals(this.status, productSet.status) &&
        Objects.equals(this.isEnabled, productSet.isEnabled) &&
        Objects.equals(this.numberOfProducts, productSet.numberOfProducts) &&
        Objects.equals(this.creationDate, productSet.creationDate) &&
        Objects.equals(this.rules, productSet.rules) &&
        Objects.equals(this.id, productSet.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, name, status, isEnabled, numberOfProducts, creationDate, rules, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSet {\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    numberOfProducts: ").append(toIndentedString(numberOfProducts)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

