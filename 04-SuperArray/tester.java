public class tester{
  public static void main(String args[]){
  System.out.println("MR. K'S TESTS ");

  SuperArray alist = new SuperArray();
  alist.add("Mario");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());

  alist.add("Samus");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());

  alist.add("Ash");
  alist.add("Link");
  alist.add("Kirby");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());

//------------------------------------------------------------------------------

  System.out.println("");
  System.out.println("PHASE 2 tests");
  SuperArray blist = new SuperArray();
  blist.add("gamma");
  blist.add("alpha");
  blist.add("beta");
  blist.add("theta");
  blist.add("phi");
  //test1
  for(int i =0; i <blist.size(); i ++){
    System.out.println(blist.get(i));
  }
  //test2
  for(int i =0; i <blist.size(); i ++){
    blist.set(i, " wus gud g ");
  }
  System.out.println(blist);
  //test3
  SuperArray clist = new SuperArray();
  clist.add("gamma");
  clist.add("alpha");
  clist.add("beta");
  clist.add("theta");
  clist.add("phi");
  for(int i =0; i <clist.size()-1; i ++){
      clist.set(i, clist.get(i+1));
    }
  clist.set(clist.size()-1, "NOPE!");
  System.out.println(clist);

  System.out.println("");
  System.out.println("PHASE 3 tests");
  clist.resize();
  System.out.println(clist);
  for(int i =0; i <clist.size()-1; i ++){
      clist.set(i, clist.get(i+1));
    }
    System.out.println(clist);
// works perfectly



}
}
