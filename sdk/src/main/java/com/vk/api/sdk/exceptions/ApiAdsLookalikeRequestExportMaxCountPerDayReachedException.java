// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiAdsLookalikeRequestExportMaxCountPerDayReachedException extends ApiException {
    public static final Integer ERROR_CODE = 635;

    public static final String ERROR_DESCRIPTION = "Max count of lookalike request audience saves per day reached";

    public ApiAdsLookalikeRequestExportMaxCountPerDayReachedException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiAdsLookalikeRequestExportMaxCountPerDayReachedException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
