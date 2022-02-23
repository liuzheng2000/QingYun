package STUD.LiuZheng.entity;

public abstract class ZkAbstractTemplateLock implements zkLock{
    @Override
    public void zkLock()  {
        if (tryLock()){
            System.out.println(Thread.currentThread().getName() + "\t" + "占用锁成功");
        }else {
            //等锁
            waitZkLock();
            //重新调用
            zkLock();
        }
    }


    public abstract boolean tryLock();

    public abstract void waitZkLock() ;

    @Override
    public void zkUnlock() {

    }


}
