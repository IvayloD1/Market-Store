package com.company;

public class BronzeDiscountCard extends DiscountCardImpl {

  public BronzeDiscountCard(String owner, int turnover) {
    super(owner, turnover, 0.0);
  }

  @Override
  public double calculateDiscountRate() {
    double discountRate = getDiscountRate();
    int turnover = getTurnover();
    if (turnover >= 100 && turnover <= 300) {
      discountRate = 1.0;
    } else if (turnover > 300) {
      discountRate = 2.5;
    }

    return discountRate;
  }
}


