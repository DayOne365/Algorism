# Algorism

## 자주 쓰게 될 패턴 

### 매개변수 인트형을 문자열로 바꾸기
```
String divNum = String.valueOf(x); // 인트형 매개변수를 문자열로 바꾸어 변수에 저장
```

### 문자열 변수의 배열을 역순으로 재배열할 때
```
StringBuilder sb = new StringBuilder(str);
sb = sb.reverse();
```

### 문자열 배열 변수로 바꾸는 방법
```
String[] arr = sb.toString().split("");
```

### 문자열을 인트형을 바꾸기
```
Integer.parseInt((divNum.substring(i,i+1)) // 인덱스로 해당 위치의 값 축출하기

```

### 인덱스로 글자 빼기
```
substring (인덱스, 인덱스 -1)
```

### 리스트 생성하기
```
 ArrayList<Integer> list = new ArrayList<>();
```

### 리스트 반복문 모양

```
for (int a : arr)
list.add(a);
```

### 최소값 구하기

```
 int temp = arr[0];
   for (int a : list) {
     if (a < temp) {
       temp = a;
       }
    }
```
```
int min = Integer.MAX_VALUE;
for (int a : arr ){
   if(min > a ) min = a;
} 



```

### 리스트에 해당 값 삭제하기
```		
list.remove(list.indexOf(temp));
```

### 문자열 배열을 문자 배열로 변환

```
# 배열끼리의 바꾸기 ( 문자 배열 = 문자열 배열 )
char[] arr = str.toCharArray(); // 무언가 하나하나 꺼내어 비교해볼 필요가 있을 때 사용

## 
ch = s.charAt(i); // 문자 = 문자열
```

### 가장 마지막 인덱스로부터 [0]번 인덱스로 거꾸로 반복문
```
for (int i = arr.length - 1; i >= 0; i--)
str += arr[i];
```

### 정수의 각 자릿수의 숫자 분리하기
```
while(n >= 1){
answer += n % 10;
n /= 10;}
```
### 대문자 -> 소문자 / 소문자 -> 대문자로 바꾸기
```
StringBuilder sb = new StringBuilder(); // -> 역순 재배열 가능 reverse()
sb.append(Character.toUpperCase(c) // -> 대문자로 변환
sb.append(Character.toLowerCase(c) // -> 소문자로 변환
```

### 해시함수 쓰기
```
Map<String, Integer> map = new HashMap<>(); // 키는 String , 값은 Integer로 생성
map.put(p, map.get(p) + 1) // put(키, 값)
```
###배열에서 동일한 것 찾기
```
seoul[i].equals(kim) // -> 서울이라는 배열에서 반복하며 kim의 변수 값과 동일한게 있는지 찾기 (동일한 값의 인덱스를 알 수 있다.
```

###문자 자료형의 숫자도 대소 관계 적용된다.
```
if(!(temp[i] >= '0' && temp[i] <= '9'))
```
