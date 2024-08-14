package com.example.hobbie.model.binding;

import com.example.hobbie.model.entities.enums.CategoryNameEnum;
import com.example.hobbie.model.entities.enums.LocationEnum;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class HobbyBindingModel {
    private String name;
    private String description;
    private CategoryNameEnum category;
    private BigDecimal price;
    private LocationEnum location;
    private MultipartFile img;

    public HobbyBindingModel() {
    }

    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 symbols.")
    @NotNull(message = "Hobby name can not be empty.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Size(min = 30, max = 1050, message = "Description must be between 30 and 1050 symbols")
    @NotNull(message = "You need to have a description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull(message = "You have to choose category")
    public CategoryNameEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryNameEnum category) {
        this.category = category;
    }

    @NotNull(message = "You have to set price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @NotNull(message = "You have to choose a location")
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    @NotNull(message = "You have to choose profile picture")
    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }
}
