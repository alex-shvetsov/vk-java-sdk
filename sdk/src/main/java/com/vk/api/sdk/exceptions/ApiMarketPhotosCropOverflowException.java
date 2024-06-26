// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketPhotosCropOverflowException extends ApiException {
    public static final Integer ERROR_CODE = 1434;

    public static final String ERROR_DESCRIPTION = "Crop bottom right corner is outside of the image";

    public ApiMarketPhotosCropOverflowException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketPhotosCropOverflowException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
