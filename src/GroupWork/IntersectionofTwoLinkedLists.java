package GroupWork;

public class IntersectionofTwoLinkedLists {

    static class Link {
        public int data;
        public Link next;

        //i dont really get this
        public Link(int data) {
            this.data=data;
            this.next=null;
        }

    }
    public Link getIntersectionLink(Link head1,Link  head2){

        while(head1!=null){
            Link temp= head2;
            while(temp !=null){

                //if both are same:
                if(temp==head1){
                    return head1;
                }
                temp=temp.next;
            }
            head1=head1.next;
        }
        //if there is no intersection:
        return null;
    }






    public static void main(String[] args) {
        IntersectionofTwoLinkedLists list = new IntersectionofTwoLinkedLists(); // i dont understand this part

        Link head1;
        Link head2;

        //need two linked lists now
        // list 1 = 3,6,9,15,30
        //list 2 = 10,15,30

        head1 = new Link(3);
        head2 = new Link(10);

        Link newlink = new Link(6);
        head1.next = newlink;

        newlink = new Link(9);
        head1.next.next = newlink;

        //the intersection of the linked lists
        newlink = new Link(15);
        head1.next.next.next = newlink;
        head2.next = newlink;

        //does it matter if we continue with head1 or head2 at this point?
        newlink = new Link(30);
        head1.next.next.next.next = newlink;
        head1.next.next.next.next.next = null;


        //trying with other list to see if it runs now
//        newlink = new Link(30);
//        head2.next.next=newlink;
//        head2.next.next.next=null;

        //now we have our method we are going to make
        Link intersectionPoint = list.getIntersectionLink(head1, head2);


//null check and what we want printed
        if (intersectionPoint == null) {
            System.out.print(" No Intersection Point \n");
        } else {
            System.out.print("Intersection Point: "
                    + intersectionPoint.data);
        }

    }





}
