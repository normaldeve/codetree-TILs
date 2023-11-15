arr = list(map(int,input().split()))

def find_min(arr):
    min_ = 0
    for i in arr:
        min_ = min(min_,i)
    return min_

print(find_min(arr))