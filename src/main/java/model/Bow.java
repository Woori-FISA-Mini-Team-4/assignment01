package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bow extends Weapon {
  public Bow() {
    super("활", 10);
  }
}
