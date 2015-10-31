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
                "index",
                "uri",
                "path",
                "score",
                "confidence",
                "fitness",
                "href",
                "mimetype",
                "format",
                "content"
})
public class Result {

    @JsonProperty("index")
    private Integer index;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("path")
    private String path;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("confidence")
    private Integer confidence;
    @JsonProperty("fitness")
    private Integer fitness;
    @JsonProperty("href")
    private String href;
    @JsonProperty("mimetype")
    private String mimetype;
    @JsonProperty("format")
    private String format;
    @JsonProperty("content")
    private Content content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The index
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     *
     * @param index
     * The index
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     *
     * @return
     * The uri
     */
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    /**
     *
     * @param uri
     * The uri
     */
    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     *
     * @return
     * The path
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     * The path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     * The score
     */
    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    /**
     *
     * @param score
     * The score
     */
    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     *
     * @return
     * The confidence
     */
    @JsonProperty("confidence")
    public Integer getConfidence() {
        return confidence;
    }

    /**
     *
     * @param confidence
     * The confidence
     */
    @JsonProperty("confidence")
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     *
     * @return
     * The fitness
     */
    @JsonProperty("fitness")
    public Integer getFitness() {
        return fitness;
    }

    /**
     *
     * @param fitness
     * The fitness
     */
    @JsonProperty("fitness")
    public void setFitness(Integer fitness) {
        this.fitness = fitness;
    }

    /**
     *
     * @return
     * The href
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The mimetype
     */
    @JsonProperty("mimetype")
    public String getMimetype() {
        return mimetype;
    }

    /**
     *
     * @param mimetype
     * The mimetype
     */
    @JsonProperty("mimetype")
    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    /**
     *
     * @return
     * The format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     *
     * @param format
     * The format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     *
     * @return
     * The content
     */
    @JsonProperty("content")
    public Content getContent() {
        return content;
    }

    /**
     *
     * @param content
     * The content
     */
    @JsonProperty("content")
    public void setContent(Content content) {
        this.content = content;
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