package com.example;

/**
 * Hello world!
 *
 */
public class Product // add final to class and private variables remove setters
{
    private String productName;
    private String productDesc;
    private double productPrice;
    private int maximumQuantity;
    
    public Product(String productName1, String productDesc1, double productPrice1, int maximumQuantity1) 
    {
        this.productName = productName1;
        this.productDesc = productDesc1;
        this.productPrice = productPrice1;
        this.maximumQuantity = maximumQuantity1;
    }
    /**
     * @param prodName sets the product name
     */
    public void setProdName(String prodName)
    {
        productName = prodName;
    }
    /**
     * @return retrieves product name
     */
    public String getProdName()
    {
        return productName;
    }
    /**
     * @param prodDesc sets description of product
     */
    public void prodDesc(String setDesc)
    {
        productDesc = setDesc;
    }
    /**
     * @return retrieves description of product
     */
    public String getprodDesc()
    {
        return productDesc;
    }
    /**
     * @param setPrice sets price of product
     */
    public void setProdPrice(Double setPrice)
    {
        productPrice = setPrice;
    }
    /**
     * @return retrieves age of employee
     */
    public double getPrice()
    {
        return productPrice;
    }
    /**
     * @param maxQuant sets maximum quantity allowed to be ordered
     */
    public void setMaxQuant(int maxQuant)
    {
        maximumQuantity = maxQuant;
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

