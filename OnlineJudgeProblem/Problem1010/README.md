## Problem : 1010(다리 놓기)

---
### 풀이 :
#### nCr(순열 알고리즘)을 가지고 푸는 문제이다.
#### nCr은 n!/(r!*(n-r)!) 이라고 나타낼수 있는데
#### 만약 n이 7이고 r이 4이라면 7*6*5*4*3*2*1/((4*3*2*1)*(3*2*1))이고 7*6*5*4/4*3*2*1 라고 할 수 있는데
#### 이를 식으로 풀면 (n*...*n-r+1)/r!라고 표현할 수 있고 이를 가지고 문제를 해결했다.