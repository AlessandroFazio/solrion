package com.solrion.core.api.response.grouping;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.LinkedHashMap;
import java.util.Map;

@Accessors(fluent = true)
@Value
public class GroupingResult {

    Map<String, GroupResult> groups;

    @JsonCreator
    public GroupingResult(
            Map<String, GroupResult> groups
    ) {
        this.groups = groups;
    }
}
