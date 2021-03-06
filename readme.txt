1. strategy pattern
- 여러 알고리즘을 하나의 추상적인 접근점(인터페이스)을 만들어 접근점에서 서로 교환 가능하도록 하는 패턴
실습
- 신작 게임에서 캐릭터와 무기를 구현(칼, 검), 추후에 도끼 추가

2. adapter pattern
- 알고리즘을 요구사항에 맞게 사용 가능 
- 변경이 있을 경우 adapter 구현체만 수정하면 됨
실습
- Math클래스(라이브러리)에서 구현된 함수를 float를 사용하도록 지원하는 adapter 클래스를 만들어라
- twoTime 대신 doubled를 사용하도록 변경
- halfOf시 로그를 찍도록 수정

3. template method pattern
- 공통적인 프로세스를 묶어주기
- 알고리즘의 구조를 메서드에 정의하고 하위클래스에서 알고리즘 구조 변경없이 알고리즘을 재정의
- 구현하려는 알고리즘이 일정한 프로세스가 있으며, 변경 가능성이 클때
구현순서
1) 알고리즘을 여러 단계로 나눈다.
2) 나눠진 알고리즘의 단계를 메서드로 선언한다.
3) 알고리즘을 수행할 템플릿 메서드를 만든다.
4) 하위클래스에서 나눠진 메서드들을 구현한다.

실습
- 신작 게임의 접속을 구현
- 보안 -> 인증 -> 권한 -> 접속 순서로 구현하고 각 메서드는 main에서 노출되면 안됨

4. factory method pattern
- 객체의 생성을 한군데서 관리
- 동일한 인터페이스 구현으로 새로운 객체가 추가되더라도 소스의 수정이 없다.
- 제품을 생성하는 부분과 사용하는 부분을 분리 
실습
- 게임 아이템과 아이템 생성을 구현 

5. singleton pattern
- 하나의 인스턴스만 생성하도록 구현

6. prototype pattern
- 복잡한 인스턴스를 복사
- 얕은복사 : 주소값이 동일
- 깊은복사 : 주소값은 다른채로 값들이 복사
실습
- 원 복사 후 1만큼 이동된 원 복사

7. builder pattern
- 많은 변수를 가진 객체의 생성을 가독성 높도록 코딩 가능
- 모델객체에 응용
실습
- 컴퓨터 빌더 만들어보기

8. abstract factory pattern
- 생성하는 부분을 가상화
- 클래스 이름대신 팩토리 메소드를 사용해 객체를 생성하기 때문에, 추후 실제 생성되는 객체가 바뀌거나 추가되어도 문제가 없다.
- 클래스의 대부분의 내용은 숨기고 싶을때, 인터페이스나 abstract를 통해서만 객체에 접근하게 할수 있다.
-  팩토리 메소드가 반드시 객체를 새로 생성할 필요는 없고, 상황에 따라 새로 생성될수도, 기존의 것을 리턴할수도 있다.
실습
- 자전거 만들어보기 body, wheel

9. bridge pattern
- 기능 부분과 구현 부분 분리하여 구현부는 객체의 생성자로 입력받음
- adapter pattern은 새로운 인터페이스를 리턴해주는 개념
- strategy pattern 과 비교하여 생성 시점에 초점이 맞추어져 있음
실습
- 모스부호

10. composite pattern
- 특정 객체를 구성하는 객체들을 동적으로 추가, 삭제
실습
- 폴더에 파일 추가(트리구조) 

11. decorator pattern
- 동적으로 책임 추가
- 대부분의 IO 객체들이 decorator 패턴을 사용
실습
- 커피제조
- 객체의 생성시에 원본객체를 입력값으로 받아 그것을 확장 혹은 변경

12. visitor pattern
- 객체 집단 혹은 객체 구조에 대한 업무구현을 객체 외부로 위임
- 객체간에 결합도가 높은 편이고, 비지터가 객체의 속성값을 직접 제어하므로 캡슐화가 약해짐
실습
- CleanTask, CookTask, BabyCareTask에 대한 행위를 Visitor에게 위임
- 집안 도우미 서비스를 A업체에게 위임하거나 혹은 B업체에 위임, 각 업체는 모든 Task가 구현되어 있어야 함

13. chain of responsibility pattern
- 집합체 내에서 수신해야 할 개체에게 메시지를 전달하여 처리하게 함
실습
plusCalculator가 처리하지 못할경우 다음 객체에게 넘김

14. facade pattern
- 복잡한 과정을 간단하게 제공
- 부르는 함수의 갯수를 줄임으로서 coupling을 좀더 줄이고, 또한 이로인해 추상성이 높아지고 의도가 명확한 코드를 작성

15. observer pattern
- 이벤트 발생 후 객체 외부에서 처리 가능
실습
- 1) 버튼 이벤트 리스터 등록하여 만들어 보기 
- 2) 자바에서 제공하는 Observable을 사용하여 만들어 보기

16. proxy pattern
- 실제 사용되는 객체를 대신해서 역할을 해줌
실습
- 이미지 디스플레이

17. flyweight pattern
- 가능한 많은 데이터는 다른 유사한 객체들과 공유함으로써 메모리 사용을 최소화
실습
- 커피 주문

18. mediator pattern
- 객체간의 M:N 관계를 중재자를 두어 1:1로 만들어준다.
- 객체간의 관계 코드가 중재자 클래스안에 집중됨으로 관리가 편해진다
실습
- 통보센터
- Mediator의 sendEvent가 모든 처리를 담당

19. command pattern
- 요청하는 측과 실제 일을 하는 측을 완전히 분리
실습 
- 요청을 받아 처리하는 측(Warrior)을 Receiver, ButtonControl과 같은 클래스를 Invoker라고 한다
- 이 인보커는 명령을 가지고 있고, execute() 메소드를 호출하면 커멘드 객체에게 특정 작업을 수행하도록 요청 할 수 있다는 사실을 알고 있다
- Command 인터페이스를 구현한 클래스를 ConcreteCommand라고 한다

20. memento pattern
- 현재 객체의 상태를 저장했다가 나중에 꺼내는 패턴
- 어떤 객체의 특정 시점에 대한 상태 정보가 나중에 복원되기 위해 저장되어야 할 경우 객체의 상태정보를 직접 접근하는 것이 정보 은닉이나 캡슐화 원리를 깨뜨릴 때.
실습
- Animal객체를 생성하고 Caretaker를 통해서 생성한 메멘토 객체를 저장, Caretaker를 통해서 추후 가져올 수 있음
- Originator를 통해서 이전 객체를 조작 가능하면 안됨

21. null object pattern
- 정의된 액션을 수행을 하지만 수행의 내용은 비어있는 빈 객체를 기본으로 제공해 줌으로서 예외 처리를 사전에 피하는 안전한 방식의 프로그래밍 패턴
실습 
- java.util.Collections#emptyList() 내부의 EmptyList static 클래스 
- java.util.Collections#emptyMap() 내부의 EmptyMap static 클래스
- java.util.Collections#emptySet() 내부의 EmptySet static 클래스
