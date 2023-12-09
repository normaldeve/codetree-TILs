a, b = tuple(map(int,input().split()))

if a > b:
    a = a + 25
    b = 2 * b

else:
    a = 2 * a
    b = b + 25

print(a, b)