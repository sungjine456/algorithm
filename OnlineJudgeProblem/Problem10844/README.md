## Problem : 10844(쉬운 계단 수)

---
### 풀이 :
#### 첫  1~9는 1이고 그 다음 부터는 0은 이전의 1의 수를 9는 8의 수를 이외의 수 N은 (N+1) + (N-1)을 계속 더해가면 된다.
#### 1000000000로 나누는 것은 DP를 진행할 때 마지막 sum을 구할 때도 해주어야된다.