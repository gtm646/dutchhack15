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
                "snippet-format",
                "total",
                "start",
                "page-length",
                "results",
                "facets",
                "query",
                "qtext",
                "metrics"
})
public class Example {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("snippet-format")
    private String snippetFormat;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("total")
    private Integer total;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("start")
    private Integer start;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("page-length")
    private Integer pageLength;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("facets")
    private Facets facets;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("query")
    private Query query;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("qtext")
    private String qtext;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("metrics")
    private Metrics metrics;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * (Required)
     *
     * @return
     * The snippetFormat
     */
    @JsonProperty("snippet-format")
    public String getSnippetFormat() {
        return snippetFormat;
    }

    /**
     *
     * (Required)
     *
     * @param snippetFormat
     * The snippet-format
     */
    @JsonProperty("snippet-format")
    public void setSnippetFormat(String snippetFormat) {
        this.snippetFormat = snippetFormat;
    }

    /**
     *
     * (Required)
     *
     * @return
     * The total
     */
    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * (Required)
     *
     * @param total
     * The total
     */
    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     *
     * (Required)
     *
     * @return
     * The start
     */
    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    /**
     *
     * (Required)
     *
     * @param start
     * The start
     */
    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     *
     * (Required)
     *
     * @return
     * The pageLength
     */
    @JsonProperty("page-length")
    public Integer getPageLength() {
        return pageLength;
    }

    /**
     *
     * (Required)
     *
     * @param pageLength
     * The page-length
     */
    @JsonProperty("page-length")
    public void setPageLength(Integer pageLength) {
        this.pageLength = pageLength;
    }

    /**
     *
     * (Required)
     *
     * @return
     * The results
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * (Required)
     *
     * @param results
     * The results
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     *
     * (Required)
     *
     * @return
     * The facets
     */
    @JsonProperty("facets")
    public Facets getFacets() {
        return facets;
    }

    /**
     *
     * (Required)
     *
     * @param facets
     * The facets
     */
    @JsonProperty("facets")
    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    /**
     *
     * (Required)
     *
     * @return
     * The query
     */
    @JsonProperty("query")
    public Query getQuery() {
        return query;
    }

    /**
     *
     * (Required)
     *
     * @param query
     * The query
     */
    @JsonProperty("query")
    public void setQuery(Query query) {
        this.query = query;
    }

    /**
     *
     * (Required)
     *
     * @return
     * The qtext
     */
    @JsonProperty("qtext")
    public String getQtext() {
        return qtext;
    }

    /**
     *
     * (Required)
     *
     * @param qtext
     * The qtext
     */
    @JsonProperty("qtext")
    public void setQtext(String qtext) {
        this.qtext = qtext;
    }

    /**
     *
     * (Required)
     *
     * @return
     * The metrics
     */
    @JsonProperty("metrics")
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     *
     * (Required)
     *
     * @param metrics
     * The metrics
     */
    @JsonProperty("metrics")
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
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
