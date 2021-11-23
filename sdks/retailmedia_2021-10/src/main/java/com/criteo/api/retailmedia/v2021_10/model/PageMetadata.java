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

/**
 * Metadata related to the current request
 */
@ApiModel(description = "Metadata related to the current request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageMetadata {
  public static final String SERIALIZED_NAME_TOTAL_ITEMS_ACROSS_ALL_PAGES = "totalItemsAcrossAllPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS_ACROSS_ALL_PAGES)
  private Long totalItemsAcrossAllPages;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_SIZE = "currentPageSize";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_SIZE)
  private Integer currentPageSize;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_INDEX = "currentPageIndex";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_INDEX)
  private Integer currentPageIndex;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Long totalPages;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previousPage";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;


  public PageMetadata totalItemsAcrossAllPages(Long totalItemsAcrossAllPages) {
    
    this.totalItemsAcrossAllPages = totalItemsAcrossAllPages;
    return this;
  }

   /**
   * Get totalItemsAcrossAllPages
   * @return totalItemsAcrossAllPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalItemsAcrossAllPages() {
    return totalItemsAcrossAllPages;
  }


  public void setTotalItemsAcrossAllPages(Long totalItemsAcrossAllPages) {
    this.totalItemsAcrossAllPages = totalItemsAcrossAllPages;
  }


  public PageMetadata currentPageSize(Integer currentPageSize) {
    
    this.currentPageSize = currentPageSize;
    return this;
  }

   /**
   * Get currentPageSize
   * @return currentPageSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCurrentPageSize() {
    return currentPageSize;
  }


  public void setCurrentPageSize(Integer currentPageSize) {
    this.currentPageSize = currentPageSize;
  }


  public PageMetadata currentPageIndex(Integer currentPageIndex) {
    
    this.currentPageIndex = currentPageIndex;
    return this;
  }

   /**
   * Get currentPageIndex
   * @return currentPageIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCurrentPageIndex() {
    return currentPageIndex;
  }


  public void setCurrentPageIndex(Integer currentPageIndex) {
    this.currentPageIndex = currentPageIndex;
  }


  public PageMetadata totalPages(Long totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }


  public PageMetadata nextPage(String nextPage) {
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextPage() {
    return nextPage;
  }


  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public PageMetadata previousPage(String previousPage) {
    
    this.previousPage = previousPage;
    return this;
  }

   /**
   * Get previousPage
   * @return previousPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviousPage() {
    return previousPage;
  }


  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMetadata pageMetadata = (PageMetadata) o;
    return Objects.equals(this.totalItemsAcrossAllPages, pageMetadata.totalItemsAcrossAllPages) &&
        Objects.equals(this.currentPageSize, pageMetadata.currentPageSize) &&
        Objects.equals(this.currentPageIndex, pageMetadata.currentPageIndex) &&
        Objects.equals(this.totalPages, pageMetadata.totalPages) &&
        Objects.equals(this.nextPage, pageMetadata.nextPage) &&
        Objects.equals(this.previousPage, pageMetadata.previousPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalItemsAcrossAllPages, currentPageSize, currentPageIndex, totalPages, nextPage, previousPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMetadata {\n");
    sb.append("    totalItemsAcrossAllPages: ").append(toIndentedString(totalItemsAcrossAllPages)).append("\n");
    sb.append("    currentPageSize: ").append(toIndentedString(currentPageSize)).append("\n");
    sb.append("    currentPageIndex: ").append(toIndentedString(currentPageIndex)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
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

