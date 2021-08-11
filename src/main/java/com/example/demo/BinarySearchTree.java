package com.example.demo;

public class BinarySearchTree {
          Node root;

            public class Node {
                int data;
                Node right, left;

                public Node(int data) {
                    this.data = data;
                    this.right = null;
                    this.left = null;
                }
            }

        public  void insert(int data){
           root=inserthelp(root,data);

        }

        public Node inserthelp(Node root,int data){
            if(root==null){
                root=new Node(data);
                return root;
            }
            if(data<root.data){
                root.left=inserthelp(root.left,data);

            }else if(data>root.data){
                root.right=inserthelp(root.right,data);
            }
            return root;

        }


            public Node search(Node root,int data){
                if(root!=null &&root.data==data){
                    return root;
                }
                if(data<root.data){
                    return search(root.left,data);
                }
                return search(root.right,data);

            }

            public void   delete(int data){
                root=deletehelper(root,data);

            }

            public Node deletehelper(Node root,int data){
                if(root==null){
                    return root;
                }
                if(data<root.data){
                    root.left=deletehelper(root.left,data);
                }else if(data>root.data){
                    root.right=deletehelper(root.right,data);
                }else{
                    if(root.left==null&&root.right==null){
                        return null;
                    }else if(root.left==null){
                        return root.right;
                    }else if(root.right==null){
                        return root.left;
                    }else{
                        int minvalue=root.right.data;
                        root.data=minvalue;
                        root.right=deletehelper(root.right,minvalue);

                    }
                }
                return root;
            }

  public static void duplicatemain(){
      BinarySearchTree btlist=new BinarySearchTree();
      btlist.insert(7);
      btlist.insert(9);
      btlist.insert(4);
      btlist.insert(8);
      btlist.insert(5);
      System.out.println("The element is :  "+btlist.search(btlist.root,8).data);
      btlist.delete(7);
  }
}
