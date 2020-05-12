package com.example.designpatter.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ShoppingCart {
    private int itemsCount;
    private double totalPrice;
    private List<ShoppingCartItem> items = new ArrayList<>();

    public int getItemsCount() {
        return this.itemsCount;
    }

    //面向对象封装的定义是：通过访问权限控制，隐藏内部数据，外部仅能通过类提供的有限的接口访问、修改内部数据。
    // 所以，暴露不应该暴露的 setter 方法，明显违反了面向对象的封装特性
    //这样可以修改 造成数据不一致
    /*public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }*/

    //这样可以修改 造成数据不一致
    /*public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }*/

    public double getTotalPrice() {
        return this.totalPrice;
    }


    public List<ShoppingCartItem> getItems() {
        //return this.items; 这样拿到的List是可以被修改的
        //Collection<ShoppingCartItem> shoppingCartItems = Collections.unmodifiableCollection(this.items);
        //return shoppingCartItems;
        return null;
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
        itemsCount++;
        totalPrice += item.getPrice();
    }


    //cart.getItems().clear(); // 清空购物车  造成数据不一致
    public void clear() {
        items.clear();
        itemsCount = 0;
        totalPrice = 0.0;
    }


    // ...省略其他方法...


}

