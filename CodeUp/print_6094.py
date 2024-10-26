# print_6094.py

n = int(input())
check = input().split()
minimum = int(check[0])

for i in range(n):
    minimum = min(int(check[i]), minimum)

print(minimum)