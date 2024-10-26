# print_6090.py

i, j, k, l = map(int, input().split())

result = i

for s in range(1, l):
    result *= j
    result += k

print(result)
