from collections import OrderedDict
n = int(input())
items = OrderedDict()
for _ in range(n):
    line = input().rsplit(' ', 1)  # Split only once from the right
    item_name = line[0]
    price = int(line[1])
    
    if item_name in items:
        items[item_name] += price
    else:
        items[item_name] = price
for item, total in items.items():
    print(item, total)
