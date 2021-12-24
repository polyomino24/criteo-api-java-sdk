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
import java.util.ArrayList;
import java.util.List;

/**
 * The attributes specific to create or update a Dynamic creative
 */
@ApiModel(description = "The attributes specific to create or update a Dynamic creative")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicWriteAttributes {
  public static final String SERIALIZED_NAME_LOGO_BASE64_STRING = "logoBase64String";
  @SerializedName(SERIALIZED_NAME_LOGO_BASE64_STRING)
  private String logoBase64String;

  public static final String SERIALIZED_NAME_CREATIVE_BACKGROUND_COLOR = "creativeBackgroundColor";
  @SerializedName(SERIALIZED_NAME_CREATIVE_BACKGROUND_COLOR)
  private String creativeBackgroundColor;

  public static final String SERIALIZED_NAME_BODY_TEXT_COLOR = "bodyTextColor";
  @SerializedName(SERIALIZED_NAME_BODY_TEXT_COLOR)
  private String bodyTextColor;

  public static final String SERIALIZED_NAME_PRICES_COLOR = "pricesColor";
  @SerializedName(SERIALIZED_NAME_PRICES_COLOR)
  private String pricesColor;

  public static final String SERIALIZED_NAME_PRIMARY_FONT = "primaryFont";
  @SerializedName(SERIALIZED_NAME_PRIMARY_FONT)
  private String primaryFont;

  public static final String SERIALIZED_NAME_CALLS_TO_ACTION = "callsToAction";
  @SerializedName(SERIALIZED_NAME_CALLS_TO_ACTION)
  private List<String> callsToAction = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_DISPLAY = "productImageDisplay";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_DISPLAY)
  private String productImageDisplay;


  public DynamicWriteAttributes logoBase64String(String logoBase64String) {
    
    this.logoBase64String = logoBase64String;
    return this;
  }

   /**
   * Logo image as a base-64 encoded string
   * @return logoBase64String
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Logo image as a base-64 encoded string")

  public String getLogoBase64String() {
    return logoBase64String;
  }


  public void setLogoBase64String(String logoBase64String) {
    this.logoBase64String = logoBase64String;
  }


  public DynamicWriteAttributes creativeBackgroundColor(String creativeBackgroundColor) {
    
    this.creativeBackgroundColor = creativeBackgroundColor;
    return this;
  }

   /**
   * Color of the creative&#39;s background  Valid hexadecimal color (e.g. \&quot;AB00FF\&quot;)
   * @return creativeBackgroundColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color of the creative's background  Valid hexadecimal color (e.g. \"AB00FF\")")

  public String getCreativeBackgroundColor() {
    return creativeBackgroundColor;
  }


  public void setCreativeBackgroundColor(String creativeBackgroundColor) {
    this.creativeBackgroundColor = creativeBackgroundColor;
  }


  public DynamicWriteAttributes bodyTextColor(String bodyTextColor) {
    
    this.bodyTextColor = bodyTextColor;
    return this;
  }

   /**
   * Color of the creative&#39;s body text  Valid hexadecimal color (e.g. \&quot;AB00FF\&quot;)
   * @return bodyTextColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color of the creative's body text  Valid hexadecimal color (e.g. \"AB00FF\")")

  public String getBodyTextColor() {
    return bodyTextColor;
  }


  public void setBodyTextColor(String bodyTextColor) {
    this.bodyTextColor = bodyTextColor;
  }


  public DynamicWriteAttributes pricesColor(String pricesColor) {
    
    this.pricesColor = pricesColor;
    return this;
  }

   /**
   * Color of the creative&#39;s prices  Valid hexadecimal color (e.g. \&quot;AB00FF\&quot;)
   * @return pricesColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color of the creative's prices  Valid hexadecimal color (e.g. \"AB00FF\")")

  public String getPricesColor() {
    return pricesColor;
  }


  public void setPricesColor(String pricesColor) {
    this.pricesColor = pricesColor;
  }


  public DynamicWriteAttributes primaryFont(String primaryFont) {
    
    this.primaryFont = primaryFont;
    return this;
  }

   /**
   * Font of the primary font  Valid supported font like \&quot;Arial\&quot;
   * @return primaryFont
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font of the primary font  Valid supported font like \"Arial\"")

  public String getPrimaryFont() {
    return primaryFont;
  }


  public void setPrimaryFont(String primaryFont) {
    this.primaryFont = primaryFont;
  }


  public DynamicWriteAttributes callsToAction(List<String> callsToAction) {
    
    this.callsToAction = callsToAction;
    return this;
  }

  public DynamicWriteAttributes addCallsToActionItem(String callsToActionItem) {
    if (this.callsToAction == null) {
      this.callsToAction = new ArrayList<>();
    }
    this.callsToAction.add(callsToActionItem);
    return this;
  }

   /**
   * A Call-to-Action (CTA) is an action-driven instruction to your audience intended to provoke an immediate  response, such as “Buy now” or “Go!”.
   * @return callsToAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Call-to-Action (CTA) is an action-driven instruction to your audience intended to provoke an immediate  response, such as “Buy now” or “Go!”.")

  public List<String> getCallsToAction() {
    return callsToAction;
  }


  public void setCallsToAction(List<String> callsToAction) {
    this.callsToAction = callsToAction;
  }


  public DynamicWriteAttributes productImageDisplay(String productImageDisplay) {
    
    this.productImageDisplay = productImageDisplay;
    return this;
  }

   /**
   * Value can be \&quot;ShowFullImage\&quot; or \&quot;ZoomOnImage\&quot;. Choose whether your product catalog images should fit inside the allocated  space (\&quot;ShowFullImage\&quot;) or whether they should fill that space (\&quot;ZoomOnImage\&quot;). If you choose ZoomOnImage, there may be some  image cropping.
   * @return productImageDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value can be \"ShowFullImage\" or \"ZoomOnImage\". Choose whether your product catalog images should fit inside the allocated  space (\"ShowFullImage\") or whether they should fill that space (\"ZoomOnImage\"). If you choose ZoomOnImage, there may be some  image cropping.")

  public String getProductImageDisplay() {
    return productImageDisplay;
  }


  public void setProductImageDisplay(String productImageDisplay) {
    this.productImageDisplay = productImageDisplay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicWriteAttributes dynamicWriteAttributes = (DynamicWriteAttributes) o;
    return Objects.equals(this.logoBase64String, dynamicWriteAttributes.logoBase64String) &&
        Objects.equals(this.creativeBackgroundColor, dynamicWriteAttributes.creativeBackgroundColor) &&
        Objects.equals(this.bodyTextColor, dynamicWriteAttributes.bodyTextColor) &&
        Objects.equals(this.pricesColor, dynamicWriteAttributes.pricesColor) &&
        Objects.equals(this.primaryFont, dynamicWriteAttributes.primaryFont) &&
        Objects.equals(this.callsToAction, dynamicWriteAttributes.callsToAction) &&
        Objects.equals(this.productImageDisplay, dynamicWriteAttributes.productImageDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoBase64String, creativeBackgroundColor, bodyTextColor, pricesColor, primaryFont, callsToAction, productImageDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicWriteAttributes {\n");
    sb.append("    logoBase64String: ").append(toIndentedString(logoBase64String)).append("\n");
    sb.append("    creativeBackgroundColor: ").append(toIndentedString(creativeBackgroundColor)).append("\n");
    sb.append("    bodyTextColor: ").append(toIndentedString(bodyTextColor)).append("\n");
    sb.append("    pricesColor: ").append(toIndentedString(pricesColor)).append("\n");
    sb.append("    primaryFont: ").append(toIndentedString(primaryFont)).append("\n");
    sb.append("    callsToAction: ").append(toIndentedString(callsToAction)).append("\n");
    sb.append("    productImageDisplay: ").append(toIndentedString(productImageDisplay)).append("\n");
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

