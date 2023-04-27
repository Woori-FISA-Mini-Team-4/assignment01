package view;

import Util.Print;
import controller.EnhancementController;
import model.Bow;
import model.Mace;
import model.Staff;
import model.Sword;
import model.Weapon;

import java.util.Scanner;

public class GameUI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Print.gameStart();

    int choice = scanner.nextInt();

    Weapon weapon;

    switch (choice) {
      case 1:
        weapon = new Bow();
        break;
      case 2:
        weapon = new Staff();
        break;
      case 3:
        weapon = new Sword();
        break;
      case 4:
        weapon = new Mace();
        break;
      default:
        System.out.println("올바른 입력이 아닙니다. 게임을 종료합니다.");
        return;
    }

    EnhancementController enhancementController = new EnhancementController();

    while (!weapon.isBroken()) {
      System.out.println("무기를 강화하시겠습니까? (yes/no)");
      String response = scanner.next();
      if (response.equalsIgnoreCase("yes")) {
        enhancementController.enhanceWeapon(weapon);
      } else {
        System.out.println(
            "게임을 종료합니다. 무기 최종 스텟\n강화단계 : "
                + weapon.getEnhancementLevel()
                + "\n무기 공격력 :  "
                + weapon.getAttackPower());
        break;
      }
    }
  }
}
