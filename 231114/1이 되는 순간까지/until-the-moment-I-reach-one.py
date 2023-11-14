n = int(input())

def count(n):
    if n == 1:
        return 0
    
    if n % 2 == 0:
        return count(n // 2) + 1
    
    else:
        return count(n//3) + 1
    
print(count(n))