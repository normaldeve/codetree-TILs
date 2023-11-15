# 변수 선언 및 입력:
a, b = tuple(map(int, input().split()))


# 3, 6, 9 숫자가 
# 단 하나라도 포함되었는지를 확인합니다.
def contains_369(n):
    # 계속 10으로 나눠주며
    # 일의 자리를 조사합니다.
    while n > 0:
        if n % 10 == 3 or n % 10 == 6 or n % 10 == 9:
            return True

        n //= 10

    return False


# 3, 6, 9를 포함하거나 3의 배수인지를 판단합니다.
def is_369_number(n):
    return contains_369(n) or (n % 3 == 0)


cnt = 0
for i in range(a, b + 1):
    if is_369_number(i):
        cnt += 1

print(cnt)