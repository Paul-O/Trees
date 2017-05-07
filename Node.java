public class Node
{
  private String data;
  private Node next;
  public Node(String data)
  {
    this.data = data;
  }
  public void setData(String d)
  {
    this.data = d;
  }
  public String getData()
  {
    return data;
  }
  public void setNext(Node n)
  {
    this.next = n;
  }
  public Node getNext()
  {
    return next;
  }
}