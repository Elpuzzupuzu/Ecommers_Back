package com.expendedora.GatorGate.Model;


public class ProductDTO {
    private String name;
    private String img;
    private String description;
    private Double price;

    // Constructor
    public ProductDTO(String name, String img, String description, Double price) {
        this.name = name;
        this.img = img;
        this.description = description;
        this.price = price;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
