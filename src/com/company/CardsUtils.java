package com.company;

public class CardsUtils {

  public static String getRecipe(double purchaseValue, DiscountCard card) {

    double discountRate = card.calculateDiscountRate();
    double discount = card.calculateDiscount(purchaseValue, discountRate);
    double total = purchaseValue - discount;

    return generateRecipe(purchaseValue, discountRate, discount, total);
  }

  private static String generateRecipe(double purchaseValue, double discountRate, double discount,
      double total) {
    StringBuilder sb = new StringBuilder();

    sb.append(String.format("Purchase value: $%.2f", purchaseValue))
        .append(System.lineSeparator())
        .append(String.format("Discount rate: %.1f%%", discountRate))
        .append(System.lineSeparator())
        .append(String.format("Discount: $%.2f", discount))
        .append(System.lineSeparator())
        .append(String.format("Total: $%.2f", total));

    return sb.toString();
  }
}


