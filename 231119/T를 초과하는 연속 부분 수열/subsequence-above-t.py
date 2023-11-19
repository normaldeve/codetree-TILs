n, t = tuple(map(int, input().split()))
arr = list(map(int,input().split()))

ans, cnt = 0,0
for i in range(n):
    if arr[i] < t:
        ans = 0
    else:
        if i >= 1 and a[i] == a[i-1] + 1:
            cnt += 1
        else:
            cnt = 1
    
    ans = max(ans,cnt)

if ans >= 2:
    print(ans)
else:
    print(0)