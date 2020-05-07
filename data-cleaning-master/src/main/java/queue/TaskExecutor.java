package queue;

import java.util.concurrent.BlockingQueue;

/**
 * @Author twh
 * @Date 2020/4/8 20:17
 */
public class TaskExecutor extends Thread {

    // 在窗口拍的队，这个队里面是办事的人。
    private BlockingQueue<ITask> taskQueue;

    // 这个办事窗口是否在等待着办事。
    private boolean isRunning = true;

    public TaskExecutor(BlockingQueue<ITask> taskQueue) {
        this.taskQueue = taskQueue;
    }

    // 下班。
    public void quit() {
        isRunning = false;
        interrupt();
    }

    @Override
    public void run() {
        while (isRunning) { // 如果是上班状态就待着。
            ITask iTask;
            try {
                iTask = taskQueue.take(); // 叫下一个办事的人进来，没有人就等着。
            } catch (InterruptedException e) {
                if (!isRunning) {
                    // 发生意外了，是下班状态的话就把窗口关闭。
                    interrupt();
                    break; // 如果执行到break，后面的代码就无效了。
                }
                // 发生意外了，不是下班状态，那么窗口继续等待。
                continue;
            }

        }
    }
}
