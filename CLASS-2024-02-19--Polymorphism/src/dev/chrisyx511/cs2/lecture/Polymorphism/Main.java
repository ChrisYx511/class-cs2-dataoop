package dev.chrisyx511.cs2.lecture.Polymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sale simple = new Sale("Cheese", 5.00);
        Sale discount = new DiscountSale("Gum", 5.00, 2.00);
        System.out.println(simple);
        System.out.println(discount);
        System.out.println(simple.equalDeals(discount)); // Late-binding -> Makes it so that it knows to associate discount.bill() at runtime

        simple = discount;
        simple.announcement(); //But this is still associated with the announcement from Simple because it is
        System.out.println(simple.getClass()); // This shows DiscountSale

        // If we removed the downcast here, this would fail to compare the properties as they don't exist on Object
        System.out.println("Equals and downcasting test: " + simple.equals(discount));

        // Copy Constructor vs Clone Method
        /*
        If there is an array of mixed Sale and DiscountSale objects, and you try to clone them using 'new Sale',
        the DiscountSale objects get squashed to Sale objects. Running clone on them will run their own copy constructors.
         */

        Sale[] arrOfSale = new Sale[]{new Sale("Product 1", 4), new DiscountSale("Product 2", 4, 20)};
        Sale[] cloneOfArrSale = new Sale[2];
        for (int i = 0; i < arrOfSale.length; i++) {
            cloneOfArrSale[i] = new Sale(arrOfSale[i]);
        }
        System.out.println(Arrays.toString(cloneOfArrSale)); //[Simple Price and total cost = $4.0, Discount Price and total cost = $4.0]
        for (int i = 0; i < arrOfSale.length; i++) {
            cloneOfArrSale[i] = arrOfSale[i].clone();
        }
        /*
          Output:
            [Product 1 Price and total cost = $4.0, Product 2 Price = $4.0 Discount = 20.0%
           Total cost = $3.2]
         */
        System.out.println(Arrays.toString(cloneOfArrSale));

    }
}
