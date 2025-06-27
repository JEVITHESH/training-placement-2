def solve(board):
    empty = find_empty(board)
    if not empty:
        return True
    r, c = empty
    for num in range(1, 10):
        if valid(board, num, (r, c)):
            board[r][c] = num
            if solve(board):
                return True
            board[r][c] = 0
    return False
