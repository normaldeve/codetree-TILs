# 피보나치 수 구하기
n = int(input())

def f(n):
    if n <= 2:
        return 1
    else:
         return f(n-1) + f(n-2)

print(f(n))