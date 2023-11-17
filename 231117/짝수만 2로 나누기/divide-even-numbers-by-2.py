n = int(input())
arr = list(map(int,input().split()))

def change(arr):
    for i in range(len(arr)):
        if arr[i] % 2 == 0:
            arr[i] //= 2

change(arr)
for x in arr:
    print(x, end = " ")