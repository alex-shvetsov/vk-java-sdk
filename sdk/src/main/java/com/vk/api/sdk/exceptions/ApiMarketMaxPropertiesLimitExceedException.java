// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketMaxPropertiesLimitExceedException extends ApiException {
    public static final Integer ERROR_CODE = 1418;

    public static final String ERROR_DESCRIPTION = "Max properties limit exceeded";

    public ApiMarketMaxPropertiesLimitExceedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketMaxPropertiesLimitExceedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}