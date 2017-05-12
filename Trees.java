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
  public Node search(String toFind, Node n)
  {
    if(toFind == n.data)
    {
      return n;
    }
    else if(toFind < n.data)
    {
      return search(toFind, n.left);
    }
    else if(toFind > n.data)
    {
      return search(toFind, n.right);
    }
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
        if(temp.data.equalsIgnoreCase(x) = 0)
        {
          temp.count ++;
          break;
        }
        else if(temp.getData().equalsIgnoreCase(x) < 0)
        {
          temp.right = new Node(x);
          temp.count ++;
          break;
        }
        else if(temp.data.equalsIgnoreCase(x) > 0)
        {
          temp.left = new Node(x);
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
        r.left.count ++;
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
        r.right.count ++;
      }
    }
    else if(n.data.compareToIgnoreCase(r.data) = 0)
    {
      r.count ++;
    }
  }
  public void delete(Node q)
  {
    q = null;
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