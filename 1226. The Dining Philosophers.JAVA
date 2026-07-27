import java.util.concurrent.locks.ReentrantLock;

class DiningPhilosophers {
    private final ReentrantLock[] forks = new ReentrantLock[5];

    public DiningPhilosophers() {
        for (int i = 0; i < 5; i++) {
            forks[i] = new ReentrantLock();
        }
    }

    
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % 5;

        
        ReentrantLock firstFork = forks[Math.min(leftFork, rightFork)];
        ReentrantLock secondFork = forks[Math.max(leftFork, rightFork)];

        firstFork.lock();
        secondFork.lock();

        try {
            
            pickLeftFork.run();
            pickRightFork.run();
            eat.run();
            putRightFork.run();
            putLeftFork.run();
        } finally {
            secondFork.unlock();
            firstFork.unlock();
        }
    }
}
