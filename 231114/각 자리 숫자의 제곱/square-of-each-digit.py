n = int(input())

def digit_sum(n):
    if n < 10:
        return n ** 2
    
    return digit_sum(n//10) + (n%10)**2 

print(digit_sum(n))