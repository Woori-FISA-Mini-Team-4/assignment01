package controller;

import model.Weapon;

public class EnhancementController {

  public void enhanceWeapon(Weapon weapon) {
    try {
      weapon.enhance();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
