from collections import deque

T = int(input())

for _ in range(T):
    n = int(input())
    blocks = deque(map(int, input().split()))
    
    last = float('inf')  # Start with a very large number

    while blocks:
        if blocks[-1] <= last and (blocks[0] > last or blocks[-1] >= blocks[0]):
            last = blocks.pop()
        elif blocks[0] <= last:
            last = blocks.popleft()
        else:
            print("No")
            break
    else:
        print("Yes")
