package dto;

import java.util.Date;
import java.util.List;

/**
 *
 * Entity implementation class for Entity: Item
 *
 */

public class ItemDTO {

    private long id;
    private String name;
    private String countryOrigin;
    private String photograph;
    private String category;
    private double price;
    private Date publhishedDate;

    private List<ItemDTO> selledItems;


    public ItemDTO(String name, String countryOrigin, String photograph, String category, double price, Date publhishedDate) {
        this.name = name;
        this.countryOrigin = countryOrigin;
        this.photograph = photograph;
        this.category = category;
        this.price = price;
        this.publhishedDate = publhishedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getPhotograph() {
        return photograph;
    }

    public void setPhotograph(String photograph) {
        this.photograph = photograph;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublhishedDate() {
        return publhishedDate;
    }

    public void setPublhishedDate(Date publhishedDate) {
        this.publhishedDate = publhishedDate;
    }
}
