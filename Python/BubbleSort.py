def bubbleSort(arr):
  for i in range(1, len(arr)):
    for j in range(len(arr) - 1, 0, -1):
      if arr[j] < arr[j - 1]:
        arr[j], arr[j - 1] = arr[j - 1], arr[j]

# Run
a = [4, 3, 1, 2]
bubbleSort(a)

# Output
print(a) # [1, 2, 3, 4]
