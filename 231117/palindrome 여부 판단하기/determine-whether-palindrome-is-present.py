arr = input()

def palindrome(arr):
    for i in range(len(arr)):
        if arr[i] == arr[len(arr)-1-i]:
            return True
        
    else:
        return False

if palindrome(arr) == True:
    print('Yes')
else:
    print('No')