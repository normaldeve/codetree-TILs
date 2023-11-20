k, n = tuple(map(int,input().split()))
answer = []

def print_result():
    for i in answer:
        print(i, end = " ")
    print()

def choose(curr_num):
    if curr_num == n:
        print_result()
        return
    
    for i in range(1, k+1):
        answer.append(i)
        choose(curr_num + 1)
        answer.pop()
    
choose(0)