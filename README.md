# assignment01

FISA 미니 프로젝트 팀4의 미니 과제에 오신 것을 환영합니다. 이 과제는 Java의 상속, 다형성, 그리고 예외 처리에 대한 이해도를 증진시키는 것을 목표로 합니다.

# 실행

```
git clone https://github.com/Woori-FISA-Mini-Team-4/assignment01.git
```

# 요구사항

1. model 패키지에 Weapon 클래스를 상속받는 네 가지 무기 클래스를 생성합니다.

- Bow (활, 공격력 : 10)
- Mace (둔기, 공격력 : 12)
- Staff (스태프, 공격력 : 8)
- Sword (검, 공격력 : 15)

2. controller 패키지에 있는 EnhancementController 클래스에 Weapon 타입을 파라미터로 받는 enhanceWeapon 메소드를 생성하세요.
3. 파라미터로 받은 Weapon 클래스의 enhance 메소드가 호출되게 하세요.
4. 이때, 적절한 예외처리 방법을 통해, 예외 발생시 실행이 중단되고 해당 예외를 처리하는 코드를 작성하세요.
5. Weapon 클래스에서 구현되어 있는 enhance 메소드에서 주석을 참고한 후, 적절한 예외처리 방법을 사용하여, 명시적으로 예외을 발생시키고, 예외발생을 전달하는 코드를 작성하세요.
6. GameUI 클래스에서 선택한 무기에 따라서 Weapon 객체를 생성하고, weapon 변수에 할당하는 코드를 작성하세요. (1, 2, 3, 4) 이 네가지가 아닌 입력값이 받아져 온다면, 시스템을
   종료시키세요.
