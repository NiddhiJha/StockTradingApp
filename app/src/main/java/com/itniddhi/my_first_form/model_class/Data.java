package com.itniddhi.my_first_form.model_class;


import java.util.List;

public class Data {
    private String description;
    private List<Entity> entities;
    private String image_url;
    private String keywords;
    private String language;
    private String published_at;
    private Object relevance_score;
    private List<Similar> similar;
    private String snippet;
    private String source;
    private String title;
    private String url;
    private String uuid;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public Object getRelevance_score() {
        return relevance_score;
    }

    public void setRelevance_score(Object relevance_score) {
        this.relevance_score = relevance_score;
    }

    public List<Similar> getSimilar() {
        return similar;
    }

    public void setSimilar(List<Similar> similar) {
        this.similar = similar;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}


