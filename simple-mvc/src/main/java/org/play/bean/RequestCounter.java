package org.play.bean;

public class RequestCounter{
    private int count;
    private int _max_count;

    public void set_max_count(int _max_count) {
        this._max_count = _max_count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // 计数器方法
    public boolean isReachable(){
        synchronized (this){
            return count++ < _max_count;
        }
    }
}
