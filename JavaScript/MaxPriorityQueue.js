import { maxHeapify } from './HeapSort';

export default class MaxPriorityQueue {
  constructor(heap = []) {
    this.heap = heap;
    this.heapSize = 0;
  }

  parent(i) {
    return Math.floor(i / 2);
  }

  maximum() {
    return this.heap[0];
  }

  extractMax() {
    if (this.heapSize < 1) {
      throw 'Heap Underflow'
    }
    const n = this.heapSize - 1;
    const maxElement = this.maximum();
    this.heap[0] = this.heap[n];
    this.heap.pop();
    this.heapSize -= 1;
    maxHeapify(this.heap, this.heapSize, 0);
    return maxElement;
  }

  increaseKey(i, key) {
    if (key < this.heap[i]) {
      throw 'New key is smaller than current key'
    }
    this.heap[i] = key;
    while (this.heap[this.parent(i)] < this.heap[i]) {
      [this.heap[i], this.heap[this.parent(i)]] = [this.heap[this.parent(i)], this.heap[i]];
      i = this.parent(i);
    }
  }

  insert(key) {
    this.heapSize += 1;
    this.heap.push(-1);
    this.increaseKey(this.heapSize - 1, key);
  }

  build(arr) {
    this.heapSize = 0;
    this.heap = []
    arr.forEach((val) => {
      this.insert(val);
    });
  }
}