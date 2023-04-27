package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public
class Sword extends Weapon {
    public Sword() {
        super("검", 15);
    }
}
