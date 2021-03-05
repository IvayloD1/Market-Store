package com.company;

import java.io.*;
import java.util.InputMismatchException;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {

      String owner = reader.readLine();
      String cardType = String.valueOf(reader.readLine());
      int turnover = Integer.parseInt(reader.readLine());
      double purchaseValue = Double.parseDouble(reader.readLine());

      DiscountCard card;

      if (cardType.equalsIgnoreCase("bronze")) {
        card = new BronzeDiscountCard(owner, turnover);
      } else if (cardType.equalsIgnoreCase("silver")) {
        card = new SilverDiscountCard(owner, turnover);
      } else if (cardType.equalsIgnoreCase("gold")) {
        card = new GoldDiscountCard(owner, turnover);
      } else {
        throw new RuntimeException();
      }

      String result = CardsUtils.getRecipe(purchaseValue, card);
      System.out.println(result);
    } catch (InputMismatchException | NumberFormatException e) {
      System.out.println("Invalid input. Please, try again!");
    } catch (RuntimeException e) {
      System.out.println("Wrong card type at line 2. Please, try again!");
    }
  }
}
