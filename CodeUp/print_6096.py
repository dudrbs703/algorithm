board = [list(map(int, input().split())) for _ in range(1, 20)]

time = int(input())
for i in range(time):
    x, y = map(int, input().split())
    for j in range(19):
        if board[j][y-1] == 0:
            board[j][y-1] = 1
        else: board[j][y-1] = 0
        
        if board[x-1][j] == 0:
            board[x-1][j] = 1
        else: board[x-1][j] = 0

for i in range(len(board)):
    for j in range(len(board)):
        print(board[i][j], end=' ')
    print()