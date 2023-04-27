package model;

import Util.Print;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bow extends Weapon {
  public Bow() {
    super("활", 10);
  }

  @Override
  public void enhance() throws Exception {
    if (getEnhancementLevel() >= 15) {
      throw new Exception("축하합니다. 최고 강화단계에 도달했습니다. 게임에서 승리했습니다.");
    }

    double successRate = 1.0 - (getEnhancementLevel() * 0.05);
    if (Math.random() < successRate) {
      setEnhancementLevel(getEnhancementLevel() + 1);
      setAttackPower(getAttackPower() + 10);
      Print.printSuccess(
       "축하합니다! 강화에 성공했습니다!!\n" + "강화단계 : " + getEnhancementLevel() + "\n공격력 " + getAttackPower());
    } else {
      setEnhancementLevel(Math.max(0, getEnhancementLevel() - 1)); // if failed, decrease enhancement level by 1
      Print.printFailure("강화에 실패하여 강화 단계가 하나 감소하였습니다.");
      if (getEnhancementLevel() == 0) {
        Print.printGameOver();
        throw new Exception("게임을 종료했습니다.");
      }
    }
  }
}
