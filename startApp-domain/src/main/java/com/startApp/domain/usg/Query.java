package com.startApp.domain.usg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
                "and-query"
})
public class Query {

    @JsonProperty("and-query")
    private List<AndQuery> andQuery = new ArrayList<AndQuery>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The andQuery
     */
    @JsonProperty("and-query")
    public List<AndQuery> getAndQuery() {
        return andQuery;
    }

    /**
     *
     * @param andQuery
     * The and-query
     */
    @JsonProperty("and-query")
    public void setAndQuery(List<AndQuery> andQuery) {
        this.andQuery = andQuery;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
