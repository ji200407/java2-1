# 이지은 202330123

## 4월 5일 강의
배열 리턴: 레퍼런스만 리턴(배열 전체가 리턴 되는것이 아님)

메소드의 리턴 타입
  리턴하는 배열의 타입과 리턴 받는 배열 타입 일치
  리턴 타입에 배열의 크기를 지정하지 않음.

예외: 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황 발생 

실세계 객체의 특징: 객체마다 고유한 특성과 행동을 가짐

캡슐화: 객체를 캡슐로 싸서 내부를 볼수 없게 함(외부의 접근으로 부터 객체 보호)

상속: 상위 개체의 속성이 하위개페에 물려짐, 하위 개체가 상위 개체의 속성을 모두 가지는 관계
자바 상속:상위 클래스의 맴버를 하위 클래스가 물려받음
상위 클래스: 수퍼 클래스 / 하위 클래스: 서브 클래스 수퍼 클래스 코드 재사용 새로운 특성 추가 기능

다형성: 같은 이름의 매소드가 클래스 혹은 객체에 따라 다르게 구현되는 것
  메소드의 오버로딩:한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드
  메소드의 오버라이딩 다르게 구현: 슈퍼 클래스와 메소드를 동일한 이름으로 서브 클래스마다 다르게 구현

소프트웨어의 생산성 향상
  컴퓨터 산업 발전에 따라 소프트웨어의 생명주기 단축
  객체지향 언어 
실세계 대한 쉬운 모델링
  초기 프로그래밍:계산절차가 중요

절차지향 프로그래밍: 작업 순서를 표현하는 컴퓨터 프로그램의 집합
객체지향 프로그래밍: 컴퓨터가 수행하는 작업을 객체들간의 상호 작용으로 표현

클래스: 객체의 속성과 행위 선언, 객체의 설계도 혹은 틀
객체:클래스의 틀로 찍어낸 실체  
(ex 클래스:소나타 자동차, 객체: 출고된 실제 소나타 100대)

클래스
  맴버: 클래스 구성 요소
  클래스에 대한 public 접근 지정: 다른 모든 클래스에서 클래스 사용허락

생성자 이름은 클래스 이름과 동일 
생성자는 여러 개 작성 가능

this: 객체 자신에 대한 레퍼런스 

가비지: 가리키는 레퍼런스가 없는것
가비지 컬렉션: 자바 가상 기게가 가비지 자동회수

객체 생성과 non-staic맴버의 생성: non-staic 맴버는 객체가 생성될 때, 객체마다 생긴다


## 3월 29일 강의
내용정리

System.in : 키보드와 연결된 자바의 표준 입력 스트림 직접사용하면 숫자를 변환하는데 어려움이 있음

Scanner : 읽은 바이트를 문자,정수, 실수,불린, 문자열 등 다양한 타입으로 변환 하여 리턴(입력되는 키 값을 공백으로 구분되는 토큰 단위로 읽음/공백 문자:'\t','\f','''')

연산
증감 ++  --  산술 +  -  *  /  %   비교  <  >  >=  <=  ==  !=

조건문?참:거짓
int foo=100;
int bar=50;
int big;

foo>bar?big=foo:big=bar;

비트:byte x =10;

비트연산자
a&b  and연산  두 비트 모두 1이면1 그렇지 않으면0
a|b  or연산   두 비트 모두 0이면0 그렇지 않으면1
a^b  xor연산  두 비트가 다르면1,같으면0
~a   not연산  1을 0으로 , 0을1로 변환



## 3월 22일 강의
내용정리

저급언어
 기계어:진수로 이루어진 언어 기계만 이해 가능
 어셈블리어: 기게어 명령 add,sub,mob등 
고급언어:사람이 이해하기 쉽고 복잡한 작업을 가능하게 하는 언어 ex.c언어

소스:프로그래밍 언어로 복잡한 택스트 파일
컴파일:소스파일을 컴퓨터가 이해할수 있는기계언어로 만드는 과정

Wora를 가능하게 하는 자바의 특징
 바이트 코드:자바 소스를 컴파일한 목적 코드 
 jvm:자바 바이트 코드를 실행하는 자바 가상 기계(소프트웨어) .class를 실행가능

응용프로그램 실행
main()메소드를 가진 클래스의 main()에서 실행(메인,자바에서는 메소드)

jdk:자바 응용 개발 환경(개발 할경우 쓴다)
jre:자바 실행 환경(파일을 실행할때 쓴다)

자바 api:jdk에 포함된 라이브러러리
자바 패키지:서로 관련된 클래스들을 분류하여 묶어 놓음 system.out.println(시스템->아웃->프린트)

class/ main/ print

서브릿:웹서버에 실행되는 자바 프로그램
안드로이드:옛날에 자바로 개발했음 

자바의 특징
 플랫폼의 독립성
 객체지향 언어
   -캡슐화,상속,다향성 지원
 클래스로 캡슐화
   -클래스 안에서 클래스 작성 가능
 소스와 클래스 파일
   -하나의 소스파일에 여러 클래스 가능
 실행코드 배포 
 패키지
 멀티스레드
   -여러스레드의 동시 수행 환경 지원
 가비지 컬렉션
   -자바 언어는 메모리 할당 가능은 있어도 메모리 변화 기능 없음
 실시간 응용프로그램에 부적합
 자바 프로그램은 안전
 프로그램 작성 쉬움 
 실행 속도 개선을 위한 jit컴파일러 사용

식별자:클래스, 변수, 상수, 메소드등의 붙이는 이름

변수:프로그램 실행중에 값을 임시저장하기 위한 공간
변수 선언:데이터 타입에서 정한 크기의 
리터럴:프로그램에서 직접 표현한 값
상수:변수처럼 바꿀수 없다


## 3월 15일 강의
내용정리

git hub 로그인방법
 git config (--global)vser.name"유저 이름"
 git config (--global)vser.email"유저 이메일"
등록확인
 git config vser.name