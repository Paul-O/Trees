public class Node
{
  private String data;
  private Node right;
  private Node left;
  private Node parent;
  private int count = 0;
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
  public void setRight(Node r)
  {
    this.right = r;
  }
  public Node getRight()
  {
    return right;
  }
  public void setLeft(Node l)
  {
    this.left = l;
  }
  public Node getLeft()
  {
    return left;
  }
  public void setParent(Node p)
  {
    this.parent = p;
  }
  public Node getParent()
  {
    return parent;
  }
}