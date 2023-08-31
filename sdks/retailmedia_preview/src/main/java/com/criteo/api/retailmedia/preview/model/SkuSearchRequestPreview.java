/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview.model;

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

import com.criteo.api.retailmedia.preview.JSON;

/**
 * A request for sku by sellers or brands.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SkuSearchRequestPreview {
  public static final String SERIALIZED_NAME_QUERY_STRING = "queryString";
  @SerializedName(SERIALIZED_NAME_QUERY_STRING)
  private String queryString;

  public static final String SERIALIZED_NAME_RETAILER_ID = "retailerId";
  @SerializedName(SERIALIZED_NAME_RETAILER_ID)
  private String retailerId;

  public static final String SERIALIZED_NAME_SELLERS = "sellers";
  @SerializedName(SERIALIZED_NAME_SELLERS)
  private List<String> sellers = null;

  public static final String SERIALIZED_NAME_BRAND_IDS = "brandIds";
  @SerializedName(SERIALIZED_NAME_BRAND_IDS)
  private List<String> brandIds = null;

  /**
   * Enum to set isSellerSku field
   */
  @JsonAdapter(SkuTypeEnum.Adapter.class)
  public enum SkuTypeEnum {
    BRAND("brand"),
    
    SELLER("seller"),
    
    ALL("all");

    private String value;

    SkuTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SkuTypeEnum fromValue(String value) {
      for (SkuTypeEnum b : SkuTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SkuTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SkuTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SkuTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SkuTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SKU_TYPE = "skuType";
  @SerializedName(SERIALIZED_NAME_SKU_TYPE)
  private SkuTypeEnum skuType = SkuTypeEnum.BRAND;

  /**
   * Type of product Ids to search for(SkuKey, SkuId, Gtin, Mpn, Model, ParentId)
   */
  @JsonAdapter(ProductIdTypeEnum.Adapter.class)
  public enum ProductIdTypeEnum {
    SKUKEY("skuKey"),
    
    GTIN("gtin"),
    
    MPN("mpn"),
    
    MODEL("model"),
    
    SKUID("skuId"),
    
    PARENTID("parentId");

    private String value;

    ProductIdTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductIdTypeEnum fromValue(String value) {
      for (ProductIdTypeEnum b : ProductIdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProductIdTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductIdTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductIdTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProductIdTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRODUCT_ID_TYPE = "productIdType";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID_TYPE)
  private ProductIdTypeEnum productIdType = ProductIdTypeEnum.SKUKEY;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "productIds";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<String> productIds = null;

  public SkuSearchRequestPreview() {
  }

  public SkuSearchRequestPreview queryString(String queryString) {
    
    this.queryString = queryString;
    return this;
  }

   /**
   * Query string to search for across SKU&#39;s properties (gtin, mpn, feed ID, Title, and Description)
   * @return queryString
  **/
  @javax.annotation.Nonnull

  public String getQueryString() {
    return queryString;
  }


  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  public SkuSearchRequestPreview retailerId(String retailerId) {
    
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Retailer Id
   * @return retailerId
  **/
  @javax.annotation.Nonnull

  public String getRetailerId() {
    return retailerId;
  }


  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }


  public SkuSearchRequestPreview sellers(List<String> sellers) {
    
    this.sellers = sellers;
    return this;
  }

  public SkuSearchRequestPreview addSellersItem(String sellersItem) {
    if (this.sellers == null) {
      this.sellers = new ArrayList<>();
    }
    this.sellers.add(sellersItem);
    return this;
  }

   /**
   * A list of seller names and/or seller Id&#39;s
   * @return sellers
  **/
  @javax.annotation.Nullable

  public List<String> getSellers() {
    return sellers;
  }


  public void setSellers(List<String> sellers) {
    this.sellers = sellers;
  }


  public SkuSearchRequestPreview brandIds(List<String> brandIds) {
    
    this.brandIds = brandIds;
    return this;
  }

  public SkuSearchRequestPreview addBrandIdsItem(String brandIdsItem) {
    if (this.brandIds == null) {
      this.brandIds = new ArrayList<>();
    }
    this.brandIds.add(brandIdsItem);
    return this;
  }

   /**
   * A list of brand Id&#39;s
   * @return brandIds
  **/
  @javax.annotation.Nullable

  public List<String> getBrandIds() {
    return brandIds;
  }


  public void setBrandIds(List<String> brandIds) {
    this.brandIds = brandIds;
  }


  public SkuSearchRequestPreview skuType(SkuTypeEnum skuType) {
    
    this.skuType = skuType;
    return this;
  }

   /**
   * Enum to set isSellerSku field
   * @return skuType
  **/
  @javax.annotation.Nullable

  public SkuTypeEnum getSkuType() {
    return skuType;
  }


  public void setSkuType(SkuTypeEnum skuType) {
    this.skuType = skuType;
  }


  public SkuSearchRequestPreview productIdType(ProductIdTypeEnum productIdType) {
    
    this.productIdType = productIdType;
    return this;
  }

   /**
   * Type of product Ids to search for(SkuKey, SkuId, Gtin, Mpn, Model, ParentId)
   * @return productIdType
  **/
  @javax.annotation.Nullable

  public ProductIdTypeEnum getProductIdType() {
    return productIdType;
  }


  public void setProductIdType(ProductIdTypeEnum productIdType) {
    this.productIdType = productIdType;
  }


  public SkuSearchRequestPreview productIds(List<String> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public SkuSearchRequestPreview addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * A list of product Id&#39;s, if not passed ignore and search by QueryString
   * @return productIds
  **/
  @javax.annotation.Nullable

  public List<String> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
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
   * @return the SkuSearchRequestPreview instance itself
   */
  public SkuSearchRequestPreview putAdditionalProperty(String key, Object value) {
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
    SkuSearchRequestPreview skuSearchRequestPreview = (SkuSearchRequestPreview) o;
    return Objects.equals(this.queryString, skuSearchRequestPreview.queryString) &&
        Objects.equals(this.retailerId, skuSearchRequestPreview.retailerId) &&
        Objects.equals(this.sellers, skuSearchRequestPreview.sellers) &&
        Objects.equals(this.brandIds, skuSearchRequestPreview.brandIds) &&
        Objects.equals(this.skuType, skuSearchRequestPreview.skuType) &&
        Objects.equals(this.productIdType, skuSearchRequestPreview.productIdType) &&
        Objects.equals(this.productIds, skuSearchRequestPreview.productIds)&&
        Objects.equals(this.additionalProperties, skuSearchRequestPreview.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryString, retailerId, sellers, brandIds, skuType, productIdType, productIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuSearchRequestPreview {\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    sellers: ").append(toIndentedString(sellers)).append("\n");
    sb.append("    brandIds: ").append(toIndentedString(brandIds)).append("\n");
    sb.append("    skuType: ").append(toIndentedString(skuType)).append("\n");
    sb.append("    productIdType: ").append(toIndentedString(productIdType)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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
    openapiFields.add("queryString");
    openapiFields.add("retailerId");
    openapiFields.add("sellers");
    openapiFields.add("brandIds");
    openapiFields.add("skuType");
    openapiFields.add("productIdType");
    openapiFields.add("productIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("queryString");
    openapiRequiredFields.add("retailerId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkuSearchRequestPreview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkuSearchRequestPreview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkuSearchRequestPreview is not found in the empty JSON string", SkuSearchRequestPreview.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SkuSearchRequestPreview.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("queryString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queryString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queryString").toString()));
      }
      if (!jsonObj.get("retailerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retailerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retailerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sellers") != null && !jsonObj.get("sellers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellers` to be an array in the JSON string but got `%s`", jsonObj.get("sellers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("brandIds") != null && !jsonObj.get("brandIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandIds` to be an array in the JSON string but got `%s`", jsonObj.get("brandIds").toString()));
      }
      if ((jsonObj.get("skuType") != null && !jsonObj.get("skuType").isJsonNull()) && !jsonObj.get("skuType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skuType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skuType").toString()));
      }
      if ((jsonObj.get("productIdType") != null && !jsonObj.get("productIdType").isJsonNull()) && !jsonObj.get("productIdType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productIdType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productIdType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("productIds") != null && !jsonObj.get("productIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productIds` to be an array in the JSON string but got `%s`", jsonObj.get("productIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkuSearchRequestPreview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkuSearchRequestPreview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkuSearchRequestPreview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkuSearchRequestPreview.class));

       return (TypeAdapter<T>) new TypeAdapter<SkuSearchRequestPreview>() {
           @Override
           public void write(JsonWriter out, SkuSearchRequestPreview value) throws IOException {
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
           public SkuSearchRequestPreview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkuSearchRequestPreview instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkuSearchRequestPreview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkuSearchRequestPreview
  * @throws IOException if the JSON string is invalid with respect to SkuSearchRequestPreview
  */
  public static SkuSearchRequestPreview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkuSearchRequestPreview.class);
  }

 /**
  * Convert an instance of SkuSearchRequestPreview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

