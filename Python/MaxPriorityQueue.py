from Python.HeapSort import maxHeapify

class MaxPriorityQueue:
  def __init__(self, heap=[]):
    self.heap = heap
    self.heapSize = len(heap)

  def parent(self, i):
    return i // 2

  def maximum(self):
    return self.heap[0]

  def extractMax(self):
    if(self.heapSize < 1):
      raise Exception('Heap Underflow')
    n = self.heapSize - 1
    maxElement = self.maximum()
    self.heap[0] = self.heap[n]
    self.heap.pop() # Remove the element from the heap now that it is extracted
    self.heapSize = self.heapSize - 1
    maxHeapify(self.heap, self.heapSize, 0)
    return maxElement

  def increaseKey(self, i, key):
    if key < self.heap[i]:
      raise Exception('New key is smaller than current key.')
    self.heap[i] = key
    while self.heap[self.parent(i)] < self.heap[i]:
      self.heap[i], self.heap[self.parent(i)] = self.heap[self.parent(i)], self.heap[i]
      i = self.parent(i)

  def insert(self, key):
    self.heapSize = self.heapSize + 1
    self.heap.append(-1)
    self.increaseKey(self.heapSize - 1, key)

  def build(self, arr):
    self.heapSize = 0
    self.heap =[] # Reset when you're building from an array
    for i in range(len(arr)):
      self.insert(arr[i])
