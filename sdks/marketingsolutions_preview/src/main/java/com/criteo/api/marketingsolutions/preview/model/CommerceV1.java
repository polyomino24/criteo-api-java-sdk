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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Settings to target users based on high shopping intents and demographics.
 */
@ApiModel(description = "Settings to target users based on high shopping intents and demographics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommerceV1 {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  /**
   * Gets or Sets buyingPower
   */
  @JsonAdapter(BuyingPowerEnum.Adapter.class)
  public enum BuyingPowerEnum {
    UNKNOWN("Unknown"),
    
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High"),
    
    VERYHIGH("VeryHigh");

    private String value;

    BuyingPowerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BuyingPowerEnum fromValue(String value) {
      for (BuyingPowerEnum b : BuyingPowerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BuyingPowerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BuyingPowerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BuyingPowerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BuyingPowerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUYING_POWER = "buyingPower";
  @SerializedName(SERIALIZED_NAME_BUYING_POWER)
  private Set<BuyingPowerEnum> buyingPower = null;

  /**
   * Reach people who’ve shown interest in products made for a specific gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    UNKNOWN("Unknown"),
    
    MALE("Male"),
    
    FEMALE("Female");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_INTEREST_IDS = "interestIds";
  @SerializedName(SERIALIZED_NAME_INTEREST_IDS)
  private Set<String> interestIds = null;

  public static final String SERIALIZED_NAME_BRAND_IDS = "brandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private Set<String> brandIds = null;

  /**
   * Gets or Sets priceRange
   */
  @JsonAdapter(PriceRangeEnum.Adapter.class)
  public enum PriceRangeEnum {
    UNKNOWN("Unknown"),
    
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High");

    private String value;

    PriceRangeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriceRangeEnum fromValue(String value) {
      for (PriceRangeEnum b : PriceRangeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PriceRangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriceRangeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriceRangeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PriceRangeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRICE_RANGE = "priceRange";
  @SerializedName(SERIALIZED_NAME_PRICE_RANGE)
  private Set<PriceRangeEnum> priceRange = null;


  public CommerceV1 country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Reach people of a specific country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reach people of a specific country")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CommerceV1 buyingPower(Set<BuyingPowerEnum> buyingPower) {
    
    this.buyingPower = buyingPower;
    return this;
  }

  public CommerceV1 addBuyingPowerItem(BuyingPowerEnum buyingPowerItem) {
    if (this.buyingPower == null) {
      this.buyingPower = new LinkedHashSet<>();
    }
    this.buyingPower.add(buyingPowerItem);
    return this;
  }

   /**
   * Reach people who frequently purchase high price range items to lower price range items
   * @return buyingPower
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reach people who frequently purchase high price range items to lower price range items")

  public Set<BuyingPowerEnum> getBuyingPower() {
    return buyingPower;
  }


  public void setBuyingPower(Set<BuyingPowerEnum> buyingPower) {
    this.buyingPower = buyingPower;
  }


  public CommerceV1 gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Reach people who’ve shown interest in products made for a specific gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reach people who’ve shown interest in products made for a specific gender")

  public GenderEnum getGender() {
    return gender;
  }


  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public CommerceV1 interestIds(Set<String> interestIds) {
    
    this.interestIds = interestIds;
    return this;
  }

  public CommerceV1 addInterestIdsItem(String interestIdsItem) {
    if (this.interestIds == null) {
      this.interestIds = new LinkedHashSet<>();
    }
    this.interestIds.add(interestIdsItem);
    return this;
  }

   /**
   * Reach new people based on their interests
   * @return interestIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reach new people based on their interests")

  public Set<String> getInterestIds() {
    return interestIds;
  }


  public void setInterestIds(Set<String> interestIds) {
    this.interestIds = interestIds;
  }


  public CommerceV1 brandIds(Set<String> brandIds) {
    
    this.brandIds = brandIds;
    return this;
  }

  public CommerceV1 addBrandIdsItem(String brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new LinkedHashSet<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * Choose the brands your segment might be interested in
   * @return brandIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Choose the brands your segment might be interested in")

  public Set<String> getBrandIds() {
    return brandIds;
  }


  public void setBrandIds(Set<String> brandIds) {
    this.brandIds = brandIds;
  }


  public CommerceV1 priceRange(Set<PriceRangeEnum> priceRange) {
    
    this.priceRange = priceRange;
    return this;
  }

  public CommerceV1 addPriceRangeItem(PriceRangeEnum priceRangeItem) {
    if (this.priceRange == null) {
      this.priceRange = new LinkedHashSet<>();
    }
    this.priceRange.add(priceRangeItem);
    return this;
  }

   /**
   * Reach people who’ve shown interest in products within a specific price range
   * @return priceRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reach people who’ve shown interest in products within a specific price range")

  public Set<PriceRangeEnum> getPriceRange() {
    return priceRange;
  }


  public void setPriceRange(Set<PriceRangeEnum> priceRange) {
    this.priceRange = priceRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceV1 commerceV1 = (CommerceV1) o;
    return Objects.equals(this.country, commerceV1.country) &&
        Objects.equals(this.buyingPower, commerceV1.buyingPower) &&
        Objects.equals(this.gender, commerceV1.gender) &&
        Objects.equals(this.interestIds, commerceV1.interestIds) &&
        Objects.equals(this.brandIds, commerceV1.brandIds) &&
        Objects.equals(this.priceRange, commerceV1.priceRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, buyingPower, gender, interestIds, brandIds, priceRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceV1 {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    buyingPower: ").append(toIndentedString(buyingPower)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestIds: ").append(toIndentedString(interestIds)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    priceRange: ").append(toIndentedString(priceRange)).append("\n");
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
