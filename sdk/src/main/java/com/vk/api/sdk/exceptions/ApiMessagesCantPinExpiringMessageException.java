// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesCantPinExpiringMessageException extends ApiException {
    public static final Integer ERROR_CODE = 970;

    public static final String ERROR_DESCRIPTION = "Cannot pin an expiring message";

    public ApiMessagesCantPinExpiringMessageException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesCantPinExpiringMessageException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
