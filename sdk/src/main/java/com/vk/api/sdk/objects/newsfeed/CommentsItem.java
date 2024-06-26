// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public interface CommentsItem {
    default CommentsItemTypeTopic getNewsfeedCommentsItemAsCommentsItemTypeTopic() {
        return (CommentsItemTypeTopic) this;
    }

    default CommentsItemTypePhoto getNewsfeedCommentsItemAsCommentsItemTypePhoto() {
        return (CommentsItemTypePhoto) this;
    }

    default CommentsItemTypeVideo getNewsfeedCommentsItemAsCommentsItemTypeVideo() {
        return (CommentsItemTypeVideo) this;
    }

    default CommentsItemTypeNotes getNewsfeedCommentsItemAsCommentsItemTypeNotes() {
        return (CommentsItemTypeNotes) this;
    }

    default CommentsItemTypePost getNewsfeedCommentsItemAsCommentsItemTypePost() {
        return (CommentsItemTypePost) this;
    }

    default CommentsItemTypeMarket getNewsfeedCommentsItemAsCommentsItemTypeMarket() {
        return (CommentsItemTypeMarket) this;
    }

    class Deserializer implements JsonDeserializer<CommentsItem> {
        private static final String discriminatorField = "type";

        private static final Map<String, Class<? extends CommentsItem>> subtypes = new HashMap<String, Class<? extends CommentsItem>>() {{
        put("market", CommentsItemTypeMarket.class);
        put("notes", CommentsItemTypeNotes.class);
        put("post", CommentsItemTypePost.class);
        put("topic", CommentsItemTypeTopic.class);
        put("photo", CommentsItemTypePhoto.class);
        put("video", CommentsItemTypeVideo.class);
        }};

        @Override
        public CommentsItem deserialize(JsonElement json, Type typeOfT,
                JsonDeserializationContext context) throws JsonParseException {
            String errorTrace = "";
            try {
                JsonObject data = json.getAsJsonObject();
                String resultSubtypeValue = data.get(discriminatorField).getAsString();
                if (subtypes.containsKey(resultSubtypeValue)) {
                    return context.deserialize(data, subtypes.get(resultSubtypeValue));
                } else {
                    throw new JsonParseException("There is no discriminator field in JSON-object", new com.vk.api.sdk.exceptions.UnexpectedOneOfSubtypeException(resultSubtypeValue, Deserializer.class, subtypes.keySet()));
                }
            } catch (Exception e) {
                // Failed to deserialize CommentsItem object from JSON
                errorTrace = e.getLocalizedMessage();
            }
            throw new JsonParseException("Failed to deserialize CommentsItem object from JSON" + errorTrace);
        }
    }
}
