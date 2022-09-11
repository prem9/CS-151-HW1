package com.example;

/**
 * Hello world!
 *
 */
public class Product 
{
    String productName;
    String productDesc;
    double productPrice;
    int maximumQuantity;
    
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
        String productnInfo = "Product Info: " + productName +", " + productDesc + ", $" + String.format("%.20f", productPrice) + ", Maximum Quantity: " + maximumQuantity;
        return productnInfo;
    }
   
}

