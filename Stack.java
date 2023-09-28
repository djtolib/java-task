public class Stack {

  private final Object[] buf;
  private int position;

  public Stack(int size) {
    buf = new Object[size];
  }

  public void push(Object o) {
    if (position > buf.length - 1) throw new StackOverflowException();
    buf[position++] = o;
  }

  public Object pop() {
    if (position <= 0) return null;
    Object res = buf[--position];
    buf[position] = null;
    return res;
  }

  public boolean isEmpty() {
    return (position == 0);
  }

  public boolean equals(Stack o) {
    if(this == o) return true;
    return Arrays.equals(buf, o.buf);
  }
  
}

// Такого эксепшна нет, решил свой определить :)
class StackOverflowException extends RuntimeException{}
