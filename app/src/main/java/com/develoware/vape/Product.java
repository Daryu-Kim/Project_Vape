package com.develoware.vape;

public class Product {
    private String product_name;
    private int product_price;

    public Product() {}

    public String get_product_name() {
        return product_name;
    }

    public void set_product_name(String product_name) {
        this.product_name = product_name;
    }

    public int get_product_price() {
        return product_price;
    }

    public void set_product_price(int product_price) {
        this.product_price = product_price;
    }
}
