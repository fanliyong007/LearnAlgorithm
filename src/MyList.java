public class MyList
{
    Node first;
    Node last;
    public void insertHead(Node node)
    {
        Node oldfirst=this.first;
        this.first=new Node();
        this.first.item=node.item;
        this.first.next=oldfirst;
    }
    public void deleteHead()
    {
        this.first.next=this.first;
    }
    public void insertTail(Node node)
    {
        Node oldlast=this.last;
        this.last=new Node();
        this.last.item=node.item;
        oldlast.next=this.last;
    }


}
class Node<Item>
{
    Item item;
    Node next;
}
