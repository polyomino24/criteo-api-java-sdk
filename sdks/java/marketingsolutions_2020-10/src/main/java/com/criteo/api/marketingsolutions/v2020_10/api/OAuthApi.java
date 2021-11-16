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


package com.criteo.api.marketingsolutions.v2020_10.api;

import com.criteo.api.marketingsolutions.v2020_10.ApiCallback;
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.ApiResponse;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.Pair;
import com.criteo.api.marketingsolutions.v2020_10.ProgressRequestBody;
import com.criteo.api.marketingsolutions.v2020_10.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.marketingsolutions.v2020_10.model.JwtModel;
import com.criteo.api.marketingsolutions.v2020_10.model.OAuth2Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OAuthApi {
    private ApiClient localVarApiClient;

    public OAuthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OAuthApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createToken
     * @param clientId API Client-Id or Username (optional)
     * @param clientSecret API Client secret or password (optional)
     * @param grantType Other grant types are not available (optional, default to &quot;client_credentials&quot;)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTokenCall(String clientId, String clientSecret, String grantType, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/oauth2/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientId != null) {
            localVarFormParams.put("client_id", clientId);
        }

        if (clientSecret != null) {
            localVarFormParams.put("client_secret", clientSecret);
        }

        if (grantType != null) {
            localVarFormParams.put("grant_type", grantType);
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTokenValidateBeforeCall(String clientId, String clientSecret, String grantType, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createTokenCall(clientId, clientSecret, grantType, _callback);
        return localVarCall;

    }

    /**
     * 
     * Creates a token when the supplied client credentials are valid
     * @param clientId API Client-Id or Username (optional)
     * @param clientSecret API Client secret or password (optional)
     * @param grantType Other grant types are not available (optional, default to &quot;client_credentials&quot;)
     * @return JwtModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public JwtModel createToken(String clientId, String clientSecret, String grantType) throws ApiException {
        ApiResponse<JwtModel> localVarResp = createTokenWithHttpInfo(clientId, clientSecret, grantType);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates a token when the supplied client credentials are valid
     * @param clientId API Client-Id or Username (optional)
     * @param clientSecret API Client secret or password (optional)
     * @param grantType Other grant types are not available (optional, default to &quot;client_credentials&quot;)
     * @return ApiResponse&lt;JwtModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JwtModel> createTokenWithHttpInfo(String clientId, String clientSecret, String grantType) throws ApiException {
        okhttp3.Call localVarCall = createTokenValidateBeforeCall(clientId, clientSecret, grantType, null);
        Type localVarReturnType = new TypeToken<JwtModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a token when the supplied client credentials are valid
     * @param clientId API Client-Id or Username (optional)
     * @param clientSecret API Client secret or password (optional)
     * @param grantType Other grant types are not available (optional, default to &quot;client_credentials&quot;)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTokenAsync(String clientId, String clientSecret, String grantType, final ApiCallback<JwtModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTokenValidateBeforeCall(clientId, clientSecret, grantType, _callback);
        Type localVarReturnType = new TypeToken<JwtModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
