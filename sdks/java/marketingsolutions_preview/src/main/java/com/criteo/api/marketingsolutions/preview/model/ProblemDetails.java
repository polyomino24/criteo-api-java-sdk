/*
 * Criteo API Specification
 * This is used to help Criteo clients use our API
 *
 * The version of the OpenAPI document: preview
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Data model for common error or warning
 */
@ApiModel(description = "Data model for common error or warning")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProblemDetails {
  public static final String SERIALIZED_NAME_TRACE_IDENTIFIER = "traceIdentifier";
  @SerializedName(SERIALIZED_NAME_TRACE_IDENTIFIER)
  private String traceIdentifier;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("unknown"),
    
    ACCESS_CONTROL("access-control"),
    
    AUTHENTICATION("authentication"),
    
    AUTHORIZATION("authorization"),
    
    AVAILABILITY("availability"),
    
    DEPRECATION("deprecation"),
    
    QUOTA("quota"),
    
    VALIDATION("validation");

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
  private TypeEnum type;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Map<String, String> source = null;

  public static final String SERIALIZED_NAME_STACK_TRACE = "stackTrace";
  @SerializedName(SERIALIZED_NAME_STACK_TRACE)
  private String stackTrace;


  public ProblemDetails traceIdentifier(String traceIdentifier) {
    
    this.traceIdentifier = traceIdentifier;
    return this;
  }

   /**
   * Get traceIdentifier
   * @return traceIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTraceIdentifier() {
    return traceIdentifier;
  }


  public void setTraceIdentifier(String traceIdentifier) {
    this.traceIdentifier = traceIdentifier;
  }


  public ProblemDetails type(TypeEnum type) {
    
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


  public ProblemDetails code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ProblemDetails instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public ProblemDetails title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ProblemDetails detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public ProblemDetails source(Map<String, String> source) {
    
    this.source = source;
    return this;
  }

  public ProblemDetails putSourceItem(String key, String sourceItem) {
    if (this.source == null) {
      this.source = new HashMap<>();
    }
    this.source.put(key, sourceItem);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getSource() {
    return source;
  }


  public void setSource(Map<String, String> source) {
    this.source = source;
  }


  public ProblemDetails stackTrace(String stackTrace) {
    
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStackTrace() {
    return stackTrace;
  }


  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetails problemDetails = (ProblemDetails) o;
    return Objects.equals(this.traceIdentifier, problemDetails.traceIdentifier) &&
        Objects.equals(this.type, problemDetails.type) &&
        Objects.equals(this.code, problemDetails.code) &&
        Objects.equals(this.instance, problemDetails.instance) &&
        Objects.equals(this.title, problemDetails.title) &&
        Objects.equals(this.detail, problemDetails.detail) &&
        Objects.equals(this.source, problemDetails.source) &&
        Objects.equals(this.stackTrace, problemDetails.stackTrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceIdentifier, type, code, instance, title, detail, source, stackTrace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetails {\n");
    sb.append("    traceIdentifier: ").append(toIndentedString(traceIdentifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
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

