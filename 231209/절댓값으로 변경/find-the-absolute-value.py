n = int(input())
arr = list(map(int,input().split()))

for x in range(n):
    if arr[x] < 0:
        arr[x] *= -1

for i in arr:
    print(i, end = " ")