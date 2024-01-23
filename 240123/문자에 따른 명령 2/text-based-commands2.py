dirs = input()
x,y = 0,0
curr_dir = 0

dxs = [0,1,0,-1]
dys = [1,0,-1,0]

for c_dir in dirs:
    if c_dir == 'L':
        curr_dir = (curr_dir -1 +4) % 4
    elif c_dir =='R':
        curr_dir = (curr_dir + 1) % 4
    
    else:
        x, y = x + dxs[curr_dir] , y + dys[curr_dir]


print(x,y)