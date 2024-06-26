// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesCantDeleteForAllException extends ApiException {
    public static final Integer ERROR_CODE = 924;

    public static final String ERROR_DESCRIPTION = "Can't delete this message for everybody";

    public ApiMessagesCantDeleteForAllException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesCantDeleteForAllException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
