def maxHeapify(arr, n, i):
  left = 2 * i
  right = 2 * i + 1
  largest = i

  if left < n and arr[left] > arr[largest]:
    largest = left

  if right < n and arr[right] > arr[largest]:
    largest = right

  if largest != i:
    arr[i], arr[largest] = arr[largest], arr[i]
    maxHeapify(arr, n, largest)


def buildMaxHeap(arr):
  for i in range(len(arr) // 2, -1, - 1):
    maxHeapify(arr, len(arr), i)


def heapSort(arr):
  buildMaxHeap(arr)
  for i in range(len(arr) - 1, -1, -1):
    arr[0], arr[i] = arr[i], arr[0]
    maxHeapify(arr, i, 0)

# Run and Output

sample = [12, 63, 122, 674, 3, 7, 8433, 66, 32, 46, 7, 2, 234, 4]
heapSort(sample)
print(sample)
