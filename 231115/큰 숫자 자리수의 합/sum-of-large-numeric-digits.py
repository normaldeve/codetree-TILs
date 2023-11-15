a, b, c = map(int,input().split())
n = a * b * c

def sum_digit(n):
    if n < 10:
        return n
    
    return sum_digit((n-1) // 10) + n % 10

print(sum_digit(n))