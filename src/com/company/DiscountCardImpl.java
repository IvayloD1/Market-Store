package com.company;

public abstract class DiscountCardImpl implements DiscountCard{

  private final int turnover;
  private final String owner;
  private final double discountRate;

  public DiscountCardImpl(String owner, int turnover, double discountRate) {
    this.turnover = turnover;
    this.owner = owner;
    this.discountRate = discountRate;
  }

  @Override
  public double calculateDiscountRate() {
    return discountRate;
  }

  @Override
  public double calculateDiscount(double purchaseValue, double discountRate) {
    return purchaseValue * discountRate / 100;
  }

  public double getDiscountRate() {
    return discountRate;
  }

  public int getTurnover() {
    return turnover;
  }

  public String getOwner() {
    return owner;
  }
}