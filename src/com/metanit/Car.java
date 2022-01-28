package com.metanit;

public class Car implements PrintableSecond{

    String brand;
    String model;
    String configuration;
    int price;
    int year;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getConfiguration() {
        return configuration;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public Car(String brand, String model, String configuration, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.configuration = configuration;
        this.price = price;
        this.year = year;
    }

    @Override
    public void println() {
        System.out.println("Марка автомобиля: " + brand + "\n" +
                "Модель: " + model + "\n" +
                "Конфигурация: " + configuration + "\n" +
                "Цена: " + price + "\n" +
                "Год выпуска: " + year + "\n");
    }
}