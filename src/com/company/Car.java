package com.company;

public class Car implements Priceable {
    private int price;
    public Car(int price){
        this.price=price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }
    public String toString(){
        return "цена машины: "+getPrice();
    }
}
