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


package com.criteo.api.retailmedia.preview.model;

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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A Retail Media Campaign used to represent an advertiser&#39;s marketing objective
 */
@ApiModel(description = "A Retail Media Campaign used to represent an advertiser's marketing objective")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalCampaign {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_PROMOTED_BRAND_IDS = "promotedBrandIds";
  @SerializedName(SERIALIZED_NAME_PROMOTED_BRAND_IDS)
  private List<String> promotedBrandIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUDGET_SPENT = "budgetSpent";
  @SerializedName(SERIALIZED_NAME_BUDGET_SPENT)
  private BigDecimal budgetSpent;

  public static final String SERIALIZED_NAME_BUDGET_REMAINING = "budgetRemaining";
  @SerializedName(SERIALIZED_NAME_BUDGET_REMAINING)
  private BigDecimal budgetRemaining;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    ACTIVE("active"),
    
    INACTIVE("inactive");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

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


  public ExternalCampaign accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ExternalCampaign promotedBrandIds(List<String> promotedBrandIds) {
    
    this.promotedBrandIds = promotedBrandIds;
    return this;
  }

  public ExternalCampaign addPromotedBrandIdsItem(String promotedBrandIdsItem) {
    this.promotedBrandIds.add(promotedBrandIdsItem);
    return this;
  }

   /**
   * Get promotedBrandIds
   * @return promotedBrandIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getPromotedBrandIds() {
    return promotedBrandIds;
  }


  public void setPromotedBrandIds(List<String> promotedBrandIds) {
    this.promotedBrandIds = promotedBrandIds;
  }


  public ExternalCampaign budgetSpent(BigDecimal budgetSpent) {
    
    this.budgetSpent = budgetSpent;
    return this;
  }

   /**
   * Get budgetSpent
   * @return budgetSpent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getBudgetSpent() {
    return budgetSpent;
  }


  public void setBudgetSpent(BigDecimal budgetSpent) {
    this.budgetSpent = budgetSpent;
  }


  public ExternalCampaign budgetRemaining(BigDecimal budgetRemaining) {
    
    this.budgetRemaining = budgetRemaining;
    return this;
  }

   /**
   * Get budgetRemaining
   * @return budgetRemaining
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getBudgetRemaining() {
    return budgetRemaining;
  }


  public void setBudgetRemaining(BigDecimal budgetRemaining) {
    this.budgetRemaining = budgetRemaining;
  }


  public ExternalCampaign status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExternalCampaign createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ExternalCampaign updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ExternalCampaign type(TypeEnum type) {
    
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


  public ExternalCampaign drawableBalanceIds(List<String> drawableBalanceIds) {
    
    this.drawableBalanceIds = drawableBalanceIds;
    return this;
  }

  public ExternalCampaign addDrawableBalanceIdsItem(String drawableBalanceIdsItem) {
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


  public ExternalCampaign clickAttributionWindow(ClickAttributionWindowEnum clickAttributionWindow) {
    
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


  public ExternalCampaign viewAttributionWindow(ViewAttributionWindowEnum viewAttributionWindow) {
    
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


  public ExternalCampaign name(String name) {
    
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


  public ExternalCampaign budget(BigDecimal budget) {
    
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


  public ExternalCampaign clickAttributionScope(ClickAttributionScopeEnum clickAttributionScope) {
    
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


  public ExternalCampaign viewAttributionScope(ViewAttributionScopeEnum viewAttributionScope) {
    
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
    ExternalCampaign externalCampaign = (ExternalCampaign) o;
    return Objects.equals(this.accountId, externalCampaign.accountId) &&
        Objects.equals(this.promotedBrandIds, externalCampaign.promotedBrandIds) &&
        Objects.equals(this.budgetSpent, externalCampaign.budgetSpent) &&
        Objects.equals(this.budgetRemaining, externalCampaign.budgetRemaining) &&
        Objects.equals(this.status, externalCampaign.status) &&
        Objects.equals(this.createdAt, externalCampaign.createdAt) &&
        Objects.equals(this.updatedAt, externalCampaign.updatedAt) &&
        Objects.equals(this.type, externalCampaign.type) &&
        Objects.equals(this.drawableBalanceIds, externalCampaign.drawableBalanceIds) &&
        Objects.equals(this.clickAttributionWindow, externalCampaign.clickAttributionWindow) &&
        Objects.equals(this.viewAttributionWindow, externalCampaign.viewAttributionWindow) &&
        Objects.equals(this.name, externalCampaign.name) &&
        Objects.equals(this.budget, externalCampaign.budget) &&
        Objects.equals(this.clickAttributionScope, externalCampaign.clickAttributionScope) &&
        Objects.equals(this.viewAttributionScope, externalCampaign.viewAttributionScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, promotedBrandIds, budgetSpent, budgetRemaining, status, createdAt, updatedAt, type, drawableBalanceIds, clickAttributionWindow, viewAttributionWindow, name, budget, clickAttributionScope, viewAttributionScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalCampaign {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    promotedBrandIds: ").append(toIndentedString(promotedBrandIds)).append("\n");
    sb.append("    budgetSpent: ").append(toIndentedString(budgetSpent)).append("\n");
    sb.append("    budgetRemaining: ").append(toIndentedString(budgetRemaining)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

