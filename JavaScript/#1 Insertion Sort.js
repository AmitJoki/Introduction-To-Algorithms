// Insertion Sort

function insertSort(arr) {
  for (let i = 1; i < arr.length; i++) {

    // Pick the key
    let key = arr[i];

    // Move the previous element(s)
    // one step ahead at a time
    // if the element is greater than key
    let j = i - 1;
    while (j >= 0 && arr[j] > key) {
      arr[j + 1] = arr[j];
      j = j - 1;
    }

    // Insert key at the sorted location
    arr[j + 1] = key;
  }
}

// Run
let a = [5, 2, 4, 1, 6, 3];
insertSort(a);

// Output
console.log(a); // [1, 2, 3, 4, 5, 6]