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
 * custom audience configuration of the ad set
 */
@ApiModel(description = "custom audience configuration of the ad set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AudienceCustom {
  public static final String SERIALIZED_NAME_AUDIENCE_NAME = "audienceName";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_NAME)
  private String audienceName;

  public static final String SERIALIZED_NAME_INCLUDED_AUDIENCE_IDS = "includedAudienceIds";
  @SerializedName(SERIALIZED_NAME_INCLUDED_AUDIENCE_IDS)
  private List<String> includedAudienceIds = null;

  /**
   * Gets or Sets visitorTypes
   */
  @JsonAdapter(VisitorTypesEnum.Adapter.class)
  public enum VisitorTypesEnum {
    NONVISITOR("nonVisitor"),
    
    HOMEPAGEVISITOR("homePageVisitor"),
    
    VISITOR("visitor"),
    
    CUSTOMER("customer");

    private String value;

    VisitorTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisitorTypesEnum fromValue(String value) {
      for (VisitorTypesEnum b : VisitorTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisitorTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisitorTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisitorTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisitorTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISITOR_TYPES = "visitorTypes";
  @SerializedName(SERIALIZED_NAME_VISITOR_TYPES)
  private List<VisitorTypesEnum> visitorTypes = null;


  public AudienceCustom audienceName(String audienceName) {
    
    this.audienceName = audienceName;
    return this;
  }

   /**
   * the name of the custom audience that will be created for this ad set
   * @return audienceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the name of the custom audience that will be created for this ad set")

  public String getAudienceName() {
    return audienceName;
  }


  public void setAudienceName(String audienceName) {
    this.audienceName = audienceName;
  }


  public AudienceCustom includedAudienceIds(List<String> includedAudienceIds) {
    
    this.includedAudienceIds = includedAudienceIds;
    return this;
  }

  public AudienceCustom addIncludedAudienceIdsItem(String includedAudienceIdsItem) {
    if (this.includedAudienceIds == null) {
      this.includedAudienceIds = new ArrayList<>();
    }
    this.includedAudienceIds.add(includedAudienceIdsItem);
    return this;
  }

   /**
   * The list of audience ids that define who can be targeted by the ad set
   * @return includedAudienceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of audience ids that define who can be targeted by the ad set")

  public List<String> getIncludedAudienceIds() {
    return includedAudienceIds;
  }


  public void setIncludedAudienceIds(List<String> includedAudienceIds) {
    this.includedAudienceIds = includedAudienceIds;
  }


  public AudienceCustom visitorTypes(List<VisitorTypesEnum> visitorTypes) {
    
    this.visitorTypes = visitorTypes;
    return this;
  }

  public AudienceCustom addVisitorTypesItem(VisitorTypesEnum visitorTypesItem) {
    if (this.visitorTypes == null) {
      this.visitorTypes = new ArrayList<>();
    }
    this.visitorTypes.add(visitorTypesItem);
    return this;
  }

   /**
   * the interaction required on the advertiser web site during the interval defined by daysSinceLastVistXXX fields for being part of the audience
   * @return visitorTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the interaction required on the advertiser web site during the interval defined by daysSinceLastVistXXX fields for being part of the audience")

  public List<VisitorTypesEnum> getVisitorTypes() {
    return visitorTypes;
  }


  public void setVisitorTypes(List<VisitorTypesEnum> visitorTypes) {
    this.visitorTypes = visitorTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCustom audienceCustom = (AudienceCustom) o;
    return Objects.equals(this.audienceName, audienceCustom.audienceName) &&
        Objects.equals(this.includedAudienceIds, audienceCustom.includedAudienceIds) &&
        Objects.equals(this.visitorTypes, audienceCustom.visitorTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceName, includedAudienceIds, visitorTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCustom {\n");
    sb.append("    audienceName: ").append(toIndentedString(audienceName)).append("\n");
    sb.append("    includedAudienceIds: ").append(toIndentedString(includedAudienceIds)).append("\n");
    sb.append("    visitorTypes: ").append(toIndentedString(visitorTypes)).append("\n");
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

