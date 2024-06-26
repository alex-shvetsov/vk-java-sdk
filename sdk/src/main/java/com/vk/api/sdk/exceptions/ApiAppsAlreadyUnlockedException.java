// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAppsAlreadyUnlockedException extends ApiException {
    public static final Integer ERROR_CODE = 1251;

    public static final String ERROR_DESCRIPTION = "This achievement is already unlocked";

    public ApiAppsAlreadyUnlockedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAppsAlreadyUnlockedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
