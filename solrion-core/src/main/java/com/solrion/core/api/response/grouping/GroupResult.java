package com.solrion.core.api.response.grouping;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
@Value
public class GroupResult {

    Long matches;
    Long ngroups;
    List<GroupEntry> entries;

    @JsonCreator
    public GroupResult(
            @JsonProperty("matches") Long matches,
            @JsonProperty("ngroups") Long ngroups,
            @JsonProperty("groups") List<GroupEntry> entries
    ) {
        this.matches = matches;
        this.ngroups = ngroups;
        this.entries = entries;
    }
}
