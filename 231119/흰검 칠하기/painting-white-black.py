MAX_K = 10000

n = int(input())
a = [0] *(2*MAX_K + 1)
count_black = [0] *(2*MAX_K + 1)
count_white = [0] *(2*MAX_K + 1)
black, white,gray = 0,0,0

current = 0
for _ in range(n):
    distance, direction = tuple(input().split())
    distance = int(distance)

    if direction == 'L':
        while distance > 0:
            a[current] = 1
            count_white[current] += 1
            distance -= 1

            if distance > 0:
                current -= 1

    else:
        while distance > 0:
            a[current] = 2
            count_black[current] += 1
            distance -= 1

            if distance > 0:
                current += 1

for i in range(2*MAX_K + 1):
    if count_black[i] >= 2 and count_white[i] >= 2:
        gray += 1
    elif a[i] == 1:
        white += 1
    elif a[i] == 2:
        black += 1
    
print(white,black,gray)