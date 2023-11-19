MAX_K = 10000

n = int(input())
a = [0] *(2*MAX_K + 1)
black, white = 0,0

current = 0
for _ in range(n):
    distance, direction = tuple(input().split())
    distance = int(distance)

    if direction == 'L':
        while distance > 0:
            a[current] = 1
            distance -= 1

            if distance > 0:
                current -= 1

    else:
        while distance > 0:
            a[current] = 2
            distance -= 1

            if distance > 0:
                current += 1

for i in range(2*MAX_K + 1):
    if a[i] == 1:
        white += 1
    elif a[i] == 2:
        black += 1
    
print(white,black)