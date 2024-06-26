// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiDisabledException extends ApiException {
    public static final Integer ERROR_CODE = 2;

    public static final String ERROR_DESCRIPTION = "Application is disabled. Enable your application or use test mode";

    public ApiDisabledException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiDisabledException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
