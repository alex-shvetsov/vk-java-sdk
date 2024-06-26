// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketItemIsNotDeletedException extends ApiException {
    public static final Integer ERROR_CODE = 1518;

    public static final String ERROR_DESCRIPTION = "Item is not deleted";

    public ApiMarketItemIsNotDeletedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketItemIsNotDeletedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
