package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Order order1 = new Order("B-512");
        Order order2 = new Order("B-514");
        Order order3 = new Order("B-516");
        Order order4 = new Order("B-518");

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);
        warehouse.addOrder(order4);

        String findOrderNumber = "B-516";
        try {
            Order requiredOrder = warehouse.getOrder(findOrderNumber);
            System.out.println("Order " + findOrderNumber + " exist.");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, order " + findOrderNumber + " doesnt exists.");
        }

        findOrderNumber = "C-512";
        try {
            Order requiredOrder = warehouse.getOrder(findOrderNumber);
            System.out.println("Order "+ findOrderNumber +" exists");
        } catch (OrderDoesntExistException e){
            System.out.println("Sorry but order " + findOrderNumber +  " does not exists.");
        }
    }
}