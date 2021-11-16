/*
 * Criteo API Specification
 * This is used to help Criteo clients use our APIs
 *
 * The version of the OpenAPI document: 2021-04
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.marketingsolutions.v2020_10.model;

import java.util.Objects;
import java.util.Arrays;
import com.criteo.api.marketingsolutions.v2020_10.model.TransactionsReportQueryEntityMessage;
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
 * Contains queries for Transactions report
 */
@ApiModel(description = "Contains queries for Transactions report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionsReportQueryDataMessage {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<TransactionsReportQueryEntityMessage> data = new ArrayList<>();


  public TransactionsReportQueryDataMessage data(List<TransactionsReportQueryEntityMessage> data) {
    
    this.data = data;
    return this;
  }

  public TransactionsReportQueryDataMessage addDataItem(TransactionsReportQueryEntityMessage dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TransactionsReportQueryEntityMessage> getData() {
    return data;
  }


  public void setData(List<TransactionsReportQueryEntityMessage> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsReportQueryDataMessage transactionsReportQueryDataMessage = (TransactionsReportQueryDataMessage) o;
    return Objects.equals(this.data, transactionsReportQueryDataMessage.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsReportQueryDataMessage {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

