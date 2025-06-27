import curses, time, random

def main(stdscr):
    curses.curs_set(False)
    board = [[0]*10 for _ in range(20)]
    # define pieces, rotations, drawing and game loop...
    while True:
        # move down, accept input, etc.
        time.sleep(0.5)

curses.wrapper(main)
