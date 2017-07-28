package com.denejkodlj.partfinder.data;

import java.util.Date;

/**
 * Created by Dmitry on 28.07.2017.
 */

public class Part {
    private String title;
    private String description;
    private int price;

    private User customer;
    private User executor;

    private Date created;
    private Date started;
    private Date complete;

    public Part(String title, String description, int price, User customer, Date created) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.customer = customer;
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public User getExecutor() {
        return executor;
    }

    public void setExecutor(User executor) {
        this.executor = executor;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getComplete() {
        return complete;
    }

    public void setComplete(Date complete) {
        this.complete = complete;
    }
}
