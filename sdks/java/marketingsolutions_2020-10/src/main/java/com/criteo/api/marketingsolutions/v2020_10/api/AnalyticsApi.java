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


import com.criteo.api.marketingsolutions.v2020_10.model.ErrorMessage;
import com.criteo.api.marketingsolutions.v2020_10.model.StatisticsReportQueryMessage;
import com.criteo.api.marketingsolutions.v2020_10.model.TransactionsReportQueryDataMessage;

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
     * Build call for getAdsetReport
     * @param statisticsReportQueryMessage  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAdsetReportCall(StatisticsReportQueryMessage statisticsReportQueryMessage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = statisticsReportQueryMessage;

        // create path and map variables
        String localVarPath = "/2021-04/statistics/report";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAdsetReportValidateBeforeCall(StatisticsReportQueryMessage statisticsReportQueryMessage, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAdsetReportCall(statisticsReportQueryMessage, _callback);
        return localVarCall;

    }

    /**
     * 
     * This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.
     * @param statisticsReportQueryMessage  (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getAdsetReport(StatisticsReportQueryMessage statisticsReportQueryMessage) throws ApiException {
        ApiResponse<byte[]> localVarResp = getAdsetReportWithHttpInfo(statisticsReportQueryMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.
     * @param statisticsReportQueryMessage  (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getAdsetReportWithHttpInfo(StatisticsReportQueryMessage statisticsReportQueryMessage) throws ApiException {
        okhttp3.Call localVarCall = getAdsetReportValidateBeforeCall(statisticsReportQueryMessage, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This Statistics endpoint provides adset related data. It is an upgrade of our previous Statistics endpoint, and includes new metrics and customization capabilities.
     * @param statisticsReportQueryMessage  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAdsetReportAsync(StatisticsReportQueryMessage statisticsReportQueryMessage, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAdsetReportValidateBeforeCall(statisticsReportQueryMessage, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTransactionsReport
     * @param transactionsReportQueryDataMessage  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionsReportCall(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = transactionsReportQueryDataMessage;

        // create path and map variables
        String localVarPath = "/2021-04/transactions/report";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionsReportValidateBeforeCall(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getTransactionsReportCall(transactionsReportQueryDataMessage, _callback);
        return localVarCall;

    }

    /**
     * 
     * This Transactions endpoint provides transactions id related data.
     * @param transactionsReportQueryDataMessage  (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public byte[] getTransactionsReport(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage) throws ApiException {
        ApiResponse<byte[]> localVarResp = getTransactionsReportWithHttpInfo(transactionsReportQueryDataMessage);
        return localVarResp.getData();
    }

    /**
     * 
     * This Transactions endpoint provides transactions id related data.
     * @param transactionsReportQueryDataMessage  (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<byte[]> getTransactionsReportWithHttpInfo(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage) throws ApiException {
        okhttp3.Call localVarCall = getTransactionsReportValidateBeforeCall(transactionsReportQueryDataMessage, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This Transactions endpoint provides transactions id related data.
     * @param transactionsReportQueryDataMessage  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionsReportAsync(TransactionsReportQueryDataMessage transactionsReportQueryDataMessage, final ApiCallback<byte[]> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionsReportValidateBeforeCall(transactionsReportQueryDataMessage, _callback);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
