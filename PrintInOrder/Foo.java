class Foo {
    private final Semaphore semSecond = new Semaphore(0);
    private final Semaphore semThird  = new Semaphore(0);
    
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        semSecond.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        semSecond.acquire();
        printSecond.run();
        semThird.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        semThird.acquire();
        printThird.run();
    }
}
