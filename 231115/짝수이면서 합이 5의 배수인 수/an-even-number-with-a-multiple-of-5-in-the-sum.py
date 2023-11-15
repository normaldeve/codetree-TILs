n = int(input())

def even_five(n):
    return n % 2 == 0 and (n // 10 + (n % 10)) % 5 == 0

if even_five(n) == True:
    print('Yes')
else:
    print('No')