package net.vendingmachine;

public class Product
{
private String Description;
private double Price;
private int Quantity;


public Product(String newDescription, double newPrice, int newQuantity)
{
  Description = newDescription;
  Price = newPrice;
  Quantity = newQuantity;
}


public String getDescription()
{
  return Description;
}


public double getPrice()
{
  return Price;
}


public int getQuantity()
{
  return Quantity;
}


public void setDescription(String newDescription)
{
  Description = newDescription;
}


public void setPrice(double newPrice)
{
  Price = newPrice;
}


public void setQuantity(int newQuantity)
{
  Quantity = newQuantity;
}


public String toString()
{  
  return Description + " = $" + Price;
}
}