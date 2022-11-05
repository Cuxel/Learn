# Python 자료형
## 숫자형  
### 정수형  
```py
>>> a = 123  
>>> a = -178  
>>> a = 0
``` 
### 실수형  
```py
>>> a = 1.2  
>>> a = -3.45

>>> a = 4.24E10  
>>> a = 4.24e-10
```  
### 8진수와 16진수  
```py
>>> a = 0o177 # 8진수 표기법
>>> a = 0x8ff # 16진수 표기법
```  
### 숫자형을 활용하기 위한 연산자  
#### 사칙연산
```py
>>> a + b # 덧셈
>>> a - b # 뺄셈
>>> a * b # 곱셈
>>> a / b # 나눗셈
```  
#### x의 y 제곱  
```py
>>> x ** y
```  
#### 나눗셈의 몫과 나머지  
```py
>>> a % b # a를 b로 나눈 나머지를 반환
>>> a // b # a를 b로 나눈 몫을 반환
```  
## 문자열  
파이썬에서 문자열을 만드는 방법은 총 네가지이다.
```py
"Hello World" # 큰따옴표
'Python is fun' # 작은따옴표
"""Life is too short, You need python""" # 큰따옴표 연속 3개
'''Life is too short, You need python''' # 작은따옴표 연속 3개
```  
### 문자열에 따옴표 포함시키기
1. 문자열에 작은따옴표 포함시키기  
문자열을 큰따옴표로 둘러싼다  
```py
food = "Pyton's favorite food is perl"
```  
2. 문자열에 큰따옴표 포함시키기  
문자열을 작은따옴표로 둘러싼다  
```py
say = '"Python is very easy." he says.'
```  
3. 백슬래시를 이용해 따옴표를 문자열에 포함시키기  
```py
food = 'Pyton\'s favorite food is perl'
say = "\"Python is very easy.\" he says."
```  
### 여러 줄인 문자열  
1. 줄을 바꾸는 이스케이프 코드 '\n' 삽입  
```py
multiline = "Life is too short\nyou need python"
```
2. 연속된 작은따옴표 또는 큰따옴표 사용  
```py
multiline = '''
Life is too short
You need Python
'''
```  
```py
multiline = """
Life is too short
You need Python
"""
```  
#### 이스케이프 코드
코드|설명
|:---:|:---:|
\n|줄 바꿈
\t|Tab 입력
\\\\ |문자 \\를 그대로 표현
\\' |문자 '를 그대로 표현
\\" |문자 "를 그대로 표현
\r|캐리지 리턴, 현재 커서를 가장 앞으로 이동
\f|폼 피드, 현재 커서를 다음줄로 이동
\a|벨소리
\b|백스페이스
\000|널 문자  

### 문자열 연산하기  
1. 문자열 더해서 연결하기 (Concatenation)  
```py
>>> head = "Python"
>>> tail = " is fun!"
>>> head + tail
'Python is fun!'
```  
2. 문자열 곱하기  
```py
>>> a = "python"
>>> a * 2
'pythonpython'
```  
3. 문자열 길이 구하기  
```py
>>> a = "Life is too short"
>>> len(a) # 파이썬의 기본 내장 함수
17
```  
### 문자열 인덱싱과 슬라이싱  
1. 문자열 인덱싱  
```py
>>> a = "Life is too short, You need Python"
>>> a[3]
'e'
>>> a[-1] # 뒤에서 세어서 첫 번째 문자
'n'
```  
2. 문자열 슬라이싱  
```py
>>> a = "Life is too short, You need Python"
>>> a[0:4] # 시작번호 포함, 끝번호 미포함
'Life'
>>> a[5:7]
'is'
>>> a[19:] # 끝부분을 생략하면 그 문자열의 끝까지 추출
'You need Python'
>>> a[:17] # 시작 번호를 생략하면 처음부터 끝 번호까지 추출
```  
3. 슬라이싱으로 문자열 나누기  
```py
>>> a = "20010331Rainy"
>>> date = a[:8]
>>> weather = a[8:]
>>> date
'20010331'
>>> weather
'Rainy'
```  
### 문자열 포매팅  
1. 숫자 바로 대입  
```py
>>> "I eat %d apples." % 3
'I eat 3 apples.'
```  
2. 문자열 바로 대입  
```py
>>> "I eat %s apples." % "five"
'I eat five apples.'
```  
3. 숫자 값을 나타내는 변수로 대입  
```py
>>> number = 3
>>> "I eat %d apples." % number
'I eat 3 apples.'
```  
4. 2개 이상의 값 넣기
```py
>>> number = 10
>>> day = "three"
>>> "I ate %d apples. so I was sick for %s days." % (number, day)
'I ate 10 apples. so I was sick for three days.'
```  
문자열 포맷 코드  
코드|설명
|:---:|:---:|
%s|문자열(string)
%c|문자 하나(char)
%d|정수(integer)
%f|부동 소수(floating-point)
%o|8진수
%x|16진수
%%|Literal % (문자 '%' 자체)  

- %s 포맷 코드는 어떤 형태의 값이든 넣을 수 있는데 % 뒤의 값을 문자열로 바꾸기 때문  
- 포매팅 연산자 %d와 % 문자를 같이 쓸때는 %%를 쓴다  
#### 포맷 코드와 숫자 함께 사용하기  
1. 정렬과 공백  
```py
>>> "%10s" % "hi" # 전체 10칸, 오른쪽 정렬
'        hi'
>>> "%-10sjane" % "hi" # 전체 10칸, 왼쪽 정렬
'hi        jane'
```  
2. 소수점 표현하기  
```py
>>> "%0.4f" % 3.141592 # 소수점 4자리까지 출력
'3.1415'
>>> "%10.4f" % 3.141592 # 전체 10칸, 소수점 4자리까지 출력
```  
#### format함수를 사용한 포매팅  
- 숫자 바로 대입  
```py
>>> "I eat {0} apples.".format(3)
"I eat 3 apples."
```  
- 문자열 바로 대입  
```py
>>> "I eat {0} apples.".format("five")
"I eat five apples."
```  
- 숫자 값을 가진 변수로 대입  
```py
>>> number = 3
>>> "I eat {0} apples.".format(number)
"I eat 3 apples."
```  
- 2개 이상의 값 넣기  
```py
>>> number = 10
>>> day = "three"
>>> "I ate {0} apples. so I was sick for {1} days.".format(number, day)
"I ate 10 apples. so I was sick for three days."
```  
- 이름으로 넣기  
```py
>>> "I ate {number} apples. so I was sick for {day} days.".format(number=10, day=3)
"I ate 10 apples. so I was sick for 3 days."
```  
- 인덱스와 이름을 혼용해서 넣기  
```py
>>> "I ate {0} apples. so I was sick for {day} days.".format(10, day=3)
"I ate 10 apples. so I was sick for 3 days."
```  
- 정렬  
```py
>>> "{0:<10}".format("hi") # 왼쪽 정렬
'hi        '
>>> "{0:>10}".format("hi") # 오른쪽 정렬
'        hi'
>>> "{0:^10}".format("hi") # 가운대 정렬
'    hi    '
```
- 공백 채우기  
```py
>>> "{0:=^10}".format("hi")
'====hi===='
>>> "{0:!<10}".format("hi")
'hi!!!!!!!!'
```  
- 소수점 표현하기  
```py
>>> y = 3.141592
>>> "{0:0.4f}".format(y)
'3.1415'
>>> "{0:10.4f}".format(y)
'    3.1415'
```  
- { 또는 } 문자 표현하기  
```py
>>> "{{ and }}".format()
'{ and }'
```  
중괄호 문자를 포매팅 문자가 아닌 문자 그대로 사용하고 싶은 경우 중괄호 문자 2개를 연속해서 사용한다.  
#### f 문자열 포매팅  
- 사용 방법  
```py
>>> name = '홍길동'
>>> age = 30
>>> f'나의 이름은 {name}입니다. 나이는 {age}입니다.'
'나의 이름은 홍길동입니다. 나이는 30입니다.'
```  
- 표현식 사용  
```py
>>> age = 30
>>> f'나는 내년이면 {age+1}살이 된다.'
'나는 내년이면 31살이 된다.'
```  
- 딕셔너리 사용  
```py
>>> d = {'name':'홍길동', 'age':30}
>>> f'나의 이름은 {d["name"]}입니다. 나이는 {d["age"]}입니다.'
'나의 이름은 홍길동입니다. 나이는 30입니다.'
```  
- 정렬  
```py
>>> f'{"hi":<10}' # 왼쪽 정렬
'hi        '
>>> f'{"hi":>10}' # 오른쪽 정렬
'        hi'
>>> f'{"hi":^10}' # 가운데 정렬
'    hi    '
```  
- 공백 채우기  
```py
>>> f'{"hi":=^10}'
'====hi===='
>>> f'{"hi":!<10}'
'hi!!!!!!!!'
```  
- 소수점 표현  
```py
>>> y = 3.141592
>>> f'{y:0.4f}'
'3.1425'
>>> f'{y:10.4f}'
'    3.1415'
```  