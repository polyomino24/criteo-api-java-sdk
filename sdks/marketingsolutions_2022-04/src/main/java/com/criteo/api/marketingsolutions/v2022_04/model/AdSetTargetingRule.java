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


package com.criteo.api.marketingsolutions.v2022_04.model;

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
 * ad set targeting rule model
 */
@ApiModel(description = "ad set targeting rule model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdSetTargetingRule {
  /**
   * Operand which states how the values should be applied
   */
  @JsonAdapter(OperandEnum.Adapter.class)
  public enum OperandEnum {
    UNDEFINED("undefined"),
    
    IN("in"),
    
    NOTIN("notIn");

    private String value;

    OperandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperandEnum fromValue(String value) {
      for (OperandEnum b : OperandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERAND = "operand";
  @SerializedName(SERIALIZED_NAME_OPERAND)
  private OperandEnum operand;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;


  public AdSetTargetingRule operand(OperandEnum operand) {
    
    this.operand = operand;
    return this;
  }

   /**
   * Operand which states how the values should be applied
   * @return operand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operand which states how the values should be applied")

  public OperandEnum getOperand() {
    return operand;
  }


  public void setOperand(OperandEnum operand) {
    this.operand = operand;
  }


  public AdSetTargetingRule values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public AdSetTargetingRule addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * List of values to apply
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of values to apply")

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdSetTargetingRule adSetTargetingRule = (AdSetTargetingRule) o;
    return Objects.equals(this.operand, adSetTargetingRule.operand) &&
        Objects.equals(this.values, adSetTargetingRule.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operand, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdSetTargetingRule {\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

