package com.solrion.core.api.response.stats.classic;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Map;

@Accessors(fluent = true)
@Value
public class StatsResult {

    Map<String, StatsFieldResult> fields;

    @JsonCreator
    public StatsResult(
            @JsonProperty("stats_fields") Map<String, StatsFieldResult> fields
    ) {
        this.fields = fields;
    }
}