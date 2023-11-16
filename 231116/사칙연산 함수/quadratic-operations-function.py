arr = list(input().split())
val1, opt, val2 = int(arr[0]), arr[1], int(arr[2])

def operator(val1,opt,val2):
    if opt == '+':
        return val1 + val2
    if opt == '-':
        return val1 - val2
    if opt == '/':
        return int(val1 / val2)
    if opt == '*':
        return val1 * val2
    
    return False

if operator(val1,opt,val2) != False:
    print(f'{val1} {opt} {val2} = {operator(val1,opt,val2)}')
else:
    print('False')