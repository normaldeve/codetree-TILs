n = int(input())

def odd_even(n):
    if n % 2 == 0:
        if n == 2:
            return 2
        return odd_even(n-2) + n
    else:
        if n == 1:
            return 1
        return odd_even(n - 2) + n

print(odd_even(n))