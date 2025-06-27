import numpy as np

class MLP:
    def __init__(self, sizes):
        self.weights = [np.random.randn(y, x) 
                        for x, y in zip(sizes[:-1], sizes[1:])]
        self.biases = [np.random.randn(y, 1) for y in sizes[1:]]

    def feedforward(self, a):
        for b, w in zip(self.biases, self.weights):
            a = sigmoid(w @ a + b)
        return a

    def train(self, X, Y, epochs, lr=0.01):
        # implement gradient descent with backprop
        pass
