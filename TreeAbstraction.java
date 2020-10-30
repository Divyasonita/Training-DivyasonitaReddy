abstract class Tree {
 abstract void treeType();
 abstract void treeGrowth();

  Tree(){
 System.out.println("Types of trees");
 }
 Tree(String type){
  System.out.println("Tree type is "+type);
 }
}

class Deciduous extends Tree {
  void treeType() {
   System.out.println("Deciduous trees are flower plants");
  }
  void treeGrowth() {
   System.out.println("These are the gaint flower plants");
  }
}

class Coniferous extends Tree {
 
  void treeType() {
   System.out.println("Coniferous tress are  a subset of gymnosperms");
  }
  void treeGrowth() {
   System.out.println("They are cone-bearing plants");
  }
}

class TreeAbstraction {
  public static void main(String[] args) {
    Tree gender = new Deciduous();
    gender.treeType();
    gender.treeGrowth();
    gender= new Coniferous();
    gender.treeType();
    gender.treeGrowth();
    
  }
}