a, b = tuple(map(int, input().split()))

def is_prime(n):
    if n == 1:
        return False
    for i in range(2,n):
        if n % i == 0:
            return False

    return True


def sum_prime(a,b):
    sum_val = 0
    for x in range(a,b+1):
        if is_prime(x):
            sum_val += x

    return sum_val

print(sum_prime(a,b))