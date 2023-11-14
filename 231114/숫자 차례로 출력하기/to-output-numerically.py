n = int(input())

def print_int1(n):
    if n == 0:
        return
    
    print(n,end = " ")
    print_int1(n-1)

def print_int2(n):
    if n == 0:
        return
    
    print_int2(n-1)
    print(n,end = " ")

print_int2(n)
print()
print_int1(n)