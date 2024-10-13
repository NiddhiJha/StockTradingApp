package com.itniddhi.my_first_form.model_class;

public class Highlight {
    private String highlight;
    private double sentiment;
    private String highlighted_in;

    // Constructor
    public Highlight(String highlight, double sentiment, String highlighted_in) {
        this.highlight = highlight;
        this.sentiment = sentiment;
        this.highlighted_in = highlighted_in;
    }

    // Getters and setters
    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public double getSentiment() {
        return sentiment;
    }

    public void setSentiment(double sentiment) {
        this.sentiment = sentiment;
    }

    public String getHighlighted_in() {
        return highlighted_in;
    }

    public void setHighlighted_in(String highlighted_in) {
        this.highlighted_in = highlighted_in;
    }
}
