

# ExternalPreferredLineItemCreateModel

Model used to create a preferred line item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**startDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD | 
**endDate** | **LocalDate** | Represents the Date as a year, month, and day in the format YYYY-MM-DD | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**pacing** | [**PacingEnum**](#PacingEnum) |  | 
**capping** | [**ExternalLineItemCapping**](ExternalLineItemCapping.md) |  |  [optional]
**targetRetailerId** | **String** |  | 
**budget** | **BigDecimal** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
ACTIVE | &quot;active&quot;
SCHEDULED | &quot;scheduled&quot;
DRAFT | &quot;draft&quot;
PAUSED | &quot;paused&quot;
BUDGETHIT | &quot;budgetHit&quot;
ENDED | &quot;ended&quot;
ARCHIVED | &quot;archived&quot;
NOFUNDS | &quot;noFunds&quot;



## Enum: PacingEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
STANDARD | &quot;standard&quot;
ACCELERATED | &quot;accelerated&quot;


