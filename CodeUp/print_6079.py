# print_6079.py

startn = int(input())
a = 0
count = 0

for i in range(startn):
    count = i
    a+=i
    if(a >= startn):
        break
print(count)