# print_6092.py

time = int(input())

check = input().split()
student_list = []

for i in range(24): 
    student_list.append(0)

for i in range(time):
    check[i] = int(check[i])

for i in range(0, len(check)):
    student_list[check[i]] += 1
    
for i in range(1, 24):
    print(student_list[i], end=' ')