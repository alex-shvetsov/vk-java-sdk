// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiGroupNeed2faException extends ApiException {
    public static final Integer ERROR_CODE = 703;

    public static final String ERROR_DESCRIPTION = "You need to enable 2FA for this action";

    public ApiGroupNeed2faException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiGroupNeed2faException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
