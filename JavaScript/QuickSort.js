export default function quickSort(arr, p, r) {
  if (p < r) {
    const q = partition(arr, p, r);
    quickSort(arr, p, q - 1);
    quickSort(arr, q + 1, r);
  }
}

export function partition(arr, p, r) {
  const x = arr[r];
  let i = p - 1;
  for (let j = p; j < r; j++) {
    if (arr[j] <= x) {
      i += 1;
      [arr[i], arr[j]] = [arr[j], arr[i]];
    }
  }
  [arr[i + 1], arr[r]] = [arr[r], arr[i + 1]];
  return i + 1;
}

// Run and Output
let a = [13, 4523, 3245, 436, 2, 552];
quickSort(a, 0, a.length - 1);
console.log(a);  // [2, 13, 436, 552, 3245, 4523]