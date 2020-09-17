package com.example.other.designpatter.dto;

public class ShoppingCartItem {
        private double price;

        public ShoppingCartItem() {
        }

        public ShoppingCartItem(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }