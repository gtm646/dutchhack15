package com.startApp.domain.usg;

import java.util.HashMap;
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
                "query-resolution-time",
                "facet-resolution-time",
                "snippet-resolution-time",
                "total-time"
})
public class Metrics {

    @JsonProperty("query-resolution-time")
    private String queryResolutionTime;
    @JsonProperty("facet-resolution-time")
    private String facetResolutionTime;
    @JsonProperty("snippet-resolution-time")
    private String snippetResolutionTime;
    @JsonProperty("total-time")
    private String totalTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The queryResolutionTime
     */
    @JsonProperty("query-resolution-time")
    public String getQueryResolutionTime() {
        return queryResolutionTime;
    }

    /**
     *
     * @param queryResolutionTime
     * The query-resolution-time
     */
    @JsonProperty("query-resolution-time")
    public void setQueryResolutionTime(String queryResolutionTime) {
        this.queryResolutionTime = queryResolutionTime;
    }

    /**
     *
     * @return
     * The facetResolutionTime
     */
    @JsonProperty("facet-resolution-time")
    public String getFacetResolutionTime() {
        return facetResolutionTime;
    }

    /**
     *
     * @param facetResolutionTime
     * The facet-resolution-time
     */
    @JsonProperty("facet-resolution-time")
    public void setFacetResolutionTime(String facetResolutionTime) {
        this.facetResolutionTime = facetResolutionTime;
    }

    /**
     *
     * @return
     * The snippetResolutionTime
     */
    @JsonProperty("snippet-resolution-time")
    public String getSnippetResolutionTime() {
        return snippetResolutionTime;
    }

    /**
     *
     * @param snippetResolutionTime
     * The snippet-resolution-time
     */
    @JsonProperty("snippet-resolution-time")
    public void setSnippetResolutionTime(String snippetResolutionTime) {
        this.snippetResolutionTime = snippetResolutionTime;
    }

    /**
     *
     * @return
     * The totalTime
     */
    @JsonProperty("total-time")
    public String getTotalTime() {
        return totalTime;
    }

    /**
     *
     * @param totalTime
     * The total-time
     */
    @JsonProperty("total-time")
    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
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