function maxHeapify(a, n, i) {
  let left = 2 * i;
  let right = 2 * i + 1;
  let largest = i;

  if (left < n && a[left] > a[largest]) {
    largest = left;
  }
  if (right < n && a[right] > a[largest]) {
    largest = right;
  }
  if (largest != i) {
    [a[i], a[largest]] = [a[largest], a[i]]
    maxHeapify(a, n, largest);
  }
}

function buildMaxHeap(a) {
  for (let i = Math.floor(a.length / 2); i > -1; i--) {
    maxHeapify(a, a.length, i);
  }
}

function heapSort(a) {
  buildMaxHeap(a);
  for (let i = a.length - 1; i > -1; i--) {
    [a[0], a[i]] = [a[i], a[0]];
    maxHeapify(a, i, 0);
  }
}

// Run and Output

let sample = [12, 63, 122, 674, 3, 7, 8433, 66, 32, 46, 7, 2, 234, 4]
heapSort(b)
console.log(b);