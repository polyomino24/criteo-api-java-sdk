/*
 * Criteo API
 * Criteo publicly exposed API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.v2021_10.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * Parameters needed to create an audience
 */
@ApiModel(description = "Parameters needed to create an audience")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetailMediaAudienceAttributes {
  /**
   * Type of the user
   */
  @JsonAdapter(UserTypeEnum.Adapter.class)
  public enum UserTypeEnum {
    VIEWER("viewer"),
    
    BUYER("buyer");

    private String value;

    UserTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserTypeEnum fromValue(String value) {
      for (UserTypeEnum b : UserTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USER_TYPE = "userType";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private UserTypeEnum userType;

  /**
   * Length of lookback window
   */
  @JsonAdapter(LookbackWindowEnum.Adapter.class)
  public enum LookbackWindowEnum {
    P7D("P7D"),
    
    P14D("P14D"),
    
    P30D("P30D"),
    
    P45D("P45D"),
    
    P60D("P60D"),
    
    P90D("P90D"),
    
    P120D("P120D"),
    
    P150D("P150D"),
    
    P180D("P180D");

    private String value;

    LookbackWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LookbackWindowEnum fromValue(String value) {
      for (LookbackWindowEnum b : LookbackWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LookbackWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LookbackWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LookbackWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LookbackWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOOKBACK_WINDOW = "lookbackWindow";
  @SerializedName(SERIALIZED_NAME_LOOKBACK_WINDOW)
  private LookbackWindowEnum lookbackWindow;

  public static final String SERIALIZED_NAME_BRAND_IDS = "brandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private List<String> brandIds = null;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "categoryIds";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<String> categoryIds = null;

  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private String retailerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public RetailMediaAudienceAttributes userType(UserTypeEnum userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * Type of the user
   * @return userType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "viewer", required = true, value = "Type of the user")

  public UserTypeEnum getUserType() {
    return userType;
  }


  public void setUserType(UserTypeEnum userType) {
    this.userType = userType;
  }


  public RetailMediaAudienceAttributes lookbackWindow(LookbackWindowEnum lookbackWindow) {
    
    this.lookbackWindow = lookbackWindow;
    return this;
  }

   /**
   * Length of lookback window
   * @return lookbackWindow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "P7D", required = true, value = "Length of lookback window")

  public LookbackWindowEnum getLookbackWindow() {
    return lookbackWindow;
  }


  public void setLookbackWindow(LookbackWindowEnum lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }


  public RetailMediaAudienceAttributes brandIds(List<String> brandIds) {
    
    this.brandIds = brandIds;
    return this;
  }

  public RetailMediaAudienceAttributes addBrandIdsItem(String brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new ArrayList<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * The brands to target
   * @return brandIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The brands to target")

  public List<String> getBrandIds() {
    return brandIds;
  }


  public void setBrandIds(List<String> brandIds) {
    this.brandIds = brandIds;
  }


  public RetailMediaAudienceAttributes categoryIds(List<String> categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

  public RetailMediaAudienceAttributes addCategoryIdsItem(String categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * The categories to target
   * @return categoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The categories to target")

  public List<String> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public RetailMediaAudienceAttributes retailerId(String retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * ID of the retailer associated with this audience
   * @return retailerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "68004146450571264", required = true, value = "ID of the retailer associated with this audience")

  public String getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }


  public RetailMediaAudienceAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailMediaAudienceAttributes retailMediaAudienceAttributes = (RetailMediaAudienceAttributes) o;
    return Objects.equals(this.userType, retailMediaAudienceAttributes.userType) &&
        Objects.equals(this.lookbackWindow, retailMediaAudienceAttributes.lookbackWindow) &&
        Objects.equals(this.brandIds, retailMediaAudienceAttributes.brandIds) &&
        Objects.equals(this.categoryIds, retailMediaAudienceAttributes.categoryIds) &&
        Objects.equals(this.retailerId, retailMediaAudienceAttributes.retailerId) &&
        Objects.equals(this.name, retailMediaAudienceAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userType, lookbackWindow, brandIds, categoryIds, retailerId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailMediaAudienceAttributes {\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

