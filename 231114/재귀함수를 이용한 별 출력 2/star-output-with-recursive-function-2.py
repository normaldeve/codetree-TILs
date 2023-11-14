n = int(input())

def print_stars(n):
    if n == 0:
        return
    
    print(" ".join("*" for _ in range(n)))
    print_stars(n-1)
    print(" ".join("*" for _ in range(n)))

print_stars(n)