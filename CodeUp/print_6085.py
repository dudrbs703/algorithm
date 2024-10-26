# print_6085.py

width, height, bit = map(int, input().split())
size = round(((width * height * bit) / 8 / 1024 / 1024), 2)

print('{:.2f} MB'.format(size))
