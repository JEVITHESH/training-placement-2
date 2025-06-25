
def second_largest(numbers):
    unique = list(set(numbers))
    unique.sort()
    return unique[-2]

print(second_largest([10, 20, 4, 45, 99, 99]))
