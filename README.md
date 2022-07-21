# Algorism

## 몇가지 기술들을 정리하기


1. StringBuilder 는 reverse 오름차순이 가능하다 ( 자연수 뒤집기 )

스트링 빌드를 가져온다 ?
StringBuilder sb = new StringBuilder(str);
스트링 빌드에서 뒤집는다 ?
sb = sb.reverse();

1-1. 내림차순
문자  배열 = 변수.문자 배열 변환
		char[] arr = str.toCharArray();
문자배열을 내림차순으로 ?
Arrays.sort(arr);

1-2. 가장 마지막 인덱스부터 내려오는 반복문
// arr. length -1은 배열의 가장 마지막 인덱스를 의미
for (int i = arr.length - 1; i >= 0; i--)
str += arr[i]; // 문자열 변수에 문자 배열을 넣는다


2. 배열로 만들기 ( 꼭 .split("") 하면 이게 배열화 시킬 수 있다...
String[] arr = sb.toString().split("");

3. 무적의 정수형으로 변환하기
Integer.parseInt(arr[i]);


