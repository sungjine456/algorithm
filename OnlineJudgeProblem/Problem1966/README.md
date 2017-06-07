## Problem : 1966(프린터 큐)

---
### 풀이 :
#### 뽑아 내야하는 문서를 표시하기 위해서 Pair Class를 만들었다.
#### 중요도를 내림 차순으로 정렬하기 위해서 new PriorityQueue<>(Collections.reverseOrder());를 사용했다.
#### (배열을 만들어서 정렬해도 되는 내용이다.)
#### PriorityQueue와 Queue에서 값을 뽑아낸 후 비교하여 같지 않으면 Queue의 값만 맨 뒤로 옮긴다.
#### PriorityQueue와 Queue에서 값을 뽑아낸 후 비교하여 같으면 count에 1을 더해주면서 둘다 지운다.
#### 만약 같은데 Queue에서 뽑아낸 Pair의 index가 1이라면 종료한다. 