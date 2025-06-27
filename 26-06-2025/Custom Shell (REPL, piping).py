import os, sys, shlex
from subprocess import Popen, PIPE

def shell():
    while True:
        cmd = input("$ ")
        if cmd in ("exit", "quit"):
            break
        parts = [p.strip() for p in cmd.split("|")]
        prev = None
        for part in parts:
            args = shlex.split(part)
            proc = Popen(args, stdin=prev, stdout=PIPE)
            if prev:
                prev.stdout.close()
            prev = proc
        output, _ = proc.communicate()
        print(output.decode(), end="")

if __name__ == "__main__":
    shell()
