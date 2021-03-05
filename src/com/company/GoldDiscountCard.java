package com.company;

public class GoldDiscountCard extends DiscountCardImpl {

  public GoldDiscountCard(String owner, int turnover) {
    super(owner, turnover, 2.0);
  }

  @Override
  public double calculateDiscountRate() {
    double discountRate = getDiscountRate();

    int increaseRate = getTurnover() / 100;

    discountRate += increaseRate;

    return discountRate > 10 ? 10 : discountRate;
  }
}
