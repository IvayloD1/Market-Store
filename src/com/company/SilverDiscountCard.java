package com.company;

public class SilverDiscountCard extends DiscountCardImpl {

  public SilverDiscountCard(String owner, int turnover) {
    super(owner, turnover, 2.0);
  }

  @Override
  public double calculateDiscountRate() {
    double discountRate = getDiscountRate();

    int turnover = getTurnover();

    if (turnover > 300) {
      discountRate = 3.5;
    }
    return discountRate;
  }
}

