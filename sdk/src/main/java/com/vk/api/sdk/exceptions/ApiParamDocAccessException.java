// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiParamDocAccessException extends ApiException {
    public static final Integer ERROR_CODE = 1153;

    public static final String ERROR_DESCRIPTION = "Access to document is denied";

    public ApiParamDocAccessException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiParamDocAccessException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
