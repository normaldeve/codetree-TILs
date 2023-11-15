n = int(input())

def unique_series(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    
    return unique_series(n//3) + unique_series(n-1)

print(unique_series(n))