package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productsName;
    private double quantity;

    public Order(String orderNumber, String productsName, double quantity) {
        this.orderNumber = orderNumber;
        this.productsName = productsName;
        this.quantity = quantity;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getProductsName() {
        return productsName;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.quantity, quantity) == 0 &&
                Objects.equals(orderNumber, order.orderNumber) &&
                Objects.equals(productsName, order.productsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productsName, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productsName='" + productsName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}