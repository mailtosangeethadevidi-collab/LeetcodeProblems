class MyCircularQueue {
     int q[];
    public MyCircularQueue(int k) {
        q=new int[k];  
    }
    int front=-1;
    int rear=-1;
    int size=0;

    
    public boolean enQueue(int value) {

        if(isEmpty()){
             front=(front+1)%q.length; 
             rear=(rear+1)%q.length;
            q[rear]=value;
            size++;
            return true;
        }
        else{
            if(!isFull()){
            rear=(rear+1)%q.length;
            q[rear]=value;
            size++;
            return true;
            }
            else{
                return false;
            }
        }
        
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            front=(front+1)%q.length; 
            size--;
            return true;  
        }
        return false;
        
    }
    
    public int Front() {
        if(!isEmpty())
        return q[front];
        return -1;
        
    }
    
    public int Rear() {
        if(!isEmpty())
        return q[rear];
        return -1;
        
    }
    
    public boolean isEmpty() {
        if(size==0){
            rear=-1;
            front=-1;
            return true;
        }
        else
         return false;
        
    }
    
    public boolean isFull() {
        if(size==q.length){
            return true;
        }
        else
        return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */