# Note: In the book, the Divide and Conquer method is used which is O(n logn)
# while the below is in linear time, hence this implementation is chosen.

# See: Kadane's Algorithm (https://en.wikipedia.org/wiki/Maximum_subarray_problem)

def maxSubArray( row ):
    largest_ending_here = 0
    best_start = start = end = best_so_far = 0
    for i, x in enumerate( row ):
        largest_ending_here += x
        best_so_far = max( best_so_far, largest_ending_here )
        if largest_ending_here <= 0:
            # We don't want the sum to be decreasing
            # so we reset it and assume the start
            # to be from the next element's index
            start = i + 1
            largest_ending_here = 0

        elif largest_ending_here == best_so_far:
            best_start = start
            end = i + 1 # the +1 is to have 'end' be exclusive

    return best_so_far, best_start, end

# Run and Output
a = [13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7]
print(maxSubArray(a))