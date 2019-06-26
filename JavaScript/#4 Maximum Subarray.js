// Note: In the book, the Divide and Conquer method is used which is O(n logn)
// while the below is in linear time, hence this implementation is chosen.

// See: Kadane's Algorithm (https://en.wikipedia.org/wiki/Maximum_subarray_problem)

// Helper function for max

function max(arr) {
  return Math.max.apply(null, arr);
}

function maxSubArray( arr ) {
  let sumUntilNow = 0;
  let bestStart = start = end = bestSoFar = 0;
  arr.forEach((val, idx) => {
    sumUntilNow += val;
    bestSoFar = max([bestSoFar, sumUntilNow]);
    if(sumUntilNow <= 0) {
      // We don't want the sum to be decreasing
      // so we reset it and assume the start
      // to be from the next element's index
      start = idx + 1;
      sumUntilNow = 0;
    } else if (sumUntilNow === bestSoFar) {
      bestStart = start;
      end = idx + 1; // exclusive
    }
  });
  return [bestSoFar, bestStart, end]
}

// Run and Output
a = [13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7]
console.log(maxSubArray(a))