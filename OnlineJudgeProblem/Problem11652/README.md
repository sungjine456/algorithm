## Problem : 11652(카드)

---
### 풀이 : 처음에는 "2의 62승보다 작거나 같다." 라는 조건을 보고 BigInteger로 풀었으나 Long으로 풀어도 풀린다.
#### 입력을 다 받은 후 먼저 정렬을 한다.
#### 그 다음 i와 i+1을 비교하면서 i와 i+1이 같다면 count에 +1하고 아니면 
#### count와 maxCount를 비교하여 count가 더 크면 maxCount에 넣어주고 max값도 now값으로 바꿔준다.
#### 그 다음은 count와 now를 초기화 해준다.
#### for문이 끝났을 때 count와 maxCount를 한 번더 비교 해주는데 
#### 이유는 마지막에 i와 i+1이 같은 경우 count와 maxCount를 비교하지 않고 for문이 끝나서 제대로된 비교가 안되는 경우가 있기 때문이다.