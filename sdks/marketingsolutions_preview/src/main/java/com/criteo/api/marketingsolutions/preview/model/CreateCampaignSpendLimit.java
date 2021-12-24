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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * campaign spend limit create model
 */
@ApiModel(description = "campaign spend limit create model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCampaignSpendLimit {
  /**
   * Whether your spend limit is capped or not
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
   * The pace of the spend limit renewal
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
  private Double spendLimitAmount;


  public CreateCampaignSpendLimit spendLimitType(SpendLimitTypeEnum spendLimitType) {
    
    this.spendLimitType = spendLimitType;
    return this;
  }

   /**
   * Whether your spend limit is capped or not
   * @return spendLimitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether your spend limit is capped or not")

  public SpendLimitTypeEnum getSpendLimitType() {
    return spendLimitType;
  }


  public void setSpendLimitType(SpendLimitTypeEnum spendLimitType) {
    this.spendLimitType = spendLimitType;
  }


  public CreateCampaignSpendLimit spendLimitRenewal(SpendLimitRenewalEnum spendLimitRenewal) {
    
    this.spendLimitRenewal = spendLimitRenewal;
    return this;
  }

   /**
   * The pace of the spend limit renewal
   * @return spendLimitRenewal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pace of the spend limit renewal")

  public SpendLimitRenewalEnum getSpendLimitRenewal() {
    return spendLimitRenewal;
  }


  public void setSpendLimitRenewal(SpendLimitRenewalEnum spendLimitRenewal) {
    this.spendLimitRenewal = spendLimitRenewal;
  }


  public CreateCampaignSpendLimit spendLimitAmount(Double spendLimitAmount) {
    
    this.spendLimitAmount = spendLimitAmount;
    return this;
  }

   /**
   * The amount of the spend limit. null if spendLimitType is uncapped.
   * @return spendLimitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the spend limit. null if spendLimitType is uncapped.")

  public Double getSpendLimitAmount() {
    return spendLimitAmount;
  }


  public void setSpendLimitAmount(Double spendLimitAmount) {
    this.spendLimitAmount = spendLimitAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCampaignSpendLimit createCampaignSpendLimit = (CreateCampaignSpendLimit) o;
    return Objects.equals(this.spendLimitType, createCampaignSpendLimit.spendLimitType) &&
        Objects.equals(this.spendLimitRenewal, createCampaignSpendLimit.spendLimitRenewal) &&
        Objects.equals(this.spendLimitAmount, createCampaignSpendLimit.spendLimitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spendLimitType, spendLimitRenewal, spendLimitAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCampaignSpendLimit {\n");
    sb.append("    spendLimitType: ").append(toIndentedString(spendLimitType)).append("\n");
    sb.append("    spendLimitRenewal: ").append(toIndentedString(spendLimitRenewal)).append("\n");
    sb.append("    spendLimitAmount: ").append(toIndentedString(spendLimitAmount)).append("\n");
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
