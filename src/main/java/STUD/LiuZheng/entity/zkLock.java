package STUD.LiuZheng.entity;

public interface zkLock {

    public void zkLock() throws InterruptedException;

    public void zkUnlock();

}
