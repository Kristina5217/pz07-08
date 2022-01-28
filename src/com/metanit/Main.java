package com.metanit;

public class Main {

    public static void main(String[] args)
    {
        Day day = Day.SATURDAY;
        System.out.println(day + "\n");
        Day[] days = Day.values();
        for (Day d: days) {
            System.out.print(d + " ");
        }
        System.out.println("\n");
        System.out.println(Color.RED.getCode());
        System.out.println(Color.BLUE.getCode() + "\n");
        Operation op = Operation.SUM;
        System.out.println(op.action(20, 40));
        op = Operation.MULTIPLY;
        System.out.println(op.action(10, 30));
    }
}

interface Printable
{
    default void print()
    {
        System.out.println("Undefined print");
    }
}

class Book implements Printable
{
    String name;
    String author;

    Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    public void print()
    {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable
{
    private String name;

    String getName()
    {
        return name;
    }

    Journal(String name)
    {
        this.name = name;
    }

    public void print()
    {
        System.out.println(name);
    }
}

interface Stateable{

    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}

class WaterPipe implements Stateable{

    public void printState(int n){
        if(n==OPEN)
            System.out.println("Water is opened");
        else if(n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }
}

class ButtonClickHandler implements EventHandler{

    public void execute(){

        System.out.println("Кнопка нажата!");
    }
}

interface EventHandler{

    void execute();
}

class Button{

    EventHandler handler;
    Button(EventHandler action){

        this.handler=action;
    }
    public void click(){

        handler.execute();
    }
}