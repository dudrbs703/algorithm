# print_6091.py

i, j, k = map(int, input().split())
day = 1
while (day % i != 0) or (day % j != 0) or day % k != 0):
    day +=1
print(day)