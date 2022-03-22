package com.shaker;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
	  StockItem temp = new StockItem("bread", 0.89, 100);
      stockList.addStock(temp);

      temp = new StockItem("gari",0.50, 174);
      stockList.addStock(temp);

        temp = new StockItem("soap",4.50, 58);
        stockList.addStock(temp);

        temp = new StockItem("guinness",5.50, 800);
        stockList.addStock(temp);

        temp = new StockItem("palm wine",3.70, 10);
        stockList.addStock(temp);

        temp = new StockItem("yoyi",1.50, 510);
        stockList.addStock(temp);
      temp = new StockItem("hennessy",55.00, 20);
      stockList.addStock(temp);

      temp = new StockItem("phone",100, 2);
      stockList.addStock(temp);

      temp = new StockItem("candle",15.00, 20);
      stockList.addStock(temp);

      temp = new StockItem("headphone",300, 1);
      stockList.addStock(temp);


      System.out.println(stockList);

      for(String s: stockList.Items().keySet()){
        System.out.println(s);
      }
      Basket emmanuelsBasket = new Basket("Emmanuel");

      sellItem(emmanuelsBasket, "headphone", 1);
      System.out.println( emmanuelsBasket);

      sellItem(emmanuelsBasket, "headphone", 1);
      System.out.println( emmanuelsBasket);

      if(sellItem(emmanuelsBasket,"headphone", 1 ) != 1){
        System.out.println("There no more headphones in stock ");
      }
      sellItem(emmanuelsBasket, "soda", 7);
//      System.out.println(emmanuelsBasket);


      sellItem(emmanuelsBasket, "guinness", 15);
      sellItem(emmanuelsBasket, "yoyi", 3);
      sellItem(emmanuelsBasket, "soap", 4);
//      System.out.println( emmanuelsBasket);

//      System.out.println(stockList);

      Basket basket = new Basket("customer");
      sellItem(basket, "guinness", 70);
      sellItem(basket,"yoyi", 10);
      removeItem(basket,"guinness", 20);
      System.out.println(basket);


      removeItem(basket,"headphone", 1);
      removeItem(basket,"guinness", 10);
      removeItem(basket,"headphone", 1);
      System.out.println("headphones removed: " + removeItem(emmanuelsBasket, "headphone", 1)); // should not remove any

      System.out.println(emmanuelsBasket);

      // remove all items emmanuelsBasket
      removeItem(emmanuelsBasket,"soap",3);
      removeItem(emmanuelsBasket,"guinness",5);
      removeItem(emmanuelsBasket,"yoyi",10);
      removeItem(emmanuelsBasket,"guinness",5);
      System.out.println(emmanuelsBasket);


      System.out.println("\nDisplay stock list before and after checkout");
      System.out.println(basket);
      System.out.println(stockList);
      checkOut(basket);
      System.out.println(basket);
      System.out.println(stockList);

//      temp = new StockItem("Calculator", 20.50);
//      stockList.Items().put(temp.getName(), temp);
      StockItem guinness = stockList.Items().get("guinness");
        if(guinness != null){
          guinness.adjustStock(500);
        }
      if(guinness != null){
        guinness.adjustStock(-300);
      }

      System.out.println(stockList);

//      for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()){
//        System.out.println(price.getKey() + " cost " + price.getValue());
//      }

      checkOut(emmanuelsBasket);
      System.out.println(emmanuelsBasket);
    }

      public static int sellItem(Basket basket, String item, int quantity){
      // retrieve the item from the stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
          System.out.println("We don't sell " + item) ;
          return 0;

        }
        if(stockList.reserveStock(item, quantity) !=0){
          return basket.addToBasket(stockItem,quantity);
        }
        return 0;
      }
  public static int removeItem(Basket basket, String item, int quantity){
    // retrieve the item from the stock list
    StockItem stockItem = stockList.get(item);
    if(stockItem == null){
      System.out.println("We don't sell " + item) ;
      return 0;

    }
    if(basket.removeFromBasket(stockItem, quantity) == quantity){
      return stockList.unreserveStock(item,quantity);
    }
    return 0;
  }
  public static void checkOut(Basket basket){
      for(Map.Entry<StockItem, Integer> item : basket.Item().entrySet()){
        stockList.sellStock(item.getKey().getName(), item.getValue());
      }
      basket.clearBasket();
  }


}
