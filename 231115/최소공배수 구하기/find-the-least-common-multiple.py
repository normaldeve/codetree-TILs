# 최대공약수를 계산하는 함수
def find_gcd(x, y):
    while(y):
        x, y = y, x % y
    return x

# 최소공배수를 계산하는 함수
def find_lcm(x, y):
    return (x * y) // find_gcd(x, y)

# 두 수를 입력받아 최소공배수를 계산
n, m =map(int,input().split())

lcm = find_lcm(n, m)

print(lcm)