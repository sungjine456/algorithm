## Problem : 1676(팩토리얼 0의 개수)

---
### 풀이 : 0일 떄는 0이다.
#### 0의 개수는 2, 5, 10이 곱해질 경우를 새면된다.
#### 그러면 2나 5의 배수를 새면되는데 2의 배수는 항상 5의 배수보다 작기 때문에 5의 배수를 새면된다.
#### 5의 배수 5, 10, 15, 20, 25, .....
#### 그런데 25의 경우 5 * 5로 5가 2개 있다. 그래서 25의 배수는 1을 더해준다. 
#### 현재 문제는 500까지 팩토리얼이 주어졌기 때문에 위와 같은 경우 때문에 125의 배수는 1을 더 더해준다.