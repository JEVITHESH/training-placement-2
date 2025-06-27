import re

TOKENS = [(r'\d+', 'NUMBER'), (r'\+', 'PLUS'), (r'\*', 'MUL'),
          (r'\(', 'LP'), (r'\)', 'RP'), (r'set', 'SET'), (r'[a-zA-Z_]\w*', 'VAR')]

def tokenize(code):
    tokens = []
    idx = 0
    while idx < len(code):
        match = None
        for pat, typ in TOKENS:
            m = re.match(pat, code[idx:])
            if m:
                tokens.append((typ, m.group()))
                idx += len(m.group())
                match = True
                break
        if not match:
            idx +=1
    return tokens
