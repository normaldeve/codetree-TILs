MAX_N = 1000
MOD = 1000000007

n = int(input())
dp = [0] * (MAX_N + 1)

dp[0] = 1
dp[1] = 2
dp[2] = 7

for i in range(3, n+1):
    dp[i] = (2*dp[i-1] + 3*dp[i-2]) % MOD

print(dp[n])