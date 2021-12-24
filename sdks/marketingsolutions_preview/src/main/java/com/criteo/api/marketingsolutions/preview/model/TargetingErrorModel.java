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
 * A machine-readable format for specifying errors in Targeting.API
 */
@ApiModel(description = "A machine-readable format for specifying errors in Targeting.API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TargetingErrorModel {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Object source;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public TargetingErrorModel code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A machine-readable error code string.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A machine-readable error code string.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public TargetingErrorModel detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable detailed explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable detailed explanation specific to this occurrence of the problem.")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public TargetingErrorModel instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A machine-readable URI reference that identifies the specific occurrence of the problem.
   * @return instance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A machine-readable URI reference that identifies the specific occurrence of the problem.")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public TargetingErrorModel source(Object source) {
    
    this.source = source;
    return this;
  }

   /**
   * A machine-readable structure to reference to the exact location(s) causing the error(s).
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A machine-readable structure to reference to the exact location(s) causing the error(s).")

  public Object getSource() {
    return source;
  }


  public void setSource(Object source) {
    this.source = source;
  }


  public TargetingErrorModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem type.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short, human-readable summary of the problem type.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TargetingErrorModel traceId(String traceId) {
    
    this.traceId = traceId;
    return this;
  }

   /**
   * The machine-readable correlation Id provided by the gateway.
   * @return traceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The machine-readable correlation Id provided by the gateway.")

  public String getTraceId() {
    return traceId;
  }


  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public TargetingErrorModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A machine-readable code specifying error category. This information is used on client side to focus on certain type of error,  to either retry some processing or display only certain type of errors.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A machine-readable code specifying error category. This information is used on client side to focus on certain type of error,  to either retry some processing or display only certain type of errors.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingErrorModel targetingErrorModel = (TargetingErrorModel) o;
    return Objects.equals(this.code, targetingErrorModel.code) &&
        Objects.equals(this.detail, targetingErrorModel.detail) &&
        Objects.equals(this.instance, targetingErrorModel.instance) &&
        Objects.equals(this.source, targetingErrorModel.source) &&
        Objects.equals(this.title, targetingErrorModel.title) &&
        Objects.equals(this.traceId, targetingErrorModel.traceId) &&
        Objects.equals(this.type, targetingErrorModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detail, instance, source, title, traceId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingErrorModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

