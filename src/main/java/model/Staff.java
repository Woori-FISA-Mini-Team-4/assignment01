package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Staff extends Weapon {
  public Staff() {
    super("스태프", 8);
  }
}
