package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();

    public void addOrder( Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws Exception {
         return orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny()
                 .orElseThrow(() -> new Exception("My exception"));
//                .orElseThrow(OrderDoesntExistException::new);
//        return order;
    }

    public int ordersCount() {
        return this.orders.size();
    }
}