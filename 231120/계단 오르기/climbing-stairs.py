n = int(input())

def f(n):
    if n == 1 or n == 2 or n == 3:
        return 1
    if n == 0:
        return 0
    else:
        return f(n-2) + f(n-3)

print(f(n))