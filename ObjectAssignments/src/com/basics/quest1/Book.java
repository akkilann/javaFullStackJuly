package com.basics.quest1;

public class Book {

    private String title;
    private String author;
    private String category;
    private float price;

    public Book(String title, String author, String category, float price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void getDetails(){
        System.out.println("Title is : "+ title);
        System.out.println("Author is : "+ author);
        System.out.println("Category is : "+ category);
        System.out.println("Price is: "+ price);
    }

    public void checkBookType(){
        if(price > 500.0){
            System.out.println("Book Type is : PREMIUM");
        }else {
            System.out.println("Book Type is : REGULAR");
        }
    }
}
