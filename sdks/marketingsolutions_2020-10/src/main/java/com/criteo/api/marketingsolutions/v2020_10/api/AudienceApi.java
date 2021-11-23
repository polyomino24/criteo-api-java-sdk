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


import com.criteo.api.marketingsolutions.v2020_10.model.ContactlistAmendmentRequest;
import com.criteo.api.marketingsolutions.v2020_10.model.DeleteAudienceContactListResponse;
import com.criteo.api.marketingsolutions.v2020_10.model.DeleteAudienceResponse;
import com.criteo.api.marketingsolutions.v2020_10.model.ErrorCodeResponse;
import com.criteo.api.marketingsolutions.v2020_10.model.GetAudiencesResponse;
import com.criteo.api.marketingsolutions.v2020_10.model.ModifyAudienceResponse;
import com.criteo.api.marketingsolutions.v2020_10.model.NewAudienceRequest;
import com.criteo.api.marketingsolutions.v2020_10.model.NewAudienceResponse;
import com.criteo.api.marketingsolutions.v2020_10.model.ReplaceAudienceRequest;
import com.criteo.api.marketingsolutions.v2020_10.model.ReplaceAudienceResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AudienceApi {
    private ApiClient localVarApiClient;

    public AudienceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AudienceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createAudience
     * @param newAudienceRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was created </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAudienceCall(NewAudienceRequest newAudienceRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = newAudienceRequest;

        // create path and map variables
        String localVarPath = "/2021-10/audiences";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAudienceValidateBeforeCall(NewAudienceRequest newAudienceRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'newAudienceRequest' is set
        if (newAudienceRequest == null) {
            throw new ApiException("Missing the required parameter 'newAudienceRequest' when calling createAudience(Async)");
        }
        

        okhttp3.Call localVarCall = createAudienceCall(newAudienceRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Create an Audience for an Advertiser
     * @param newAudienceRequest  (required)
     * @return NewAudienceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was created </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public NewAudienceResponse createAudience(NewAudienceRequest newAudienceRequest) throws ApiException {
        ApiResponse<NewAudienceResponse> localVarResp = createAudienceWithHttpInfo(newAudienceRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create an Audience for an Advertiser
     * @param newAudienceRequest  (required)
     * @return ApiResponse&lt;NewAudienceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was created </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NewAudienceResponse> createAudienceWithHttpInfo(NewAudienceRequest newAudienceRequest) throws ApiException {
        okhttp3.Call localVarCall = createAudienceValidateBeforeCall(newAudienceRequest, null);
        Type localVarReturnType = new TypeToken<NewAudienceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create an Audience for an Advertiser
     * @param newAudienceRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was created </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAudienceAsync(NewAudienceRequest newAudienceRequest, final ApiCallback<NewAudienceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAudienceValidateBeforeCall(newAudienceRequest, _callback);
        Type localVarReturnType = new TypeToken<NewAudienceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteIdentifiers
     * @param audienceId The id of the audience to amend (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The contactlist was deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteIdentifiersCall(String audienceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2021-10/audiences/{audience-id}/contactlist"
            .replaceAll("\\{" + "audience-id" + "\\}", localVarApiClient.escapeString(audienceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteIdentifiersValidateBeforeCall(String audienceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'audienceId' is set
        if (audienceId == null) {
            throw new ApiException("Missing the required parameter 'audienceId' when calling deleteIdentifiers(Async)");
        }
        

        okhttp3.Call localVarCall = deleteIdentifiersCall(audienceId, _callback);
        return localVarCall;

    }

    /**
     * 
     * delete all identifiers from an Audience
     * @param audienceId The id of the audience to amend (required)
     * @return DeleteAudienceContactListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The contactlist was deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public DeleteAudienceContactListResponse deleteIdentifiers(String audienceId) throws ApiException {
        ApiResponse<DeleteAudienceContactListResponse> localVarResp = deleteIdentifiersWithHttpInfo(audienceId);
        return localVarResp.getData();
    }

    /**
     * 
     * delete all identifiers from an Audience
     * @param audienceId The id of the audience to amend (required)
     * @return ApiResponse&lt;DeleteAudienceContactListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The contactlist was deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteAudienceContactListResponse> deleteIdentifiersWithHttpInfo(String audienceId) throws ApiException {
        okhttp3.Call localVarCall = deleteIdentifiersValidateBeforeCall(audienceId, null);
        Type localVarReturnType = new TypeToken<DeleteAudienceContactListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * delete all identifiers from an Audience
     * @param audienceId The id of the audience to amend (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The contactlist was deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteIdentifiersAsync(String audienceId, final ApiCallback<DeleteAudienceContactListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteIdentifiersValidateBeforeCall(audienceId, _callback);
        Type localVarReturnType = new TypeToken<DeleteAudienceContactListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAudiences
     * @param advertiserId The advertiser id to get all the audiences for. Mandatory for internal users. For external users,            if you don&#39;t provide it, we will take into account the advertisers from your portfolio (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list was retrieved. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAudiencesCall(String advertiserId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2021-10/audiences";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser-id", advertiserId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAudiencesValidateBeforeCall(String advertiserId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAudiencesCall(advertiserId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get a list of all the audiences for the user or for the given advertiser_id
     * @param advertiserId The advertiser id to get all the audiences for. Mandatory for internal users. For external users,            if you don&#39;t provide it, we will take into account the advertisers from your portfolio (optional)
     * @return GetAudiencesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list was retrieved. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public GetAudiencesResponse getAudiences(String advertiserId) throws ApiException {
        ApiResponse<GetAudiencesResponse> localVarResp = getAudiencesWithHttpInfo(advertiserId);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a list of all the audiences for the user or for the given advertiser_id
     * @param advertiserId The advertiser id to get all the audiences for. Mandatory for internal users. For external users,            if you don&#39;t provide it, we will take into account the advertisers from your portfolio (optional)
     * @return ApiResponse&lt;GetAudiencesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list was retrieved. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetAudiencesResponse> getAudiencesWithHttpInfo(String advertiserId) throws ApiException {
        okhttp3.Call localVarCall = getAudiencesValidateBeforeCall(advertiserId, null);
        Type localVarReturnType = new TypeToken<GetAudiencesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a list of all the audiences for the user or for the given advertiser_id
     * @param advertiserId The advertiser id to get all the audiences for. Mandatory for internal users. For external users,            if you don&#39;t provide it, we will take into account the advertisers from your portfolio (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list was retrieved. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAudiencesAsync(String advertiserId, final ApiCallback<GetAudiencesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAudiencesValidateBeforeCall(advertiserId, _callback);
        Type localVarReturnType = new TypeToken<GetAudiencesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyAudience
     * @param audienceId The id of the audience to amend (required)
     * @param replaceAudienceRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was updated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyAudienceCall(String audienceId, ReplaceAudienceRequest replaceAudienceRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = replaceAudienceRequest;

        // create path and map variables
        String localVarPath = "/2021-10/audiences/{audience-id}"
            .replaceAll("\\{" + "audience-id" + "\\}", localVarApiClient.escapeString(audienceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyAudienceValidateBeforeCall(String audienceId, ReplaceAudienceRequest replaceAudienceRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'audienceId' is set
        if (audienceId == null) {
            throw new ApiException("Missing the required parameter 'audienceId' when calling modifyAudience(Async)");
        }
        
        // verify the required parameter 'replaceAudienceRequest' is set
        if (replaceAudienceRequest == null) {
            throw new ApiException("Missing the required parameter 'replaceAudienceRequest' when calling modifyAudience(Async)");
        }
        

        okhttp3.Call localVarCall = modifyAudienceCall(audienceId, replaceAudienceRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Update user audience specified by the audience id
     * @param audienceId The id of the audience to amend (required)
     * @param replaceAudienceRequest  (required)
     * @return ReplaceAudienceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was updated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ReplaceAudienceResponse modifyAudience(String audienceId, ReplaceAudienceRequest replaceAudienceRequest) throws ApiException {
        ApiResponse<ReplaceAudienceResponse> localVarResp = modifyAudienceWithHttpInfo(audienceId, replaceAudienceRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Update user audience specified by the audience id
     * @param audienceId The id of the audience to amend (required)
     * @param replaceAudienceRequest  (required)
     * @return ApiResponse&lt;ReplaceAudienceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was updated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReplaceAudienceResponse> modifyAudienceWithHttpInfo(String audienceId, ReplaceAudienceRequest replaceAudienceRequest) throws ApiException {
        okhttp3.Call localVarCall = modifyAudienceValidateBeforeCall(audienceId, replaceAudienceRequest, null);
        Type localVarReturnType = new TypeToken<ReplaceAudienceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update user audience specified by the audience id
     * @param audienceId The id of the audience to amend (required)
     * @param replaceAudienceRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was updated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyAudienceAsync(String audienceId, ReplaceAudienceRequest replaceAudienceRequest, final ApiCallback<ReplaceAudienceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyAudienceValidateBeforeCall(audienceId, replaceAudienceRequest, _callback);
        Type localVarReturnType = new TypeToken<ReplaceAudienceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyAudienceUsers
     * @param audienceId The id of the audience to amend (required)
     * @param contactlistAmendmentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Summary of created request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Audience 123 not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyAudienceUsersCall(String audienceId, ContactlistAmendmentRequest contactlistAmendmentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = contactlistAmendmentRequest;

        // create path and map variables
        String localVarPath = "/2021-10/audiences/{audience-id}/contactlist"
            .replaceAll("\\{" + "audience-id" + "\\}", localVarApiClient.escapeString(audienceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyAudienceUsersValidateBeforeCall(String audienceId, ContactlistAmendmentRequest contactlistAmendmentRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'audienceId' is set
        if (audienceId == null) {
            throw new ApiException("Missing the required parameter 'audienceId' when calling modifyAudienceUsers(Async)");
        }
        
        // verify the required parameter 'contactlistAmendmentRequest' is set
        if (contactlistAmendmentRequest == null) {
            throw new ApiException("Missing the required parameter 'contactlistAmendmentRequest' when calling modifyAudienceUsers(Async)");
        }
        

        okhttp3.Call localVarCall = modifyAudienceUsersCall(audienceId, contactlistAmendmentRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Add/remove users to or from an audience
     * @param audienceId The id of the audience to amend (required)
     * @param contactlistAmendmentRequest  (required)
     * @return ModifyAudienceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Summary of created request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Audience 123 not found </td><td>  -  </td></tr>
     </table>
     */
    public ModifyAudienceResponse modifyAudienceUsers(String audienceId, ContactlistAmendmentRequest contactlistAmendmentRequest) throws ApiException {
        ApiResponse<ModifyAudienceResponse> localVarResp = modifyAudienceUsersWithHttpInfo(audienceId, contactlistAmendmentRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Add/remove users to or from an audience
     * @param audienceId The id of the audience to amend (required)
     * @param contactlistAmendmentRequest  (required)
     * @return ApiResponse&lt;ModifyAudienceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Summary of created request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Audience 123 not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModifyAudienceResponse> modifyAudienceUsersWithHttpInfo(String audienceId, ContactlistAmendmentRequest contactlistAmendmentRequest) throws ApiException {
        okhttp3.Call localVarCall = modifyAudienceUsersValidateBeforeCall(audienceId, contactlistAmendmentRequest, null);
        Type localVarReturnType = new TypeToken<ModifyAudienceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add/remove users to or from an audience
     * @param audienceId The id of the audience to amend (required)
     * @param contactlistAmendmentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Summary of created request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Audience 123 not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyAudienceUsersAsync(String audienceId, ContactlistAmendmentRequest contactlistAmendmentRequest, final ApiCallback<ModifyAudienceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyAudienceUsersValidateBeforeCall(audienceId, contactlistAmendmentRequest, _callback);
        Type localVarReturnType = new TypeToken<ModifyAudienceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeAudience
     * @param audienceId The id of the audience to amend (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeAudienceCall(String audienceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2021-10/audiences/{audience-id}"
            .replaceAll("\\{" + "audience-id" + "\\}", localVarApiClient.escapeString(audienceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oauth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeAudienceValidateBeforeCall(String audienceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'audienceId' is set
        if (audienceId == null) {
            throw new ApiException("Missing the required parameter 'audienceId' when calling removeAudience(Async)");
        }
        

        okhttp3.Call localVarCall = removeAudienceCall(audienceId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Delete an audience by id
     * @param audienceId The id of the audience to amend (required)
     * @return DeleteAudienceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public DeleteAudienceResponse removeAudience(String audienceId) throws ApiException {
        ApiResponse<DeleteAudienceResponse> localVarResp = removeAudienceWithHttpInfo(audienceId);
        return localVarResp.getData();
    }

    /**
     * 
     * Delete an audience by id
     * @param audienceId The id of the audience to amend (required)
     * @return ApiResponse&lt;DeleteAudienceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteAudienceResponse> removeAudienceWithHttpInfo(String audienceId) throws ApiException {
        okhttp3.Call localVarCall = removeAudienceValidateBeforeCall(audienceId, null);
        Type localVarReturnType = new TypeToken<DeleteAudienceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete an audience by id
     * @param audienceId The id of the audience to amend (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The audience was deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeAudienceAsync(String audienceId, final ApiCallback<DeleteAudienceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeAudienceValidateBeforeCall(audienceId, _callback);
        Type localVarReturnType = new TypeToken<DeleteAudienceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
