public class Trees
{
  public Node root;
  
  public boolean isEmpty()
  {
    if(root == null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public int search()
  {
    
  }
  public void inset(String x)
  {
    if(isEmpty())
    {
      root = new Node(x);
    }
    else
    {
      Node temp = root;
      while(temp != null)
      {
        if(temp.getData().equalsIgnoreCase(x) = 0)
        {
          temp.count ++;
          break;
        }
        else if(temp.getData().equalsIgnoreCase(x) < 0)
        {
          temp.setRight(x);
          temp.count ++;
          break;
        }
        else if(temp.getData().equalsIgnoreCase(x) > 0)
        {
          temp.setLeft(x);
          temp.count ++;
          break;
        }
      }
    }
  }
  public void insert(Node r, Node n)
  {
    if(n.getData().compareToIgnoreCase(r.getData()) < 0)
    {
      if(r.left != null)
      {
        insert(r.left, n);
      }
      else
      {
        r.left = n;
        r.left.parent = r;
        r.left ++;
      }
    }
    else if(n.getData().compareToIgnoreCase(r.getData()) > 0)
    {
      if(r.right != null)
      {
        insert(r.right, n);
      }
      else
      {
        r.right = n;
        r.right.parent = r;
        r.right ++;
      }
    }
    else if(n.getData().compareToIgnoreCase(r.getData()) = 0)
    {
      r.count ++;
    }
  }
  public void delete()
  {
    
  }
  public void print(Node z)
  {
    if(z != null)
    {
      print(z.left);
      print(z.right);
    }
  }
}