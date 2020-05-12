package com.example.designpatter.test;

import com.example.designpatter.ModelTests;
import com.example.designpatter.dto.ShoppingCart;
import com.example.designpatter.dto.ShoppingCartItem;
import org.junit.Test;

import java.util.List;

public class Mytest extends ModelTests {
    @Test
    public void testUnmodifiableList() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new ShoppingCartItem(6.6));
        shoppingCart.addItem(new ShoppingCartItem(7.7));

        List<ShoppingCartItem> items = shoppingCart.getItems();
        items.add(new ShoppingCartItem(6.6));
    }
}
