n = int(input())

def series(n):
    if n == 1:
        return 2
    if n == 2:
        return 4
    
    return (series(n-1) * series(n-2))%100

print(series(n))