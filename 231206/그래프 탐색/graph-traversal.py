arr = tuple(map(int,input().split()))
VERTEX_NUM, n = arr[0], arr[1]

graph = [[] for _ in range(VERTEX_NUM+1)]

vertex = [
    tuple(map(int,input().split()))
    for _ in range(n)
    ]

for start, end in vertex:
    graph[start].append(end)
    graph[end].append(start)

print(len(graph[1]))