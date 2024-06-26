// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMessagesGroupPeerAccessException extends ApiException {
    public static final Integer ERROR_CODE = 932;

    public static final String ERROR_DESCRIPTION = "Your community can't interact with this peer";

    public ApiMessagesGroupPeerAccessException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMessagesGroupPeerAccessException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
