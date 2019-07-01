// Ported from source: https://interactivepython.org/runestone/static/pythonds/SortSearch/TheMergeSort.html

export function mergeSort(arr) {
  console.log(`Splitting ${arr}`);
  let n = arr.length;
  if (n > 1) {
    let mid = Math.floor(n / 2);
    let left = arr.slice(0, mid);
    let right = arr.slice(mid, n);
    mergeSort(left);
    mergeSort(right);

    let i = j = k = 0;
    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < left.length) {
      arr[k] = left[i];
      i++;
      k++;
    }

    while (j < right.length) {
      arr[k] = right[j];
      j++;
      k++
    }
    console.log(`Merging ${arr}`);
  }
}

// Run
a = [54, 26, 93, 17, 77, 31, 44, 55, 20];
mergeSort(a);

// Output
console.log(a); // [17, 20, 26, 31, 44, 54, 55, 77, 93]
