# print_6064.py
a, b, c = raw_input().split()
a = int(a)
b = int(b)
c = int(c)

print(min(c, min(a, b)))