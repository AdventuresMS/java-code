public class CircularQueue {
    public static class Cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int [] arr = new int[5];
        public void add(int val){
            if(size == arr.length){
                System.out.println("Array is full");
                return;
            }
            else if(size==0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear< arr.length-1)//normal case{
            {
                arr[++rear] = val;
            }
            else if(rear == arr.length -1)//rear is pointing to last index
            {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int val = arr[front];
                if(front == arr.length-1) front =0;
                else front++;
                size --;
                return val;
           
        }
    }
        public int peek(){
            if(size == 0)
            {
                System.out.println("queue is empty");
                return -1;
            }
            else return arr[front];
        }
        public void display(){
            if(size == 0){
                System.out.println("queu is empty");
                return ;
            }
            else if(front <= rear){
                for(int i = 0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                //rear<front
                for(int i = front;i<arr.length;i++){
                    System.out.print(arr[i]+ ",");
                }
                for(int i =0; i<=rear;i++){
                    System.out.print(arr[i]+",");
                }
            }
            System.out.println();
        }
        public boolean isEmpty()
        {
            if(size == 0)
            return true;
            return false;
        }

    }
    public static void main(String[] args) {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(4);
        q.add(8);
        q.add(19);
        q.display();
        System.out.println(q.remove());
        q.add(5);
        q.add(90);
        q.display();
        q.add(7);
        q.remove();
    }
    
}
