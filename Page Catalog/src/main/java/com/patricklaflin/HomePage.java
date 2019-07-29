package com.patricklaflin;

import java.net.MalformedURLException;
import java.net.URL;

public class HomePage {
    String owner;
    URL address;
    String category = "none";

    public HomePage(String inOwner, String inAddress) throws MalformedURLException {
        this.owner = inOwner;
        this.address = new URL(inAddress);
    }

    public HomePage(String inOwner, String inAddress, String inCategory) throws MalformedURLException {
        this(inOwner, inAddress);
        this.category = inCategory;
    }
}
