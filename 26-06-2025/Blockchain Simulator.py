import hashlib, time

class Block:
    def __init__(self, index, prev_hash, data, nonce=0):
        self.index = index
        self.prev_hash = prev_hash
        self.data = data
        self.nonce = nonce
        self.timestamp = time.time()
        self.hash = self.compute_hash()

    def compute_hash(self):
        s = f"{self.index}{self.prev_hash}{self.data}{self.nonce}{self.timestamp}"
        return hashlib.sha256(s.encode()).hexdigest()

    def mine(self, difficulty):
        target = '0' * difficulty
        while not self.hash.startswith(target):
            self.nonce += 1
            self.hash = self.compute_hash()

