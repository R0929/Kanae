class SwitchTest2{

  public static void main(String[] args) {

	int lot = 3;	//変数lotに10を代入
	switch(lot){	//switch文の条件でlotを判定

      //該当するcase値の文を実行
      case 1: System.out.println("叶が当選!"); //break;
      case 2: System.out.println("叶が当選!"); //break;
      case 3: System.out.println("叶が当選!"); //break;
      case 4: System.out.println("叶が当選!"); //break;
      default: System.out.println("はずれです。"); //break;
    }
  }
}
