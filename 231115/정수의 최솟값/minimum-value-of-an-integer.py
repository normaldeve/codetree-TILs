arr = list(map(int,input().split()))
a, b, c = arr[0], arr[1], arr[2]
def find_min(a,b,c):
    min_val = a
    if min_val > b:
        min_val = b
    if min_val > c:
        min_val = c
    
    return min_val
print(find_min(a,b,c))