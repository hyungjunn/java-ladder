# 사다리타기 - FP, OOP
## 1단계 - 스트림, 람다, Optional
### 1단계 피드백
- [ ] 스트림을 사용할 때는 연산 순서를 고려해서 사용하라
- [x] 에러 메세지는 항상 구체적으로 작성하라

## 2단계 - 사다리(생성)
### 기능 요구사항
- 사다리 게임에 참여하는 사람의 이름은 최대 5글자. 사다리를 출력할 때 사람 이름도 같이 출력
- 사람 이름은 쉼표(,)를 기준으로 split
- 라인이 겹치지 않도록 한다
### 프로그래밍 요구사항
- 자바8의 스트림과 람다를 적용해 프로그래밍한다
- 규칙 6: 모든 엔티티를 작게 유지한다

### 기본 구조
tdd를 통한 개발을 할 때 도메인, 요구 사항에 대한 명확한 이해가 있어야 하기 때문에 기본 구조를 파악하고 목록을 작성한다
- 참가자의 수(n)만큼 세로선(`|`)이 생긴다. 즉, 사다리의 간격은 (n-1)개이다. 
- 사다리의 너비는 참가자의 수(n)에 따라 결정난다.
- 사다리는 가로선(`-----`)을 통해 경로를 생성한다.
  - 이 때, 가로선은 두 개의 세로선 사이에 생긴다.
  - 가로선이 생겼다면, 그 다음 공간(두 세로선 사이)에는 빈 공간이 되어야 한다.
### class 구성(의존방향의 가장 마지막 노드부터)
- `Point`: 사다리의 가로선의 존재를 나타내는 객체 
- `Line`: 사다리의 한 줄을 나타내는 객체
- `Ladder`: 사다리를 나타내는 객체
- `LadderGame`: 사다리게임을 나타내는 객체
- `InputView`: 사용자 입력을 나타내는 객체
- `OutputView`: 출력 부분을 나타내는 객체 
### 기능 구현 목록
- [ ] Line 객체를 초기화했을 때, 참가자의 수에 따라 리스트의 크기가 설정된다(ex. 참가자의 수가 3이라면 길이는 (3 - 1) * 5 만큼 생긴다)
- [ ] Line 객체를 초기화했을 때, 앞 부분이 가로선이 생겼다면 그 다음 부분은 공백이 된다
