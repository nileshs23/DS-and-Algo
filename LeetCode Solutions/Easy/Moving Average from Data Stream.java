class MovingAverage {
  
  private int currSum;
  private Queue<Integer> queue;
  private int size;
  
  public MovingAverage(int size) {
    this.currSum = 0;
    this.size = size;
    this.queue = new LinkedList<>();
  }

  public double next(int val) {
    this.queue.add(val);
    this.currSum += val;
    if (this.queue.size() > this.size) {
      this.currSum -= this.queue.remove();
    }
    return ((double) this.currSum) / this.queue.size();
  }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
