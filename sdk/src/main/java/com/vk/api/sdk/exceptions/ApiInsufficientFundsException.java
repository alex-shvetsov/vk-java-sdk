// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiInsufficientFundsException extends ApiException {
    public static final Integer ERROR_CODE = 147;

    public static final String ERROR_DESCRIPTION = "Application has insufficient funds";

    public ApiInsufficientFundsException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiInsufficientFundsException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
