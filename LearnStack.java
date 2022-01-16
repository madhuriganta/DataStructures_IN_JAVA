package com.course1;
class MyStack
{
    int MAX=10;
    int top=-1;
    int data[]=new int[MAX];
    boolean isEmpty(){
        return(top==-1);
    }
    public void push(int d)
    {
        data[top+1]=d;
        top=top+1;
    }
    public int peek(){
        return data[top+1];
    }
    public int pop()
    {
        int temp=data[top];
        top=top-1;
        return temp;
    }
    public void printElements()
    {
        for(int i=0;i<=top;i++)
            System.out.println(data[i]);
    }
    public int Size()
    {
        return top+1;
    }
}

public class LearnStack {
    public static void main(String[] args) {
        MyStack ms=new MyStack();
        ms.push(10);
        ms.push(20);
        ms.push(30);
        ms.push(40);

        System.out.println("Elements present in stack :");
        ms.printElements();

        System.out.println(ms.pop()+" Popped element from stack");
        System.out.println("Top Element is: "+ ms.peek());
        System.out.println("Elements present in stack :");
        ms.printElements();
        System.out.println("Size of Stack is: "+ ms.Size());

    }
}
