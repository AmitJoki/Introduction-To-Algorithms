function bubbleSort(arr) {
  for (let i = 1; i < arr.length - 1; i++) {
    for (let j = arr.length; j > 0; j--) {
      if (arr[j] < arr[j - 1]) {
        [arr[j], arr[j - 1]] = [arr[j - 1], arr[j]];
      }
    }
  }
}

// Run
let a = [4, 3, 1, 2]
bubbleSort(a);

// Output
console.log(a); // [1, 2, 3, 4]