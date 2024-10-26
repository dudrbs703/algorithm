# print_6088.py

i, j, k = map(int, input().split())

result = i

for s in range(1, k):
    result += j

print(result)