class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def is_balanced(root):
    if not root:
        return True

    def height(node):
        if not node:
            return 0
        return 1 + max(height(node.left), height(node.right))

    return abs(height(root.left) - height(root.right)) <= 1

root = Node(1)
root.left = Node(2)
root.right = Node(3)
print(is_balanced(root))
