# 마크다운 문법

## 1. 제목 - Title
\# 문자를 최대 6개 붙여서 제목을 표시함

```
# H1
## H2
### H3
#### H4
##### H5
###### H6
```

# H1
## H2
### H3
#### H4
##### H5
###### H6

<br/>

## 2. 인용문 - BlockQuote

\> 문자를 사용

```
> 첫 번째 블록
>> 두 번째 블록
>>> 세 번째 블록
```

> 첫 번째 블록
>> 두 번째 블록
>>> 세 번째 블록

블록 안에 다른 마크다운 요소를 사용 할 수 있음
```
> # 인용문 제목
> + 인용문 내용
```
> # 인용문 제목
> + 인용문 내용

<br/>

## 3. 목록 - List

- 순서가 있는 목록

    순서가 있는 목록은 숫자와 마침표를 사용하여 표시
    ```
    1. 첫 번째 항목
        1. 첫 번째 하위 항목
        1. 두 번째 하위 항목
    1. 두 번째 항목
    1. 세 번째 항목
    ```

    1. 첫 번째 항목
        1. 첫 번째 하위 항목
        1. 두 번째 하위 항목
    1. 두 번째 항목
    1. 세 번째 항목

    <br/>

    (목록을 사용할 때 적은 번호와 상관없이 순서대로 번호가 매겨짐)

- 순서가 없는 목록

    순서가 없는 목록은 기호 (*, -, +)를 사용하여 표시
    ```
    - 첫 번째 항목
        - 1-1 아이템
        * 1-2 아이템
    + 두 번째 항목
        + 2-1 아이템
            + 2-1-1 아이템
    ```

    - 첫 번째 항목
        - 1-1 아이템
        * 1-2 아이템
    + 두 번째 항목
        * 2-1 아이템
            - 2-1-1 아이템
    
    (혼합해서 사용 가능하지만 기호를 표시하는 방식은 Viewer에 따라 다름)

<br/>

## 4. 링크 - Link

```
//일반적인 링크 사용
//[링크 설명](링크 주소)
[google](https://www.google.com/)

//자동 링크 사용
//<링크 주소>
<https://github.com>

//참조 링크 사용
//링크 삽입시 : [링크 설명][참조 ID]
//링크 참조시 : [참조 ID]: 링크 주소
[Naver][1]
[1]: https://www.naver.com/

```

[google](https://www.google.com/)

<https://github.com>

[Naver][1]

[1]: https://www.naver.com/

<br/>

## 5. 강조 - Emphasis

**특정 문자**에 *서식*을 ***적용***해 <u>강조</u> 할 수 있음 ~~취소선~~

```
*이텔릭체*
**볼드체**
***볼드+이텔릭체***
~~취소선~~
**~~볼드+취소선~~**
<u>밑줄</u>
```

*이텔릭체*

**볼드체**

***볼드+이텔릭체***

~~취소선~~

**~~볼드+취소선~~**

<u>밑줄</u>

<br/>

## 6. 코드 - Code

- 인라인 코드 강조

    \`(grave) 문자를 사용하여 본문의 내용 중 코드를 강조 할 수 있음

    ```
    C언어 에서 정수형 변수는 `int`로 쓴다
    ```

    C언어 에서 정수형 변수는 `int`로 쓴다

- 블록 코드 강조
    \`(grave) 문자를 연속 세 번 사용하여 코드블록을 삽입할 수 있음

    ```
    ```c
    void main()
    {
        int num = 10;
    }
    ``` //c 코드 강조

    ```py
    r1, s = map(int, input().split())
    print((s*2)-r1)
    ``` //Python 코드 강조
    ```

    ```c
    void main()
    {
        int num = 10;
    }
    ```

    ```py
    r1, s = map(int, input().split())
    print((s*2)-r1)
    ```

    지원하는 언어 목록은 [이곳](https://github.com/highlightjs/highlight.js/blob/main/SUPPORTED_LANGUAGES.md)에서 확인 가능

<br/>

## 7. 이미지 - Image

```
//일반적인 이미지 사용
//![대체 텍스트](이미지 주소 "이미지 설명")


//참조 링크를 통한 이미지 사용
//![대체 텍스트][참조 ID]
//[참조 ID](이미지 주소 "이미지 설명")


//이미지에 링크 걸기
//[![대체 텍스트](이미지 주소 "이미지 설명")](링크 주소)


//사이즈 조정 및 정렬을 위해서 HTML의 <img>태그 사용 가능
```

![여우 사진](https://github.com/Cuxel/learn_markdown/blob/master/image/fox.jpg "커여운 여우 쟝")

![매 사진][falcon]

[falcon]: https://github.com/Cuxel/learn_markdown/blob/master/image/falcon.jpg "매 사진"

[![깃 허브 로고](https://github.com/Cuxel/learn_markdown/blob/master/image/github_logo.png "깃 허브 로고")](https://github.com/)

<br/>

