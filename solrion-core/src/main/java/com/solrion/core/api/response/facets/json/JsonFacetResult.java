package com.solrion.core.api.response.facets.json;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Accessors(fluent = true)
@Value
public class JsonFacetResult {

    List<JsonFacetBucket> buckets;
    Map<String, Object> scalars;

    public JsonFacetResult(
            @JsonProperty("buckets") List<JsonFacetBucket> buckets
    ) {
        this.buckets = buckets;
        this.scalars = new LinkedHashMap<>();
    }

    @JsonAnySetter
    void capture(String name, Object value) {
        scalars.put(name, value);
    }
}