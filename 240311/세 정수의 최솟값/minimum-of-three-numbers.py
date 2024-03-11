arr = list(map(int,input().split()))
min_ = 0

for i in arr:
    if i <= min_:
        min_ = i
    
print(min_)