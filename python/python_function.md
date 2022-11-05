# 유용한 함수 모음  
## 문자열 관련 함수  
- 문자 개수 세기 (count)  
문자열 중 특정 문자의 개수를 반환한다.
```py
>>> a = "hobby"
>>> a.count('b')
2
```  
- 위치 알려주기 1 (find)  
문자열 중 특정 문자가 처음으로 나온 위치를 반환한다. 만약 찾는 문자나 문자열이 존재하지 않는다면 -1을 반환한다.  
```py
>>> a = "Python is the best choice"
>>> a.find('b')
14
>>> a.find('k')
-1
```  
- 위치 알려주기 2 (index)  
문자열 중 특정 문자가 처음으로 나온 위치를 반환한다. 만약 찾는 문자나 문자열이 없을 경우 오류를 발생시킨다.
```py
>>> a = "Life is too short"
>>> a.index('t')
8
```  
- 문자열 삽입 (join)  
매개변수 문자열의 각각의 문자 사이에 해당 문자열을 삽입시킨다.  
```py
>>> ",".join('abcd')
'a,b,c,d'
```  
- 소문자를 대문자로 바꾸기 (upper)  
소문자를 대문자로 바꾸어 준다.  
```py
>>> a = "hi"
>>> a.upper()
'HI'
```  
- 대문자를 소문자로 바꾸기 (lower)  
대문자를 소문자로 바꾸어 준다.
```py
>>> a = "HI"
>>> a.lower()
'hi'
```  
- 왼쪽 공백 지우기 (lstrip)  
문자열 중 가장 왼쪽에 있는 한 칸 이상의 연속된 공백들을 모두 지운다.  
```py
>>> a = "   hi "
>>> a.lstrip()
'hi '
```  
- 오른쪽 공백 지우기 (rstrip)  
문자열 중 가장 오른쪽에 있는 한 칸 이상의 연속된 공백들을 모두 지운다.  
```py
>>> a = " hi "
>>> a.rstrip()
' hi'
```  
- 양쪽 공백 지우기 (strip)  
문자열 양쪽에 있는 한 칸 이상의 연속된 공백들을 모두 지운다.  
```py
>>> a = " hi "
>>> a.strip()
'hi'
```  
- 문자열 바꾸기 (replace)  
replace(바뀌게 될 문자열, 바꿀 문자열)처럼 사용해서 문자열 안의 특정한 값을 다른 값으로 치환해준다.  
```py
>>> a = "Life is too short"
>>> a.replace("Life", "Your leg")
'Your leg is too short'
```  
- 문자열 나누기 (split)  
split 함수는 매개변수로 아무 값도 넣어주지 않으면 공백을 기준으로 문자열을 나누어 준다. 만약 매개변수로 특정 값이 있을 경우 솰호안의 값을 구분자로 해서 문자열을 나누어 준다.  
```py
>>> a = "Life is too short"
>>> a.split()
['Life', 'is', 'too', 'short']
>>> b = "a:b:c:d"
>>> b.split(':')
['a', 'b', 'c', 'd']
```