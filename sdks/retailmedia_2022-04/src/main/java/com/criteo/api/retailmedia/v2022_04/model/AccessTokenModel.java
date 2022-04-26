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

/**
 * Access Token to be used with other services
 */
@ApiModel(description = "Access Token to be used with other services")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessTokenModel {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;


  public AccessTokenModel accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token issued by the authorization server.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access token issued by the authorization server.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public AccessTokenModel tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The type of the token issued.
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the token issued.")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public AccessTokenModel refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * The refresh token issued by the authorization server.
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The refresh token issued by the authorization server.")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public AccessTokenModel expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The lifetime in seconds of the access token.For example, the value \&quot;3600\&quot; denotes that the access token will expire in one hour from the time the response was generated. If omitted, the authorization server SHOULD provide the expiration time via other means or document the default value.
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lifetime in seconds of the access token.For example, the value \"3600\" denotes that the access token will expire in one hour from the time the response was generated. If omitted, the authorization server SHOULD provide the expiration time via other means or document the default value.")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenModel accessTokenModel = (AccessTokenModel) o;
    return Objects.equals(this.accessToken, accessTokenModel.accessToken) &&
        Objects.equals(this.tokenType, accessTokenModel.tokenType) &&
        Objects.equals(this.refreshToken, accessTokenModel.refreshToken) &&
        Objects.equals(this.expiresIn, accessTokenModel.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, refreshToken, expiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenModel {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

