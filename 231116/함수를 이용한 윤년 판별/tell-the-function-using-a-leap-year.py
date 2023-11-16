n = int(input())

def leap_year(n):
    if n % 4 != 0:
        return False
    if n % 100 != 0:
        return True
    if n % 400 == 0:
        return True
    
    return False

if leap_year(n):
    print("true")
else:
    print("fasle")