// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMobileNotActivatedException extends ApiException {
    public static final Integer ERROR_CODE = 146;

    public static final String ERROR_DESCRIPTION = "The mobile number of the user is unknown";

    public ApiMobileNotActivatedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMobileNotActivatedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
