# print_6057.py

a, b = input().split()
c = bool(int(a))
d = bool(int(b))
if (not c and not d) or (c and d) :
    print("True")
else: print("False")
