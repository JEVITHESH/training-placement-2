import random, pickle

Q = {}  # state-action value

def choose_action(state, eps=0.1):
    if random.random() < eps or state not in Q:
        return random.choice(valid_moves(state))
    return max(Q[state], key=Q[state].get)

def update_Q(prev, action, reward, curr, lr=0.1, gamma=0.9):
    prev_Q = Q.setdefault(prev, {a:0 for a in valid_moves(prev)})
    curr_Q = Q.setdefault(curr, {a:0 for a in valid_moves(curr)})
    prev_Q[action] += lr * (reward + gamma*max(curr_Q.values()) - prev_Q[action])
