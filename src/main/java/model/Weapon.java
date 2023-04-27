package model;

import Util.Print;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weapon {
  private String name;
  private int enhancementLevel = 0;
  private boolean isBroken = false;
  private int attackPower;

  public Weapon(String name, int attackPower) {
    this.name = name;
    this.attackPower = attackPower;
  }

  public void enhance() throws Exception {
    if (enhancementLevel >= 15) {
      throw new Exception("축하합니다. 최고 강화단계에 도달했습니다. 게임에서 승리했습니다.");
    }

    double successRate = 1.0 - (enhancementLevel * 0.05);
    if (Math.random() < successRate) {
      this.enhancementLevel += 1;
      this.attackPower += 10;
      Print.printSuccess(
          "축하합니다! 강화에 성공했습니다!!\n" + "강화단계 : " + enhancementLevel + "\n공격력 " + attackPower);
    } else {
      this.isBroken = true;
      Print.printFailure("강화에 실패하여 무기가 파괴되었습니다.");
      Print.printGameOver();
      throw new Exception("게임을 종료했습니다.");
    }
  }
}
