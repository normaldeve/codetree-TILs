# 피보나치 수 구하기
n = int(input())

memo = [-1] * (n+1)
def f(n):
    if memo[n] != -1:
        return memo[n]
    if n <= 2:
        return 1
    else:
        memo[n] = fibbo(n-1) + fibbo(n-2)

    return memo[n]

print(f(n))