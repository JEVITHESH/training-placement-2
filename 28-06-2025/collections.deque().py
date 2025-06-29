from collections import deque
n = int(input())
dq = deque()
for _ in range(n):
    parts = input().split()
    command = parts[0]
    if len(parts) == 2:
        getattr(dq, command)(parts[1])
    else:
        getattr(dq, command)()
print(*dq)
