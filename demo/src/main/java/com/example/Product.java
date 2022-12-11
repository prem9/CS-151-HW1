package com.example;

/**
 * Product class
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public final class  Product // add final to class and private variables remove setters
{
    private final String productName;
    private final String productDesc;
    private final double productPrice;
    private int maximumQuantity;
    
    public Product(String productName1, String productDesc1, double productPrice1, int maximumQuantity1) 
    {
        this.productName = productName1;
        this.productDesc = productDesc1;
        this.productPrice = productPrice1;
        this.maximumQuantity = maximumQuantity1;
    }
    
    
    /**
     * @return retrieves product name
     */
    public String getProdName()
    {
        return productName;
    }
    
    /**
     * @return retrieves description of product
     */
    public String getprodDesc()
    {
        return productDesc;
    }
    
    
    /**
     * @return retrieves age of employee
     */
    public double getPrice()
    {
        return productPrice;
    }
    
    /**
     * @return retrievse maximum quantity allowed to be ordered
     */
    public int getMaxQuant()
    {
        return maximumQuantity;
    }
    
    /**
     * @return prints out all the product's info
     */
    public String toString()
    {
        String productnInfo = "Product Info: " + productName +", " + productDesc + ", $" + String.format("%.2f", productPrice) + ", Maximum Quantity: " + maximumQuantity;
        return productnInfo;
    }
   
}

