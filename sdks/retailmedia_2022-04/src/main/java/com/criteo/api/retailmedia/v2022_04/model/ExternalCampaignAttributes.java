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


package com.criteo.api.retailmedia.v2022_04.model;

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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * An object that represents the available options to set when creating a Retail Media Campaign
 */
@ApiModel(description = "An object that represents the available options to set when creating a Retail Media Campaign")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalCampaignAttributes {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("unknown"),
    
    AUCTION("auction"),
    
    PREFERRED("preferred");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.AUCTION;

  public static final String SERIALIZED_NAME_DRAWABLE_BALANCE_IDS = "drawableBalanceIds";
  @SerializedName(SERIALIZED_NAME_DRAWABLE_BALANCE_IDS)
  private List<String> drawableBalanceIds = null;

  /**
   * Gets or Sets clickAttributionWindow
   */
  @JsonAdapter(ClickAttributionWindowEnum.Adapter.class)
  public enum ClickAttributionWindowEnum {
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D"),
    
    UNKNOWN("unknown");

    private String value;

    ClickAttributionWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClickAttributionWindowEnum fromValue(String value) {
      for (ClickAttributionWindowEnum b : ClickAttributionWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClickAttributionWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClickAttributionWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClickAttributionWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClickAttributionWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLICK_ATTRIBUTION_WINDOW = "clickAttributionWindow";
  @SerializedName(SERIALIZED_NAME_CLICK_ATTRIBUTION_WINDOW)
  private ClickAttributionWindowEnum clickAttributionWindow = ClickAttributionWindowEnum._30D;

  /**
   * Gets or Sets viewAttributionWindow
   */
  @JsonAdapter(ViewAttributionWindowEnum.Adapter.class)
  public enum ViewAttributionWindowEnum {
    NONE("none"),
    
    _1D("1D"),
    
    _7D("7D"),
    
    _14D("14D"),
    
    _30D("30D"),
    
    UNKNOWN("unknown");

    private String value;

    ViewAttributionWindowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewAttributionWindowEnum fromValue(String value) {
      for (ViewAttributionWindowEnum b : ViewAttributionWindowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewAttributionWindowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewAttributionWindowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewAttributionWindowEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewAttributionWindowEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIEW_ATTRIBUTION_WINDOW = "viewAttributionWindow";
  @SerializedName(SERIALIZED_NAME_VIEW_ATTRIBUTION_WINDOW)
  private ViewAttributionWindowEnum viewAttributionWindow = ViewAttributionWindowEnum.NONE;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private BigDecimal budget;

  /**
   * Gets or Sets clickAttributionScope
   */
  @JsonAdapter(ClickAttributionScopeEnum.Adapter.class)
  public enum ClickAttributionScopeEnum {
    UNKNOWN("unknown"),
    
    SAMESKU("sameSku"),
    
    SAMESKUCATEGORY("sameSkuCategory"),
    
    SAMESKUCATEGORYBRAND("sameSkuCategoryBrand");

    private String value;

    ClickAttributionScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClickAttributionScopeEnum fromValue(String value) {
      for (ClickAttributionScopeEnum b : ClickAttributionScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClickAttributionScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClickAttributionScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClickAttributionScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClickAttributionScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLICK_ATTRIBUTION_SCOPE = "clickAttributionScope";
  @SerializedName(SERIALIZED_NAME_CLICK_ATTRIBUTION_SCOPE)
  private ClickAttributionScopeEnum clickAttributionScope;

  /**
   * Gets or Sets viewAttributionScope
   */
  @JsonAdapter(ViewAttributionScopeEnum.Adapter.class)
  public enum ViewAttributionScopeEnum {
    UNKNOWN("unknown"),
    
    SAMESKU("sameSku"),
    
    SAMESKUCATEGORY("sameSkuCategory"),
    
    SAMESKUCATEGORYBRAND("sameSkuCategoryBrand");

    private String value;

    ViewAttributionScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewAttributionScopeEnum fromValue(String value) {
      for (ViewAttributionScopeEnum b : ViewAttributionScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewAttributionScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewAttributionScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewAttributionScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewAttributionScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIEW_ATTRIBUTION_SCOPE = "viewAttributionScope";
  @SerializedName(SERIALIZED_NAME_VIEW_ATTRIBUTION_SCOPE)
  private ViewAttributionScopeEnum viewAttributionScope;


  public ExternalCampaignAttributes type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ExternalCampaignAttributes drawableBalanceIds(List<String> drawableBalanceIds) {
    
    this.drawableBalanceIds = drawableBalanceIds;
    return this;
  }

  public ExternalCampaignAttributes addDrawableBalanceIdsItem(String drawableBalanceIdsItem) {
    if (this.drawableBalanceIds == null) {
      this.drawableBalanceIds = new ArrayList<>();
    }
    this.drawableBalanceIds.add(drawableBalanceIdsItem);
    return this;
  }

   /**
   * Get drawableBalanceIds
   * @return drawableBalanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDrawableBalanceIds() {
    return drawableBalanceIds;
  }


  public void setDrawableBalanceIds(List<String> drawableBalanceIds) {
    this.drawableBalanceIds = drawableBalanceIds;
  }


  public ExternalCampaignAttributes clickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    
    this.clickAttributionWindow = clickAttributionWindow;
    return this;
  }

   /**
   * Get clickAttributionWindow
   * @return clickAttributionWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClickAttributionWindowEnum getClickAttributionWindow() {
    return clickAttributionWindow;
  }


  public void setClickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
  }


  public ExternalCampaignAttributes viewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    
    this.viewAttributionWindow = viewAttributionWindow;
    return this;
  }

   /**
   * Get viewAttributionWindow
   * @return viewAttributionWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ViewAttributionWindowEnum getViewAttributionWindow() {
    return viewAttributionWindow;
  }


  public void setViewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
  }


  public ExternalCampaignAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExternalCampaignAttributes budget(BigDecimal budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBudget() {
    return budget;
  }


  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }


  public ExternalCampaignAttributes clickAttributionScope(ClickAttributionScopeEnum clickAttributionScope) {
    
    this.clickAttributionScope = clickAttributionScope;
    return this;
  }

   /**
   * Get clickAttributionScope
   * @return clickAttributionScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClickAttributionScopeEnum getClickAttributionScope() {
    return clickAttributionScope;
  }


  public void setClickAttributionScope(ClickAttributionScopeEnum clickAttributionScope) {
    this.clickAttributionScope = clickAttributionScope;
  }


  public ExternalCampaignAttributes viewAttributionScope(ViewAttributionScopeEnum viewAttributionScope) {
    
    this.viewAttributionScope = viewAttributionScope;
    return this;
  }

   /**
   * Get viewAttributionScope
   * @return viewAttributionScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ViewAttributionScopeEnum getViewAttributionScope() {
    return viewAttributionScope;
  }


  public void setViewAttributionScope(ViewAttributionScopeEnum viewAttributionScope) {
    this.viewAttributionScope = viewAttributionScope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalCampaignAttributes externalCampaignAttributes = (ExternalCampaignAttributes) o;
    return Objects.equals(this.type, externalCampaignAttributes.type) &&
        Objects.equals(this.drawableBalanceIds, externalCampaignAttributes.drawableBalanceIds) &&
        Objects.equals(this.clickAttributionWindow, externalCampaignAttributes.clickAttributionWindow) &&
        Objects.equals(this.viewAttributionWindow, externalCampaignAttributes.viewAttributionWindow) &&
        Objects.equals(this.name, externalCampaignAttributes.name) &&
        Objects.equals(this.budget, externalCampaignAttributes.budget) &&
        Objects.equals(this.clickAttributionScope, externalCampaignAttributes.clickAttributionScope) &&
        Objects.equals(this.viewAttributionScope, externalCampaignAttributes.viewAttributionScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, drawableBalanceIds, clickAttributionWindow, viewAttributionWindow, name, budget, clickAttributionScope, viewAttributionScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalCampaignAttributes {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    drawableBalanceIds: ").append(toIndentedString(drawableBalanceIds)).append("\n");
    sb.append("    clickAttributionWindow: ").append(toIndentedString(clickAttributionWindow)).append("\n");
    sb.append("    viewAttributionWindow: ").append(toIndentedString(viewAttributionWindow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    clickAttributionScope: ").append(toIndentedString(clickAttributionScope)).append("\n");
    sb.append("    viewAttributionScope: ").append(toIndentedString(viewAttributionScope)).append("\n");
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

