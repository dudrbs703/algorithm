# print_6084.py

hz, bit, channel, sec = map(int, input().split())
size = round(((hz * bit * channel * sec) / 8 / 1024 / 1024), 1)

print('{} MB'.format(size))
