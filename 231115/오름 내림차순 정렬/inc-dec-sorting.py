n = int(input())
arr = list(map(int,input().split()))

arr.sort()
for x in arr:
    print(x, end = " ")
arr.sort(reverse=True)
print()
for x in arr:
    print(x, end = " ")