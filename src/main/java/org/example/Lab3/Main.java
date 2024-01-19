package org.example.Lab3;

import org.example.Lab3.enums.Category;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        BossOfShop bossOfShop= new BossOfShop();
        worker.setCategory(Category.DAUN);
        worker.setName("Vlad");
        worker.setSalary(2500.50);
        worker.setSalary(worker.taxCalculation(worker));
        bossOfShop.setSalary(2500.50);
        bossOfShop.setSalary(bossOfShop.taxCalculation(bossOfShop));
        System.out.println(worker.getSalary());
        System.out.println(bossOfShop.getSalary());


    }
}