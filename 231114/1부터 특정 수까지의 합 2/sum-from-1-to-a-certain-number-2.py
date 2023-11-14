n = int(input())

def sum_num(n):
    if n == 1:
        return 1
    
    return sum_num(n-1) + n

print(sum_num(n))