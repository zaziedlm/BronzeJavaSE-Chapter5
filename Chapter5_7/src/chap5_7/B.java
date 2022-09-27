package chap5_7;

// クラスA を継承した、クラスB
public class B extends A {

    // このtest()メソッドは、クラスA のメソッド test() をオーバーライド
    // したものなので、ミス防ぐために、アノテーション @Override を付与すると良い
    @Override
    public void test() {
        System.out.println("B");
        
    }
    
}
