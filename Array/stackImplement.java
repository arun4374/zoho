public class stackImplement {
   static class Stack {
       int size = 1000;
       int[] arr = new int[size];
       int top=-1;
       void push(int n){
           top++;
           arr[top]=n;
       }
       int pop(){
           int x= arr[top];
           top--;
           return x;
       }
       int top(){
           return arr[top];
       }
       int size(){
           return top+1;
       }
       String empty(){
           if(top<0) return "Stack is Empty";
           return "Stack is not Empty";
       }
        public static void main(String[] args) {
            Stack st = new Stack();

            st.push(1);
            st.push(2);
            st.push(3);

            System.out.println("Before removing element : "+st.size());
            System.out.println("Top of the Element : "+st.top());
            System.out.println("Remove top element : "+st.pop());
            System.out.println("After remove top Element : "+st.size());
            System.out.println(st.empty());
        }
    }
}
