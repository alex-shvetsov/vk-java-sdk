// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.secure;

import com.vk.api.sdk.client.AbstractSecureQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Secure.sendSMSNotification method
 */
public class SecureSendSMSNotificationQuery extends AbstractSecureQueryBuilder<SecureSendSMSNotificationQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userId value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @param message value of "message" parameter.
     */
    public SecureSendSMSNotificationQuery(VkApiClient client, ServiceActor actor, Long userId,
            String message) {
        super(client, "secure.sendSMSNotification", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userId(userId);
        message(message);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public SecureSendSMSNotificationQuery(VkApiClient client, ServiceActor actor) {
        super(client, "secure.sendSMSNotification", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * ID of the user to whom SMS notification is sent. The user shall allow the application to send him/her notifications (, +1).
     *
     * @param value value of "user id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public SecureSendSMSNotificationQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * 'SMS' text to be sent in 'UTF-8' encoding. Only Latin letters and numbers are allowed. Maximum size is '160' characters.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("message")
    public SecureSendSMSNotificationQuery message(String value) {
        return unsafeParam("message", value);
    }

    @Override
    protected SecureSendSMSNotificationQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("message", "user_id", "access_token");
    }
}
