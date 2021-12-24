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


package com.criteo.api.retailmedia.preview.api;

import com.criteo.api.retailmedia.preview.ApiCallback;
import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.ApiResponse;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.Pair;
import com.criteo.api.retailmedia.preview.ProgressRequestBody;
import com.criteo.api.retailmedia.preview.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.criteo.api.retailmedia.preview.model.BadRequest;
import com.criteo.api.retailmedia.preview.model.EnvelopeReportRequest;
import com.criteo.api.retailmedia.preview.model.EnvelopeReportStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsApi {
    private ApiClient localVarApiClient;

    public AnalyticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnalyticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getReportOutput
     * @param reportId report id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The output </td><td>  * Content-Disposition - Returns a filename for the output <br>  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportOutputCall(String reportId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/preview/retail-media/reports/{reportId}/output"
            .replaceAll("\\{" + "reportId" + "\\}", localVarApiClient.escapeString(reportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
    private okhttp3.Call getReportOutputValidateBeforeCall(String reportId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getReportOutput(Async)");
        }
        

        okhttp3.Call localVarCall = getReportOutputCall(reportId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Request the report output
     * @param reportId report id (required)
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The output </td><td>  * Content-Disposition - Returns a filename for the output <br>  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public Integer getReportOutput(String reportId) throws ApiException {
        ApiResponse<Integer> localVarResp = getReportOutputWithHttpInfo(reportId);
        return localVarResp.getData();
    }

    /**
     * 
     * Request the report output
     * @param reportId report id (required)
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The output </td><td>  * Content-Disposition - Returns a filename for the output <br>  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Integer> getReportOutputWithHttpInfo(String reportId) throws ApiException {
        okhttp3.Call localVarCall = getReportOutputValidateBeforeCall(reportId, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Request the report output
     * @param reportId report id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The output </td><td>  * Content-Disposition - Returns a filename for the output <br>  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportOutputAsync(String reportId, final ApiCallback<Integer> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportOutputValidateBeforeCall(reportId, _callback);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReportStatus
     * @param reportId report id (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportStatusCall(String reportId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/preview/retail-media/reports/{reportId}/status"
            .replaceAll("\\{" + "reportId" + "\\}", localVarApiClient.escapeString(reportId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReportStatusValidateBeforeCall(String reportId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getReportStatus(Async)");
        }
        

        okhttp3.Call localVarCall = getReportStatusCall(reportId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get the status of the report
     * @param reportId report id (required)
     * @return EnvelopeReportStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeReportStatus getReportStatus(String reportId) throws ApiException {
        ApiResponse<EnvelopeReportStatus> localVarResp = getReportStatusWithHttpInfo(reportId);
        return localVarResp.getData();
    }

    /**
     * 
     * Get the status of the report
     * @param reportId report id (required)
     * @return ApiResponse&lt;EnvelopeReportStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeReportStatus> getReportStatusWithHttpInfo(String reportId) throws ApiException {
        okhttp3.Call localVarCall = getReportStatusValidateBeforeCall(reportId, null);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the status of the report
     * @param reportId report id (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> ReportId not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportStatusAsync(String reportId, final ApiCallback<EnvelopeReportStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportStatusValidateBeforeCall(reportId, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for requestCampaignReport
     * @param envelopeReportRequest // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the campaign id to select       \&quot;ids\&quot;: Array[string], //the campaign ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call requestCampaignReportCall(EnvelopeReportRequest envelopeReportRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = envelopeReportRequest;

        // create path and map variables
        String localVarPath = "/preview/retail-media/reports/campaigns";

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
    private okhttp3.Call requestCampaignReportValidateBeforeCall(EnvelopeReportRequest envelopeReportRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'envelopeReportRequest' is set
        if (envelopeReportRequest == null) {
            throw new ApiException("Missing the required parameter 'envelopeReportRequest' when calling requestCampaignReport(Async)");
        }
        

        okhttp3.Call localVarCall = requestCampaignReportCall(envelopeReportRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Request a campaign report
     * @param envelopeReportRequest // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the campaign id to select       \&quot;ids\&quot;: Array[string], //the campaign ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } (required)
     * @return EnvelopeReportStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeReportStatus requestCampaignReport(EnvelopeReportRequest envelopeReportRequest) throws ApiException {
        ApiResponse<EnvelopeReportStatus> localVarResp = requestCampaignReportWithHttpInfo(envelopeReportRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Request a campaign report
     * @param envelopeReportRequest // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the campaign id to select       \&quot;ids\&quot;: Array[string], //the campaign ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } (required)
     * @return ApiResponse&lt;EnvelopeReportStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeReportStatus> requestCampaignReportWithHttpInfo(EnvelopeReportRequest envelopeReportRequest) throws ApiException {
        okhttp3.Call localVarCall = requestCampaignReportValidateBeforeCall(envelopeReportRequest, null);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Request a campaign report
     * @param envelopeReportRequest // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the campaign id to select       \&quot;ids\&quot;: Array[string], //the campaign ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call requestCampaignReportAsync(EnvelopeReportRequest envelopeReportRequest, final ApiCallback<EnvelopeReportStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestCampaignReportValidateBeforeCall(envelopeReportRequest, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for requestLineItemReport
     * @param envelopeReportRequest // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the line item id to select       \&quot;ids: Array[string] // the line item ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call requestLineItemReportCall(EnvelopeReportRequest envelopeReportRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = envelopeReportRequest;

        // create path and map variables
        String localVarPath = "/preview/retail-media/reports/line-items";

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
    private okhttp3.Call requestLineItemReportValidateBeforeCall(EnvelopeReportRequest envelopeReportRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'envelopeReportRequest' is set
        if (envelopeReportRequest == null) {
            throw new ApiException("Missing the required parameter 'envelopeReportRequest' when calling requestLineItemReport(Async)");
        }
        

        okhttp3.Call localVarCall = requestLineItemReportCall(envelopeReportRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Request a line item report
     * @param envelopeReportRequest // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the line item id to select       \&quot;ids: Array[string] // the line item ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } (required)
     * @return EnvelopeReportStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public EnvelopeReportStatus requestLineItemReport(EnvelopeReportRequest envelopeReportRequest) throws ApiException {
        ApiResponse<EnvelopeReportStatus> localVarResp = requestLineItemReportWithHttpInfo(envelopeReportRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Request a line item report
     * @param envelopeReportRequest // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the line item id to select       \&quot;ids: Array[string] // the line item ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } (required)
     * @return ApiResponse&lt;EnvelopeReportStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnvelopeReportStatus> requestLineItemReportWithHttpInfo(EnvelopeReportRequest envelopeReportRequest) throws ApiException {
        okhttp3.Call localVarCall = requestLineItemReportValidateBeforeCall(envelopeReportRequest, null);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Request a line item report
     * @param envelopeReportRequest // Body of the request {   \&quot;data\&quot;: {     \&quot;type\&quot;: \&quot;RetailMediaReportRequest\&quot;,     \&quot;attributes\&quot;: {       \&quot;reportType\&quot;: string, // the name of the report being requested       //only one of \&quot;id\&quot; or \&quot;ids\&quot; can be provided for a request       \&quot;id\&quot;: string, // the line item id to select       \&quot;ids: Array[string] // the line item ids to select       \&quot;startDate\&quot;: string, // YYYY-MM-DD format       \&quot;endDate\&quot;: string, // YYYY-MM-DD format       \&quot;timeZone\&quot;: string, // examples: &#39;Europe/London&#39;, &#39;Asia/Tokyo&#39;, &#39;America/New_York&#39;       // both attribution windows must be specified when one is specified       \&quot;clickAttributionWindow\&quot;: \&quot;7D\&quot;, \&quot;14D\&quot;, or \&quot;30D\&quot;  // optional. defaults to campaign&#39;s click attribution window       \&quot;viewAttributionWindow\&quot;: \&quot;none\&quot;, \&quot;1D\&quot;, \&quot;7D\&quot;, \&quot;14D\&quot;, \&quot;30D\&quot; // optional. defaults to campaign&#39;s view attribution window       \&quot;format\&quot;: One of \&quot;json\&quot; (default),\&quot;json-compact\&quot;,\&quot;json-newline\&quot; or \&quot;csv\&quot; // output format, defaults to json-compact     }   } } (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the status of the report </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing Authorization or token invalid </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Must have access to RetailMedia accounts </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call requestLineItemReportAsync(EnvelopeReportRequest envelopeReportRequest, final ApiCallback<EnvelopeReportStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestLineItemReportValidateBeforeCall(envelopeReportRequest, _callback);
        Type localVarReturnType = new TypeToken<EnvelopeReportStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
