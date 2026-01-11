package com.solrion.core.api.response.facets.classic;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.solrion.core.internal.codec.serde.BucketMapDeserializer;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Map;

@Value
@Accessors(fluent = true)
public class TermsFacetResult {

    Map<String, Long> buckets;

    @JsonCreator
    public TermsFacetResult(
            @JsonDeserialize(using = BucketMapDeserializer.class)
            Map<String, Long> buckets
    ) {
        this.buckets = buckets;
    }
}
