package com.example;

/**
 * Tests product class
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class ProductTest
{
    public static void main(String[] args) 
    {
        Product product1 = new Product("Pepsi", "A type of coke", 1, 100);
        System.out.println(product1.toString());
    }

}