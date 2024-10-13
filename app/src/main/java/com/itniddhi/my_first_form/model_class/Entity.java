package com.itniddhi.my_first_form.model_class;

import java.util.List;

public class Entity {
    private String symbol;
    private String name;
    private String exchange;
    private String exchange_long;
    private String country;
    private String type;
    private String industry;
    private double match_score;
    private double sentiment_score;
    private List<Highlight> highlights;

    // Constructor


    // Getters and setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getExchange_long() {
        return exchange_long;
    }

    public void setExchange_long(String exchange_long) {
        this.exchange_long = exchange_long;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public double getMatch_score() {
        return match_score;
    }

    public void setMatch_score(double match_score) {
        this.match_score = match_score;
    }

    public double getSentiment_score() {
        return sentiment_score;
    }

    public void setSentiment_score(double sentiment_score) {
        this.sentiment_score = sentiment_score;
    }

    public List<Highlight> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<Highlight> highlights) {
        this.highlights = highlights;
    }
}
