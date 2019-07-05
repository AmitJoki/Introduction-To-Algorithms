def quickSort(arr, p, r):
  if p < r:
    q = partition(arr, p, r)
    quickSort(arr, p, q - 1)
    quickSort(arr, q + 1, r)


def partition(arr, p, r):
  x = arr[r]
  i = p - 1
  for j in range(p, r):
    if arr[j] <= x:
      i = i + 1
      arr[i], arr[j] = arr[j], arr[i]
  arr[i + 1], arr[r] = arr[r], arr[i +1]
  return i + 1

# Run and Output
a = [13,4523,3245,436,2,552]
quickSort(a, 0, len(a) - 1)
print(a) # [2, 13, 436, 552, 3245, 4523]