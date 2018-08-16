package com.kodillla;

public class Calculator {
    private double x;
    private double y;
    public Calculator(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double addition()
    {
        double v = this.x + this.y;
        return v;
    }
    public double substraction()
    {
        double z = this.x - this.y;
        return z;
    }
    public static void main(String args[])
    {
        Calculator calculator = new Calculator(5,4);
        System.out.println("Wynik dodawania: " + calculator.addition() + ", wynik odejmowania: " + calculator.substraction());
    }
}
