# print_6081.py

a = "B"
# print(int(a, 16))

for i in range(1, 15+1):
    n = format(i, 'x').upper()
    multipy = format(int(n,16) * int(a, 16),'x').upper()
    print(a+"*"+n+"="+multipy)