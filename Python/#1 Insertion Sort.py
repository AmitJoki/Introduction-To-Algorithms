def insertSort(arr):
  for i in range(len(arr)):

    # Pick the key
    key = arr[i]

    # Move the previous element(s)
    # one step ahead at a time
    # if the element is greater than key
    j = i - 1


    while j >= 0 and arr[j] > key:
      arr[j + 1] = arr[j]
      j = j - 1

    # Insert key at the sorted location
    arr[j + 1] = key

# Run
a = [5, 2, 4, 1, 6, 3]
insertSort(a)

# Output
print(a) # [1, 2, 3, 4, 5, 6]