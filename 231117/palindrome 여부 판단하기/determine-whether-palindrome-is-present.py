arr = input()

def palindrome(arr):
    for i in range(len(arr)):
        if arr[i] != arr[len(arr)-1-i]:
            return False
        
    else:
        return True

if palindrome(arr) == True:
    print('Yes')
else:
    print('No')